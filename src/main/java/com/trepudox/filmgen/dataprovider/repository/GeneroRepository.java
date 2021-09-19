package com.trepudox.filmgen.dataprovider.repository;

import com.trepudox.filmgen.dataprovider.model.GeneroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<GeneroModel, Integer> {
}
