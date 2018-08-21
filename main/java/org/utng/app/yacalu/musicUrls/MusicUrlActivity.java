package org.utng.app.yacalu.musicUrls;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.utng.app.yacalu.R;

/**
 * Created by yanet on 20/08/2018.
 */

public class MusicUrlActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNavegation;
    private Button btnNavegacionLetter;
    private Button btnSongs;
    private Button btnLetter;
    private Button btnSongsLetter;
    private Button btnOf;
    private Button btnletterOf;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_url);
        btnNavegation=(Button)findViewById(R.id.btn_navegation);
        btnNavegacionLetter=(Button)findViewById(R.id.btn_navegacion_letter);
        btnSongs=(Button)findViewById(R.id.btn_songs);
        btnLetter=(Button)findViewById(R.id.btn_trasnslate);
        btnSongsLetter=(Button)findViewById(R.id.btn_letter_songs);
        btnOf=(Button)findViewById(R.id.btn_of);
        btnletterOf=(Button)findViewById(R.id.btn_letter_of_songs);

        btnNavegation.setOnClickListener(this);
        btnNavegacionLetter.setOnClickListener(this);
        btnSongs.setOnClickListener(this);
        btnLetter.setOnClickListener(this);
        btnSongsLetter.setOnClickListener(this);
        btnOf.setOnClickListener(this);
        btnletterOf.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        //El brindamos el dato necesario a Uri
        int fuente;
        fuente = v.getId();
        String pagina_carga = "http://www.google.com";
        switch (fuente){
            case R.id.btn_navegation:
                pagina_carga="https://www.letraseningles.es/letrascanciones/traduccionesAC/letrasAC.html";
                break;
            case R.id.btn_navegacion_letter:
                pagina_carga="https://www.letraseningles.es/";
                break;
            case R.id.btn_songs:
                pagina_carga="https://www.musica.com/letras.asp?letra=1281045";
                break;
            case R.id.btn_trasnslate:
                pagina_carga="https://www.songstraducidas.com/";
                break;
            case R.id.btn_letter_songs:
                pagina_carga="http://noticias.universia.es/educacion/noticia/2015/05/12/1124816/aprende-english-escuchando-canciones-beatles.html";
                break;
            case R.id.btn_of:
                pagina_carga="https://elblogdeidiomas.es/10-canciones-para-mejorar-tu-english-a1-a2/";
                break;
            case R.id.btn_letter_of_songs:
                pagina_carga="https://englishlive.ef.com/es-es/blog/english-para-el-mundo-real/mejores-canciones-aprender-english/";
                break;



        }


        Uri uriUrl = Uri.parse(pagina_carga);
        //Especificamos la accion a realizar con el ACTION_VIEW
        //para que elija lo mas razonable
        Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(intent);



    }

}



