package com.htcursos.financasapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.htcursos.financasapp.service.CalculadoraService;
import com.htcursos.financasapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnCalcular =  (Button)findViewById(R.id.btn_somar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText campoNumero1 =  (EditText) findViewById(R.id.campo_numero1);

                String texto1 = campoNumero1.getText().toString();


                EditText campoNumero2 =  (EditText) findViewById(R.id.campo_numero2);

                String texto2 = campoNumero2.getText().toString();

                CalculadoraService calc = new CalculadoraService();

                Double soma= calc.somar(texto1, texto2);




               TextView saida = (TextView)findViewById(R.id.saida);
                saida.setText(soma.toString());
            }
        });

        Button btnSubtrair =  (Button)findViewById(R.id.btn_sub);
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText campoNumero1 =  (EditText) findViewById(R.id.campo_numero1);

                String texto1 = campoNumero1.getText().toString();


                EditText campoNumero2 =  (EditText) findViewById(R.id.campo_numero2);

                String texto2 = campoNumero2.getText().toString();

                CalculadoraService calc = new CalculadoraService();

                Double subtrair= calc.subtrair(texto1, texto2);




                TextView saida = (TextView)findViewById(R.id.saida);
                saida.setText(subtrair.toString());
            }
        });

        Button btnMultiplicar =  (Button)findViewById(R.id.btn_multiplicao);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText campoNumero1 =  (EditText) findViewById(R.id.campo_numero1);

                String texto1 = campoNumero1.getText().toString();


                EditText campoNumero2 =  (EditText) findViewById(R.id.campo_numero2);

                String texto2 = campoNumero2.getText().toString();

                CalculadoraService calc = new CalculadoraService();

                Double multiplicacao= calc.multi(texto1, texto2);




                TextView saida = (TextView)findViewById(R.id.saida);
                saida.setText(multiplicacao.toString());
            }
        });

        Button btnDivisao =  (Button)findViewById(R.id.btn_divisao);
        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText campoNumero1 =  (EditText) findViewById(R.id.campo_numero1);

                String texto1 = campoNumero1.getText().toString();


                EditText campoNumero2 =  (EditText) findViewById(R.id.campo_numero2);

                String texto2 = campoNumero2.getText().toString();

                CalculadoraService calc = new CalculadoraService();

                Double divisao= calc.divi(texto1, texto2);




                TextView saida = (TextView)findViewById(R.id.saida);
                saida.setText(divisao.toString());
            }
        });

    }
}

