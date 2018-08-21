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

/**
 * Created by yanet on 20/08/2018.
 */

public class TypewriterActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnType;
    private Button btnNext;
    private Button btnPrevious;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typewriter);


        btnType = (ImageButton) findViewById(R.id.btn_ty);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnPrevious = (Button) findViewById(R.id.btn_previous);


        btnType.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnPrevious.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        type = soundPool.load(this, R.raw.bed,1);
        mediaPlayer = new MediaPlayer();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ty:
                soundPool.play(type, 1, 1,0,0,1);
                break;
            case R.id.btn_next:
                Intent i = new Intent(this, MenuActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.btn_previous:
                Intent in = new Intent(this, TableActivity.class);
                startActivity(in);
                finish();
                break;
            default:
                break;


        }
    }

}

