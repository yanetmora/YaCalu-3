package org.utng.app.yacalu.figuresGeometric;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.utng.app.yacalu.MenuActivity;
import android.widget.ImageButton;

import org.utng.app.yacalu.R;


public class FigureActivity extends AppCompatActivity {

    private ImageButton btnFigure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figure);
        btnFigure = (ImageButton) findViewById(R.id.btn_figures);

        btnFigure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(org.utng.app.yacalu.figuresGeometric.FigureActivity.this,CircleActivity.class);
                startActivity(i);
            }
        });
    }
}