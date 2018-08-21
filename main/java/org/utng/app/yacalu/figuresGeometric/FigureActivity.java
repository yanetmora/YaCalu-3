package org.utng.app.yacalu.figuresGeometric;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import org.utng.app.yacalu.R;

/**
 * Created by yanet on 20/08/2018.
 */

public class FigureActivity extends AppCompatActivity {
    private ImageButton btnFigure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figure);
        btnFigure = (ImageButton) findViewById(R.id.btn_figure);

        btnFigure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(org.utng.app.yacalu.FigureActivity.this,CircleActivity.class);
                startActivity(i);
            }
        });
    }
}