package org.utng.app.yacalu.jobInterviewTips;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import org.utng.app.yacalu.R;

/**
 * Created by yanet on 20/08/2018.
 */

public class TipsActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        VideoView videoView = findViewById(R.id.videoView_tips);
        Uri path = Uri.parse("android.resource://integradora.ingenieria.yacalu.yacalu1/"+R.raw.english);
        //
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(path);
        videoView.start();

    }
}
