package com.example.ashutosh.worldscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textViewResult;
    EditText editTextWord;
    Button resultButton;
    char[] letter;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextWord=(EditText)findViewById(R.id.edit_text_word);
        textViewResult=(TextView)findViewById(R.id.text_view_result);
        resultButton=(Button)findViewById(R.id.check_score_button);

        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkWordScore();
                score=0;

            }
        });

    }



    public void checkWordScore()
    {
        String word=editTextWord.getText().toString();
        char[] letter=new char[word.length()];
        for(int i=0;i<word.length();i++)
        {

            letter[i]=word.charAt(i);
            switch (letter[i])
            {
                case ('F'):
                {
                      score=score+3;
                }
                    break;
                case ('J'):
                {
                    score=score+6;
                }
                break;
                case ('X'):
                {
                    score=score+12;
                }
                break;
                case ('A'):
                {
                    score=score+2;
                }
                break;
                case ('E'):
                {
                    score=score+2;
                }
                break;
                case ('I'):
                {
                    score=score+2;
                }
                break;
                case ('O'):
                {
                    score=score+2;
                }
                break;
                case ('U'):
                {
                    score=score+2;
                }
                break;
                case ('T'):
                {
                    score=score+5;
                }
                break;

                default:{
                    score=score+0;
                }

            }
        }
        textViewResult.setText(""+score);
    }
}
