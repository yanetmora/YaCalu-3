package org.utng.app.yacalu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.utng.app.yacalu.quiz.ScoreActivity;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView ScoreView;
    private TextView QuestionView;
    private Button ButtonChoiceOne;
    private Button ButtonChoiceTwo;
    private Button ButtonChoiceThree;
    private Button Quit;
    private int arregloPreg[];


    private String Answer;
    private int Score = 0;
    private int QuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ScoreView = (TextView)findViewById(R.id.txt_score);
        QuestionView = (TextView)findViewById(R.id.txt_question);
        ButtonChoiceOne = (Button)findViewById(R.id.btn_choice_one);
        ButtonChoiceTwo = (Button)findViewById(R.id.btn_choice_two);
        ButtonChoiceThree = (Button)findViewById(R.id.btn_choice_three);
        Quit = (Button)findViewById(R.id.btn_quit);
        arregloPreg=new int[5];

        Quit.setEnabled(false);

        Quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savePoints();
            }
        });


        updateQuestion();

        //Start of Button Listener for Button1
        ButtonChoiceOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (ButtonChoiceOne.getText() == Answer){
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(QuizActivity.this, "Correcta", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "Incorrecta", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        ButtonChoiceTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (ButtonChoiceTwo.getText() == Answer){
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(QuizActivity.this, "Correcta", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "Incorrecta", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        ButtonChoiceThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (ButtonChoiceThree.getText() == Answer){
                    Score = Score + 1;
                    updateScore(Score);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(QuizActivity.this, "Correcta", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(QuizActivity.this, "Incorrecta", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button3


    }


    private void updateQuestion()
    {
        try {

            generaArregloNum();
            QuestionView.setText(mQuestionLibrary.getQuestion(arregloPreg[QuestionNumber]));
            ButtonChoiceOne.setText(mQuestionLibrary.getChoiceOne(arregloPreg[QuestionNumber]));
            ButtonChoiceTwo.setText(mQuestionLibrary.getChoiceTwo(arregloPreg[QuestionNumber]));
            ButtonChoiceThree.setText(mQuestionLibrary.getChoiceThree(arregloPreg[QuestionNumber]));

            Answer = mQuestionLibrary.getCorrectAnswer(arregloPreg[QuestionNumber]);
            QuestionNumber++;

            if(QuestionNumber>5){
                Toast.makeText(QuizActivity.this, "haz terminado", Toast.LENGTH_LONG).show();
                ButtonChoiceOne.setEnabled(false);
                ButtonChoiceTwo.setEnabled(false);
                ButtonChoiceThree.setEnabled(false);
                Quit.setEnabled(true);
            }




        }catch (Exception e){
            ButtonChoiceOne.setEnabled(false);
            ButtonChoiceTwo.setEnabled(false);
            ButtonChoiceThree.setEnabled(false);
            Quit.setEnabled(true);
            Toast.makeText(QuizActivity.this, "Haz terminado el test", Toast.LENGTH_LONG).show();

        }
    }

    private void savePoints() {
        ScoreView.setText("" + Score);
        //Para poder lanzar otra activity se utiliza la clase Intent
        Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
        //Creamos la información en un Bundle
        Bundle b = new Bundle();
        b.putString("puntos", ScoreView.getText().toString());

        //Se añade la información al Intent
        intent.putExtras(b);
        startActivity(intent); // Se inicia la otra Activity
        finish();

    }


    private void updateScore(int point) {
        ScoreView.setText("" + Score);

    }

    private void generaArregloNum(){
        for(int i=0;i<arregloPreg.length;i++){
            // Producir nuevo int aleatorio entre 0 y 99
            int intAletorio=(int)(Math.random()*9)+1;
            for (int j=0;j<i;j++){
                if (arregloPreg[j]==intAletorio)
                    intAletorio=(int)(Math.random()*9)+1;
            }
            arregloPreg[i]=intAletorio;
            System.out.println(arregloPreg[i]);

        }
    }

}