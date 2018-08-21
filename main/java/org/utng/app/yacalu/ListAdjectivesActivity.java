package org.utng.app.yacalu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.ClipData;
import android.view.DragEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import org.utng.app.yacalu.R;
import java.util.Random;




public class ListAdjectivesActivity extends AppCompatActivity implements View.OnClickListener {
    private Button newint;
    LinearLayout target_new, target_dreaf, target_round, target_inter,target_beaut, target_blue,target_this, target_thos, target_many, target_much;
    Button test_new, test_dreaf, test_round, test_inter, test_beaut, btn_new, btn_dreaf, btn_round, btn_inter, btn_beaut, btn_blue, btn_this, btn_thos,btn_many, btn_much,
            test_blue, test_this, test_thos, test_many, test_much,  btnPregunta;

    EditText txtAciertos, txtErrores;


    int[] preg ={R.id.target_new, R.id.target_dreaf, R.id.target_round, R.id.target_inter, R.id.target_beaut, R.id.target_blue, R.id.target_this, R.id.target_thos, R.id.target_many, R.id.target_much};
    int [] resp={R.id.btn_new, R.id.btn_dreaf, R.id.btn_round,  R.id.btn_their,  R.id.btn_beaut,
            R.id.btn_blue,  R.id.btn_this, R.id.btn_thos,  R.id.btn_many,  R.id.btn_much,  R.id.btn_much};
    int y;
    int aciertos;
    int errores;
    boolean[] correctas= new boolean[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_list_adjectives);



        target_new = (LinearLayout) findViewById(R.id.target_new);
        target_dreaf= (LinearLayout) findViewById(R.id.target_dreaf);
        target_round = (LinearLayout) findViewById(R.id.target_round);
        target_inter = (LinearLayout) findViewById(R.id.target_inter);
        target_beaut = (LinearLayout) findViewById(R.id.target_beaut);
        target_blue = (LinearLayout) findViewById(R.id.target_blue);
        target_this = (LinearLayout) findViewById(R.id.target_this);
        target_thos = (LinearLayout) findViewById(R.id.target_thos);
        target_many = (LinearLayout) findViewById(R.id.target_many);
        target_much = (LinearLayout) findViewById(R.id.target_much);


        test_new = (Button) findViewById(R.id.test_new);
        test_dreaf = (Button) findViewById(R.id.test_dreaf);
        test_round = (Button) findViewById(R.id.test_round);
        test_inter = (Button) findViewById(R.id.test_inter);
        test_beaut = (Button) findViewById(R.id.test_beaut);
        test_blue = (Button) findViewById(R.id.test_blue);
        test_this = (Button) findViewById(R.id.test_this);
        test_thos = (Button) findViewById(R.id.test_thos);
        test_many = (Button) findViewById(R.id.test_many);
        test_much = (Button) findViewById(R.id.test_much);



        btn_new = (Button) findViewById(R.id.btn_new);
        btn_dreaf = (Button) findViewById(R.id.btn_dreaf);
        btn_round = (Button) findViewById(R.id.btn_round);
        btn_inter = (Button) findViewById(R.id.btn_their);
        btn_beaut = (Button) findViewById(R.id.btn_beaut);
        btn_blue = (Button) findViewById(R.id.btn_blue);
        btn_this = (Button) findViewById(R.id.btn_this);
        btn_thos = (Button) findViewById(R.id.btn_thos);
        btn_many = (Button) findViewById(R.id. btn_many);
        btn_much = (Button) findViewById(R.id.btn_much);
        btnPregunta = (Button) findViewById(R.id.btn_newquestion);



        //txtAciertos = (EditText) findViewById(R.id.txt_aciertos);
        //  txtErrores = (EditText) findViewById(R.id.txt_errores);
        //target1.setOnDragListener(dragListenre);
        //target2.setOnDragListener(dragListenre);
        //target_round.setOnDragListener(dragListenre);
        //target_inter.setOnDragListener(dragListenre);
        //target_beaut.setOnDragListener(dragListenre);


