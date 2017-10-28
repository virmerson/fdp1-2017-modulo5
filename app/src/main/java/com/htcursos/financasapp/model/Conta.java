package com.htcursos.financasapp.model;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by Virmerson on 28/10/17.
 */

@Data
public class Conta implements Serializable {

    private String descricao;
    private Double valor;
}
