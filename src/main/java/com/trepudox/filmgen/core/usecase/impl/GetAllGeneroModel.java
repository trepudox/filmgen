package com.trepudox.filmgen.core.usecase.impl;

import com.trepudox.filmgen.core.usecase.IGetAllGeneroModel;
import com.trepudox.filmgen.dataprovider.model.GeneroModel;
import com.trepudox.filmgen.dataprovider.repository.GeneroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetAllGeneroModel implements IGetAllGeneroModel {

    private final GeneroRepository generoRepository;

    @Override
    public List<GeneroModel> get() {
        return generoRepository.findAll();
    }

}
