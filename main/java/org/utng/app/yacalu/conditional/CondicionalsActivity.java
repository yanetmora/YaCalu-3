package org.utng.app.yacalu.conditional;

/**
 * Created by yanet on 20/08/2018.
 */

public class CondicionalsActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicionals);
        VideoView videoView = findViewById(R.id.videoView_conditi);
        Uri path = Uri.parse("android.resource://integradora.ingenieria.yacalu.yacalu1/"+R.raw.conditionals);
        //
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(path);
        videoView.start();

    }
}

