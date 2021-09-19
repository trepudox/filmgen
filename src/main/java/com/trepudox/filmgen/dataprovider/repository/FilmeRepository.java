package com.trepudox.filmgen.dataprovider.repository;

import com.trepudox.filmgen.dataprovider.model.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeModel, Integer> {
}
