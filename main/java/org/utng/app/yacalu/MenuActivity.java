package org.utng.app.yacalu;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MenuActivity extends AppCompatActivity {

    private ImageButton btnWr;
    private ImageButton btnLvEnglish;
    private ImageButton btnGra;
    private ImageButton btnTa;
    private ImageButton btnVoc;
    private ImageButton btnOr;
    private ImageButton btnAd;
    private ImageButton btnOb;
    private ImageButton btnConet;
    private ImageButton btnFig;
    private ImageButton btnPres;
    private ImageButton btnCond;
    private ImageButton btnExp;
    private ImageButton btnUr;
    private ImageButton btnQuiz;
    private ImageButton btnInfo;
    private Button btnFace;
    private Button btnYou;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_menu);

        btnWr = (ImageButton) findViewById(R.id.btn_writing);
        btnWr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), WritingReportsActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        btnLvEnglish = (ImageButton) findViewById(R.id.btn_verbs);
        btnLvEnglish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), VerbsListActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        btnGra= (ImageButton) findViewById(R.id.btn_grammar);
        btnGra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), GrammarActivity.class);
                startActivityForResult(intent, 0);
            }
        });


        btnTa= (ImageButton) findViewById(R.id.btn_adjectives);
        btnTa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), ListAdjectivesActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        btnVoc= (ImageButton) findViewById(R.id.btn_vocabulary);
        btnVoc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),MainVocabularyActivity.class);
                startActivityForResult(intent, 0);
            }
        });


        btnOr= (ImageButton) findViewById(R.id.btn_sentences);
       btnOr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), GameComplementationActivity.class);
                startActivityForResult(intent, 0);
            }
        });

       btnAd= (ImageButton) findViewById(R.id.btn_Memory);
       btnAd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MemoActivity.class);
                startActivityForResult(intent, 0);
            }
        });


        btnOb= (ImageButton) findViewById(R.id.btn_objetss);
        btnOb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), EntryActivity.class);
                startActivityForResult(intent, 0);
            }
        });


        btnConet = (ImageButton) findViewById(R.id.btn_conect);
        btnConet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), ProcesoConecActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        btnFig= (ImageButton) findViewById(R.id.btn_figures);
        btnFig.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), FigureActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        btnPres= (ImageButton) findViewById(R.id.btn_pre);
        btnPres.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), TipsActivity.class);
                startActivityForResult(intent, 0);
            }
        });


        btnCond= (ImageButton) findViewById(R.id.btn_condicionalss);
        btnCond.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), CondicionalsActivity.class);
                startActivityForResult(intent, 0);
            }
        });


       btnExp= (ImageButton) findViewById(R.id.btn_expressions);
        btnExp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), BusinessEnglishActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        btnUr= (ImageButton) findViewById(R.id.btn_urls);
        btnUr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MusicUrlActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        btnQuiz= (ImageButton) findViewById(R.id.btn_quiz);
        btnQuiz.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), QuizActivity.class);
                startActivityForResult(intent, 0);
            }
        });


        btnInfo= (ImageButton) findViewById(R.id.btn_info);
        btnInfo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), CreditsActivity.class);
                startActivityForResult(intent, 0);
            }
        });



       btnFace = (Button) findViewById(R.id.btn_Fb);
        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), FacebookActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        btnYou = (Button) findViewById(R.id.btn_youtube);
        btnYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), YoutubeActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }



    @Override
    public void onBackPressed() {
        Intent i = new Intent(MenuActivity.this, SplashActivity.class);
        startActivity(i);
        finish();
    }
}

