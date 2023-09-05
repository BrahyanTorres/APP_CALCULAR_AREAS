package com.brahyantorres.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText base, altura;
    TextView resultado;
    Button calculo;
    float Calcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        base= findViewById(R.id.sideOne);
        altura=findViewById(R.id.sideTwo);
        resultado=findViewById(R.id.resultado);
        calculo=findViewById(R.id.btnCalcular);
        calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float valio1= Float.parseFloat(base.getText().toString());
                float valio2= Float.parseFloat(altura.getText().toString());
                Calcular= ((valio1*valio2)/2);
                resultado.setText("Lo calculado es:"+String.valueOf(Calcular));

            }
        });

    }
}