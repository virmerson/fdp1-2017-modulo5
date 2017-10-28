package com.htcursos.financasapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.htcursos.financasapp.R;
import com.htcursos.financasapp.model.Conta;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetalhesContasActivity extends AppCompatActivity {

    @BindView(R.id.tv_texto_conta)
    TextView tvConta;

    @BindView(R.id.tv_valor_conta)
    TextView tvValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalhes_conta);

        ButterKnife.bind(this);


        Bundle bundle = getIntent().getExtras();

        Conta conta =  (Conta) bundle.getSerializable("conta");



        tvConta.setText(conta.getDescricao());
        tvValor.setText(conta.getValor().toString());


    }
}
