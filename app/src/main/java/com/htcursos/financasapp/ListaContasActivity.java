package com.htcursos.financasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListaContasActivity extends AppCompatActivity {

    @BindView(R.id.tv_texto_conta)
    TextView tvConta;

    @BindView(R.id.tv_valor_conta)
    TextView tvValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contas);

        ButterKnife.bind(this);


        Bundle bundle = getIntent().getExtras();
        String conta = bundle.getString("conta");
        String valor = bundle.getString("valor");


        tvConta.setText(conta);
        tvValor.setText(valor);


    }
}
