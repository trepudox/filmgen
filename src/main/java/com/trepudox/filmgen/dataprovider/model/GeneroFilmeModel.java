package com.trepudox.filmgen.dataprovider.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "genero_filme")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeneroFilmeModel {

    @EmbeddedId
    private GeneroFilmeKey id;

    @ManyToOne
    @MapsId("generoId")
    @JoinColumn(name = "genero_id")
    @JsonIgnoreProperties("filmes")
    private GeneroModel genero;

    @ManyToOne
    @MapsId("filmeId")
    @JoinColumn(name = "filme_id")
    @JsonIgnoreProperties("generos")
    private FilmeModel filme;

}