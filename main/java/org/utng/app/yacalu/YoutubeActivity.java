package org.utng.app.yacalu;


import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.utng.app.yacalu.R;

public class YoutubeActivity extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);


        // Definimos el webView
        WebView browser = (WebView) findViewById(R.id.wv_youtube_view);

        browser.setWebViewClient(new WebViewClient() {



            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        WebView.setWebContentsDebuggingEnabled(false);
        // Cargamos la web
        browser.loadUrl("https://www.youtube.com/channel/UCvdCe-fFuB7r8V9ftwU5ITA");



    }
}
