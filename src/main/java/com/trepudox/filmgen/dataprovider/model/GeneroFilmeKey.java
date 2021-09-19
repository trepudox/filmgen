package com.trepudox.filmgen.dataprovider.model;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class GeneroFilmeKey implements Serializable {

    private Integer filmeId;

    private Integer generoId;

}
