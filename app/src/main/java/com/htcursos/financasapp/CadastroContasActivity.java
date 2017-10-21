package com.htcursos.financasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class CadastroContasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_contas);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_cadastrar)
    public void aoClicarCadastro(View view){

        Intent irParaListaContas = new Intent(this, ListaContasActivity.class);
        startActivity(irParaListaContas);

    }
}
