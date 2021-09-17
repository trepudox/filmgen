package com.trepudox.filmgen.dataprovider.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity
@IdClass(FilmeGeneroId.class)
public class FilmeGeneroModel {



}

@Getter
@Setter
class FilmeGeneroId implements Serializable {

    private Integer filmeId;

    private Integer generoId;

}
