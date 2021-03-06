package org.utng.app.yacalu.objects;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import org.utng.app.yacalu.MenuActivity;
import org.utng.app.yacalu.R;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CelphoneActivity extends  AppCompatActivity implements View.OnClickListener{
    private ImageButton btnCelphone;
    private Button btnNext;
    private Button btnPrevious;

    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private  int celphone;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celphone);

        btnCelphone= (ImageButton)findViewById(R.id.btn_celphone);
        btnNext = (Button) findViewById(R.id.btn_nextcel);
        btnPrevious = (Button) findViewById(R.id.btn_previouscel);


        btnCelphone.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnPrevious .setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        celphone = soundPool.load(this, R.raw.celphone,1);
        mediaPlayer = new MediaPlayer();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_celphone:
                soundPool.play(celphone, 1, 1,0,0,1);
                break;
            case R.id.btn_nextcel:
                Intent i = new Intent(this, ChairActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.btn_previouscel:
                Intent in = new Intent(this, CameraActivity.class);
                startActivity(in);
                finish();
                break;
            default:
                break;


        }
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
        finish();
    }

}