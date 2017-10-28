package com.htcursos.financasapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.htcursos.financasapp.R;
import com.htcursos.financasapp.model.Conta;
import com.htcursos.financasapp.service.ContaService;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListaContaActivity extends AppCompatActivity {


    @BindView(R.id.lv_lista_contas)
    ListView listaContas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_conta);
        ButterKnife.bind(this);

        List<Conta> contas =  new ContaService().buscarTodos();

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, contas);


        listaContas.setAdapter(adapter);


    }
}
