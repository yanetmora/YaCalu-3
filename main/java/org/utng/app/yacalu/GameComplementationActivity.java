package org.utng.app.yacalu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.utng.app.yacalu.R;
import org.utng.app.yacalu.completeSentences.SentencesBehindActivity;
import org.utng.app.yacalu.completeSentences.SentencesInFrontActivity;
import org.utng.app.yacalu.completeSentences.SentencesNextToActivity;
import org.utng.app.yacalu.completeSentences.SentencesOnActivity;
import org.utng.app.yacalu.completeSentences.SentencesUnderActivity;

import java.util.Random;

public class GameComplementationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_complementation);

        Button myButton = (Button) findViewById(R.id.btn_try);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Here, we are generating a random number
                Random generator = new Random();
                int number = generator.nextInt(5) + 1;
                // The '5' is the number of activities

                Class activity = null;

                // Here, we are checking to see what the output of the random was
                switch(number) {
                    case 1:
                        // E.g., if the output is 1, the activity we will open is ActivityOne.class
                        activity = SentencesUnderActivity.class;
                        break;
                    case 2:
                        activity = SentencesOnActivity.class;
                        break;
                    case 3:
                        activity = SentencesInFrontActivity.class;
                        break;
                    case 4:
                        activity = SentencesBehindActivity.class;
                        break;
                    default:
                        activity = SentencesNextToActivity.class;
                        break;
                }
                // We use intents to start activities
                Intent intent = new Intent(getBaseContext(), activity);
                startActivity(intent);

            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
        finish();
    }
}
