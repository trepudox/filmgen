package com.trepudox.filmgen.dataprovider.repository;

import com.trepudox.filmgen.dataprovider.model.GeneroFilmeKey;
import com.trepudox.filmgen.dataprovider.model.GeneroFilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroFilmeModelRepository extends JpaRepository<GeneroFilmeModel, GeneroFilmeKey> {
}
