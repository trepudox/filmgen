package com.trepudox.filmgen.dataprovider.repository;

import com.trepudox.filmgen.dataprovider.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {
}
