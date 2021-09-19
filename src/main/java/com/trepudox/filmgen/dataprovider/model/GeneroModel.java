package com.trepudox.filmgen.dataprovider.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.trepudox.filmgen.dataprovider.entity.Filme;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genero")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeneroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genero_id")
    @JsonProperty("genero_id")
    private Integer generoId;

    private String nome;

    private String descricao;

    @JsonIgnoreProperties("generos")
    @ManyToMany(mappedBy = "generos", targetEntity = FilmeModel.class)
    private List<Filme> filmes;

}
