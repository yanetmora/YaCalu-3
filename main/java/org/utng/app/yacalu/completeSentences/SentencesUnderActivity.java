package org.utng.app.yacalu.completeSentences;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.TextView;

import org.utng.app.yacalu.GameComplementationActivity;
import org.utng.app.yacalu.R;

import org.w3c.dom.Text;

public class SentencesUnderActivity extends AppCompatActivity {
    Text editComplete;
    String strInput;
    private Button btnCheck, btnNxt;
    private Button btnMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentences_under);


        final Button btn_next = (Button) findViewById(R.id.btn_nxt);
        btn_next.setEnabled(false); //Asigna valor false.

        btnCheck = (Button) findViewById(R.id.btn_check);
        btnCheck.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {


                TextView TEXT = (TextView) findViewById(R.id.tv_res);
                EditText squareText = (EditText) findViewById(R.id.et_complete);

                if(squareText.getText().toString().toLowerCase().equals("under")){
                    TEXT.setText(R.string.respco); btn_next.setEnabled(true);
                }else{
                    TEXT.setText(R.string.resinco);

                }





            }

        });

        btnNxt = (Button) findViewById(R.id.btn_nxt);
        btnNxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), SentencesInFrontActivity.class);
                startActivityForResult(intent, 0);
            }

        });

        btnMenu = (Button) findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), GameComplementationActivity.class);
                startActivityForResult(intent, 0);
            }

        });
    }


}