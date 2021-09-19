package com.trepudox.filmgen.dataprovider.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "filme_genero")
@IdClass(FilmeGeneroIdClass.class)
@Getter
@Setter
@Builder
public class FilmeGeneroModel {

    @Id
    @Column(name = "filme_id")
    private Integer filmeId;

    @Id
    @Column(name = "genero_id")
    private Integer generoId;

}

@Getter
@Setter
class FilmeGeneroIdClass implements Serializable {

    private Integer filmeId;

    private Integer generoId;

}
