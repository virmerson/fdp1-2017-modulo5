package com.htcursos.financasapp.service;

import com.htcursos.financasapp.model.Conta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Virmerson on 28/10/17.
 */

public class ContaService {


    private static List<Conta> listaContas= new ArrayList<>();


    public void cadastrar(Conta conta){
        listaContas.add(conta);
    }


    public List<Conta> buscarTodos(){
        return listaContas;
    }
}




