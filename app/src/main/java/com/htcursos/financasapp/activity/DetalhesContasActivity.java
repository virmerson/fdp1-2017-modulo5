package com.htcursos.financasapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.htcursos.financasapp.R;
import com.htcursos.financasapp.model.Conta;
import com.htcursos.financasapp.service.ContaService;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetalhesContasActivity extends AppCompatActivity {

    @BindView(R.id.tv_texto_conta)
    TextView tvConta;

    @BindView(R.id.tv_valor_conta)
    TextView tvValor;

    private Conta conta ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalhes_conta);

        ButterKnife.bind(this);


        Bundle bundle = getIntent().getExtras();

        conta =  (Conta) bundle.getSerializable("conta");

        tvConta.setText(conta.getDescricao());
        tvValor.setText(conta.getValor().toString());


    }

    @OnClick(R.id.btn_confirmar)
    public void aoClicarConfimar(){
        ContaService contaService = new ContaService();
        contaService.cadastrar(conta );
        Toast.makeText(this, "Cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
    }
}
