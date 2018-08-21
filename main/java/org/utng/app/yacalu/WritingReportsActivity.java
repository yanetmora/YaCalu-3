package org.utng.app.yacalu;

import android.app.Activity;
        import android.net.Uri;
        import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import org.utng.app.yacalu.R;

public class WritingReportsActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing_reports);
        VideoView videoView = findViewById(R.id.videoView_video);
        Uri path = Uri.parse("android.resource://integradora.ingenieria.yacalu.yacalu1/"+ R.raw.writing_reports);
        //+ R.raw.writing_reports 2131427328
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(path);
        videoView.start();

    }
}



