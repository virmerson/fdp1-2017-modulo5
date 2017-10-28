package com.htcursos.financasapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.htcursos.financasapp.R;
import com.htcursos.financasapp.model.Conta;

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

        Conta conta  = new Conta();
        conta.setDescricao(etConta.getText().toString());
        conta.setValor(Double.parseDouble(etValor.getText().toString()));

        Bundle bundle = new Bundle();
        bundle.putSerializable("conta", conta);


        Intent irParaListaContas = new Intent(this, DetalhesContasActivity.class);
        irParaListaContas.putExtras(bundle);
        startActivity(irParaListaContas);



    }
}
