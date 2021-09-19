package com.trepudox.filmgen.dataprovider.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trepudox.filmgen.dataprovider.entity.Filme;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
public class GeneroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genero_id")
    @JsonProperty("genero_id")
    private Integer generoId;

    private String nome;

    private String descricao;

    @OneToMany(mappedBy = "filmeId", targetEntity = FilmeGeneroModel.class)
    private List<Filme> filmes;

}
