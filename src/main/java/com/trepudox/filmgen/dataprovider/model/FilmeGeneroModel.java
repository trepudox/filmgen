package com.trepudox.filmgen.dataprovider.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "filme_genero")
@IdClass(FilmeGeneroIdClass.class)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilmeGeneroModel {

    @Id
    @Column(name = "filme_id")
    @JsonProperty("filme_id")
    private Integer filmeId;

    @Id
    @Column(name = "genero_id")
    @JsonProperty("genero_id")
    private Integer generoId;

}

@Getter
@Setter
class FilmeGeneroIdClass implements Serializable {

    private Integer filmeId;

    private Integer generoId;

}
