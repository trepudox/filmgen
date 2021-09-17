package com.trepudox.filmgen.dataprovider.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Genero {

    private String nome;
    private String descricao;
    private List<Filme> filmes;

}