        btn_new.setOnLongClickListener(longClickListener);
        btn_dreaf.setOnLongClickListener(longClickListener);
        btn_round.setOnLongClickListener(longClickListener);
        btn_inter.setOnLongClickListener(longClickListener);
        btn_beaut.setOnLongClickListener(longClickListener);
        btn_blue.setOnLongClickListener(longClickListener);
        btn_this.setOnLongClickListener(longClickListener);
        btn_thos.setOnLongClickListener(longClickListener);
        btn_many.setOnLongClickListener(longClickListener);
        btn_much.setOnLongClickListener(longClickListener);
        btnPregunta.setOnClickListener(this);

    }

    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder myShadwoBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data, myShadwoBuilder, v, 0);
            return true;

        }
    };

    View.OnDragListener dragListenre = new View.OnDragListener() {


        @Override
        public boolean onDrag(View v, DragEvent event) {

            int dragEvent = event.getAction();
            final View view = (View) event.getLocalState();



            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    if (view.getId() == R.id.btn_new){
                        test_new.setText("The Car is new");
                    }else if (view.getId() == R.id.btn_dreaf){
                        test_dreaf.setText("What you wrote her is dreadful");

                    }
                    else
                    if (view.getId() == R.id.btn_round){
                        test_round.setText("The Earth is round");

                    }
                    else
                    if (view.getId() == R.id.btn_their){
                        test_inter.setText("The meeting was interesting.");

                    }
                    else
                    if (view.getId() == R.id.btn_beaut){
                        test_beaut.setText("It is a beautiful dog");

                    }
                    else
                    if (view.getId() == R.id.btn_blue){
                        test_blue.setText("I have a blue skirt");

                    }
                    else
                    if (view.getId() == R.id.btn_this){
                        test_this.setText("This car is very fast");

                    }
                    else
                    if (view.getId() == R.id.btn_thos){
                        test_thos.setText("Those are my shoes");

                    }
                    else
                    if (view.getId() == R.id.btn_many){
                        test_many.setText("There are so many thigs to do.");

                    }
                    else
                    if (view.getId() == R.id.btn_much){
                        test_much.setText("there is no much time.");

                    }
                    break;

                case DragEvent.ACTION_DRAG_EXITED:

                    break;
                case DragEvent.ACTION_DROP:
                    if(view.getId() == R.id.btn_new){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[0]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        //txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_dreaf && v.getId() == R.id.target_dreaf){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[1]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        //txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_round && v.getId() == R.id.target_round) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[2]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        //  txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_their && v.getId() == R.id.target_inter) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[3]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        //    txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_beaut && v.getId() == R.id.target_beaut){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[4]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_blue && v.getId() == R.id.target_blue){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[5]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_this && v.getId() == R.id.target_this){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[6]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_thos && v.getId() == R.id.target_thos){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[7]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_many && v.getId() == R.id.target_many){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[8]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
                    }else
                    if(view.getId() == R.id.btn_much && v.getId() == R.id.target_much){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        correctas[9]=true;
                        Toast.makeText(getApplication(),"Correcto!!",Toast.LENGTH_SHORT).show();
                        aciertos++;
                        // txtAciertos.setText(""+ aciertos);
                    }

                    else{
                        Toast.makeText(getApplication(),"Incorrecto!!",Toast.LENGTH_SHORT).show();
                        errores ++;
                        //txtErrores.setText(""+ errores);
                    }
                    if (aciertos==10){
                        int calif =aciertos*10/(aciertos+errores);
                        Toast.makeText(getApplication(),"Terminaste, tuviste "+aciertos+" aciertos, " +
                                errores + " errores. Tu calificación es: " + calif,Toast.LENGTH_LONG).show();
                        btnPregunta.setEnabled(false);
                    }
                    break;

            }
            return true;
        }

    };

    @Override
    public void onClick(View view) {
        Random rn = new Random();

        //for(int i =0; i < 5; i++)
        //{
        switch (y){
            case 0:
                test_new.setVisibility(View.INVISIBLE);
                break;
            case 1:
                test_dreaf.setVisibility(View.INVISIBLE);
                break;
            case 2:
                test_round.setVisibility(View.INVISIBLE);
                break;
            case 3:
                test_inter.setVisibility(View.INVISIBLE);
                break;
            case 4:
                test_beaut.setVisibility(View.INVISIBLE);
            case 5:
                test_blue.setVisibility(View.INVISIBLE);
                break;
            case 6:
                test_this.setVisibility(View.INVISIBLE);
                break;
            case 7:
                test_thos.setVisibility(View.INVISIBLE);
                break;
            case 8:
                test_many.setVisibility(View.INVISIBLE);
                break;
            case 9:
                test_much.setVisibility(View.INVISIBLE);

        }
        do {
            y = rn.nextInt(preg.length);
        }while(correctas[y]);
        switch (y){
            case 0:
                target_new.setOnDragListener(dragListenre);
                break;
            case 1:
                target_dreaf.setOnDragListener(dragListenre);
                break;
            case 2:
                target_round.setOnDragListener(dragListenre);
                break;
            case 3:
                target_inter.setOnDragListener(dragListenre);
                break;
            case 4:
                target_beaut.setOnDragListener(dragListenre);
                break;
            case 5:
                target_blue.setOnDragListener(dragListenre);
                break;
            case 6:
                target_this.setOnDragListener(dragListenre);
                break;
            case 7:
                target_thos.setOnDragListener(dragListenre);
                break;
            case 8:
                target_many.setOnDragListener(dragListenre);
                break;
            case 9:
                target_much.setOnDragListener(dragListenre);
                break;

        }
        ;
        //System.out.println(preg[x]);
        //}
        switch (y){
            case 0:
                test_new.setText("The car is ___");
                test_new.setVisibility(View.VISIBLE);
                break;
            case 1:
                test_dreaf.setText("What you wrote her is ______");
                test_dreaf.setVisibility(View.VISIBLE);
                break;
            case 2:
                test_round.setText("The Earth is ______");
                test_round.setVisibility(View.VISIBLE);
                break;
            case 3:
                test_inter.setText("The meeting was _____");
                test_inter.setVisibility(View.VISIBLE);
                break;
            case 4:
                test_beaut.setText("It is a ________ dog");
                test_beaut.setVisibility(View.VISIBLE);
                break;
            case 5:
                test_blue.setText("I have a ______ skirt");
                test_blue.setVisibility(View.VISIBLE);
                break;
            case 6:
                test_this.setText("____ car is very fast");
                test_this.setVisibility(View.VISIBLE);
                break;
            case 7:
                test_thos.setText("_______ are my shoes");
                test_thos.setVisibility(View.VISIBLE);
                break;
            case 8:
                test_many.setText("There are so _____ things to do");
                test_many.setVisibility(View.VISIBLE);
                break;
            case 9:
                test_much.setText("There is no ______ time");
                test_much.setVisibility(View.VISIBLE);

        }
    }
}
