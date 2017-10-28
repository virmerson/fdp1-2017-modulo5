package com.htcursos.financasapp.model;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by Virmerson on 28/10/17.
 */

//@Data
public class Conta implements Serializable {

    private String descricao;
    private Double valor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return getDescricao() + "|"+ getValor();
    }
}
