package com.htcursos.financasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CadastroContasActivity extends AppCompatActivity {


    @BindView(R.id.et_campo_conta)
    EditText etConta;


    @BindView(R.id.et_campo_valor)
    EditText etValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_contas);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_cadastrar)
    public void aoClicarCadastro(View view){


        Bundle bundle = new Bundle();
        bundle.putString("conta", etConta.getText().toString());
        bundle.putString("valor", etValor.getText().toString());


        Intent irParaListaContas = new Intent(this, ListaContasActivity.class);
        irParaListaContas.putExtras(bundle);
        startActivity(irParaListaContas);



    }
}
