package com.trepudox.filmgen.dataprovider.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trepudox.filmgen.dataprovider.entity.Genero;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "filme")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilmeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "filme_id")
    @JsonProperty("filme_id")
    private Integer filmeId;

    private String nome;

    private String descricao;

    @Column(name = "ano_lancamento")
    @JsonProperty("ano_lancamento")
    private Integer anoLancamento;

    @OneToMany(mappedBy = "filmeId", targetEntity = FilmeGeneroModel.class)
    private List<Genero> generos;

}
