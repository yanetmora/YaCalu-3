package org.utng.app.yacalu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.utng.app.yacalu.businessTips.BusinessTipsPracticActivity;
import org.utng.app.yacalu.businessTips.BusinessTipsProgramsActivity;
import org.utng.app.yacalu.businessTips.BusinessTipsReadActivity;
import org.utng.app.yacalu.businessTips.BusinessTipsSentenActivity;
import org.utng.app.yacalu.businessTips.BusinessTipsSituationsActivity;
import org.utng.app.yacalu.businessTips.BusinessTipsVocabularyctivity;

public class BusinessEnglishActivity extends AppCompatActivity {

    private ImageView tipRead;
    private ImageView tipProg;
    private ImageView tipVocab;
    private ImageView tipSenten;
    private ImageView tipPrac;
    private ImageView tipSituations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_english);


        tipRead = (ImageView) findViewById(R.id.iv_tip_read);
        tipRead.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), BusinessTipsReadActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        tipProg = (ImageView) findViewById(R.id.iv_tip_programs);
        tipProg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), BusinessTipsProgramsActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        tipVocab = (ImageView) findViewById(R.id.iv_tip_vocab);
        tipVocab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),  BusinessTipsVocabularyctivity.class);
                startActivityForResult(intent, 0);
            }
        });
        tipSenten= (ImageView) findViewById(R.id.iv_tip_senten);
        tipSenten.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),  BusinessTipsSentenActivity.class);
                startActivityForResult(intent, 0);
            }
        });
       tipPrac = (ImageView) findViewById(R.id.iv_tip_pract);
        tipPrac.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),  BusinessTipsPracticActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        tipSituations = (ImageView) findViewById(R.id.iv_tip_situations);
        tipSituations.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),  BusinessTipsSituationsActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
