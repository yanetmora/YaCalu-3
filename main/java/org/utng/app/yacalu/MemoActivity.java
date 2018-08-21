package org.utng.app.yacalu;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import org.utng.app.yacalu.R;

import java.util.Random;

public class MemoActivity extends AppCompatActivity implements View.OnClickListener  {
    boolean banOk= false;
    Button btnIniciar;
    EditText txtPuntos;
    EditText txtTiros;
    ImageButton[] tablero=new ImageButton[20];
    int[] tarjetas=new int[20];
    int[] datos= new int[20];
    int click=0;
    int puntos=0;
    int pos1;//posición del primer click
    int pos2;//posición del segundo click
    boolean[] bloqueadas = new boolean[20];
    int tiros=0;

    int[]imagenes={R.drawable.ic_attend, R.drawable.ic_buy, R.drawable.ic_call, R.drawable.ic_care, R.drawable.ic_celebrate,
            R.drawable.ic_chatch, R.drawable.ic_cook, R.drawable.ic_drive, R.drawable.ic_eat, R.drawable.ic_listen,
            R.drawable.ic_love, R.drawable.ic_pay, R.drawable.ic_save, R.drawable.ic_share, R.drawable.ic_sleep, R.drawable.ic_talk, R.drawable.ic_win};
    int[]verb={R.drawable.ic_respattend, R.drawable.ic_respbuy, R.drawable.ic_respcall, R.drawable.ic_respcare, R.drawable.ic_respcelebrate, R.drawable.ic_respcatch,
            R.drawable.ic_respcook, R.drawable.ic_respdrive, R.drawable.ic_respeat, R.drawable.ic_resplisten, R.drawable.ic_resplove, R.drawable.ic_resppay, R.drawable.ic_respsave, R.drawable.ic_respshare, R.drawable.ic_respsleep, R.drawable.ic_resptalk, R.drawable.ic_respwin};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);
        InicializarTablero();txtPuntos=(EditText)findViewById(R.id.txt_puntos);
        txtTiros=(EditText)findViewById(R.id.txt_tiros);
        btnIniciar=(Button)findViewById(R.id.btn_new);
        btnIniciar.setOnClickListener(this);
    }
    public void InicializarTablero(){
        tablero[0]= (ImageButton)findViewById(R.id.btn_attend);
        tablero[1]= (ImageButton)findViewById(R.id.btn_buy);
        tablero[2]= (ImageButton)findViewById(R.id.btn_call);
        tablero[3]= (ImageButton)findViewById(R.id.btn_care);
        tablero[4]= (ImageButton)findViewById(R.id.btn_celebration);
        tablero[5]= (ImageButton)findViewById(R.id.btn_chatch);
        tablero[6]= (ImageButton)findViewById(R.id.btn_cook);
        tablero[7]= (ImageButton)findViewById(R.id.btn_drive);
        tablero[8]= (ImageButton)findViewById(R.id.btn_eat);
        tablero[9]= (ImageButton)findViewById(R.id.btn_listen);
        tablero[10]= (ImageButton)findViewById(R.id.btn_love);
        tablero[11]= (ImageButton)findViewById(R.id.btn_pay);
        tablero[12]= (ImageButton)findViewById(R.id.btn_save);
        tablero[13]= (ImageButton)findViewById(R.id.btn_share);
        tablero[14]= (ImageButton)findViewById(R.id.btn_sleep);
        tablero[15]= (ImageButton)findViewById(R.id.btn_talk);
        tablero[16]= (ImageButton)findViewById(R.id.btn_win);
        tablero[17]= (ImageButton)findViewById(R.id.btn_jump);
        tablero[18]= (ImageButton)findViewById(R.id.btn_run);
        tablero[19]= (ImageButton)findViewById(R.id.btn_ride);
        for(int i= 0; i<20;i++){
            tablero[i].setOnClickListener(this);
        }

    }

    public void mezclar() {
        boolean[]seleccionadas = new boolean[15];
        Random aleatoria=new Random();
        int x;
        int n=0;
        while(n<10){
            x= aleatoria.nextInt(seleccionadas.length);
            if(!seleccionadas[x]){
                tarjetas[n]= imagenes[x];
                tarjetas[n+10]=verb[x];
                datos[n]=n;
                datos[n+10]=n;
                n++;
                seleccionadas[x]=true;

            }
        }
        int tempo;
        int y;
        for(int i=1;i<=100;i++){
            x=aleatoria.nextInt(20);
            y=aleatoria.nextInt(20);
            tempo= tarjetas[x];
            tarjetas[x]=tarjetas[y];
            tarjetas[y]=tempo;
            tempo= datos[x];
            datos[x]=datos[y];
            datos[y]=tempo;
        }
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_new) {
            mezclar();
            for (int i = 0; i < 20; i++) {
                tablero[i].setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_memfond));
                bloqueadas[i]=false;
                tiros=0;
                click=0;
                puntos=0;
                txtTiros.setText(""+tiros);
                txtPuntos.setText(""+puntos);
            }
            banOk=true;
        }
        else if(banOk){
            switch (view.getId()) {

                case R.id.btn_attend:
                    seleccionar(0);
                    break;
                case R.id.btn_buy:
                    seleccionar(1);
                    break;
                case R.id.btn_call:
                    seleccionar(2);
                    break;
                case R.id.btn_care:
                    seleccionar(3);
                    break;
                case R.id.btn_celebration:
                    seleccionar(4);
                    break;

                case R.id.btn_chatch:
                    seleccionar(5);
                    break;
                case R.id.btn_cook:
                    seleccionar(6);
                    break;
                case R.id.btn_drive:
                    seleccionar(7);
                    break;
                case R.id.btn_eat:
                    seleccionar(8);
                    break;
                case R.id.btn_listen:
                    seleccionar(9);
                    break;
                case R.id.btn_love:
                    seleccionar(10);
                    break;
                case R.id.btn_pay:
                    seleccionar(11);
                    break;
                case R.id.btn_save:
                    seleccionar(12);
                    break;
                case R.id.btn_share:
                    seleccionar(13);
                    break;
                case R.id.btn_sleep:
                    seleccionar(14);
                    break;
                case R.id.btn_talk:
                    seleccionar(15);
                    break;
                case R.id.btn_win:
                    seleccionar(16);
                    break;
                case R.id.btn_jump:
                    seleccionar(17);
                    break;
                case R.id.btn_run:
                    seleccionar(18);
                    break;
                case R.id.btn_ride:
                    seleccionar(19);
                    break;
            }
            Handler handler=new Handler();
            if(click==2&&datos[pos1]==datos[pos2]){
                Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                puntos++;
                txtPuntos.setText(""+puntos);
                if (puntos ==10){
                    Toast.makeText(getApplication(),"Ya ganaste!!, en "+tiros+" tiros.",Toast.LENGTH_SHORT).show();
                }
            }else if(click==2&&datos[pos1]!=datos[pos2]){
                Toast.makeText(getApplication(),"Incorrecto!!",Toast.LENGTH_SHORT).show();
                bloqueadas[pos1]=false;
                bloqueadas[pos2]=false;
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tablero[pos1].setBackgroundDrawable(
                                getResources().getDrawable(R.drawable.ic_memfond));
                        tablero[pos2].setBackgroundDrawable(
                                getResources().getDrawable(R.drawable.ic_memfond));
                    }
                },300);


            }
            if(click==3){
                click=1;
            }
        }
    }

    public void seleccionar(int pos){
        if (bloqueadas[pos]==false) {
            tablero[pos].setBackgroundDrawable(getResources().getDrawable(tarjetas[pos]));
            if (click == 1) {
                pos1 = pos;
            } else {
                pos2 = pos;
            }
            bloqueadas[pos] = true;
            click++;
            tiros++;
            txtTiros.setText(""+tiros);
        }
    }
}
