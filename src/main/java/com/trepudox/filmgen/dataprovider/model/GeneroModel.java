package com.trepudox.filmgen.dataprovider.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    @OneToMany(mappedBy = "genero", targetEntity = GeneroFilmeModel.class)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnoreProperties({"genero", "id"})
    private List<FilmeModel> filmes;

}
