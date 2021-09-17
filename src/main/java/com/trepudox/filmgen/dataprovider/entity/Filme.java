package com.trepudox.filmgen.dataprovider.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Filme {

    private String nome;
    private String descricao;
    @JsonProperty("ano_lancamento")
    private int anoLancamento;
    private List<Genero> generos;

}
