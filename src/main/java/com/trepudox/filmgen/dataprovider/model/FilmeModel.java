package com.trepudox.filmgen.dataprovider.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trepudox.filmgen.dataprovider.entity.Genero;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
public class FilmeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "filme_id")
    private Integer filmeId;

    private String nome;

    private String descricao;

    @Column(name = "ano_lancamento")
    @JsonProperty("ano_lancamento")
    private Integer anoLancamento;

    @OneToMany(mappedBy = "generoId", targetEntity = FilmeGeneroModel.class)
    private List<Genero> generos;

}
