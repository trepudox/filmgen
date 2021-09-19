package com.trepudox.filmgen.core.usecase.impl;

import com.trepudox.filmgen.core.usecase.IGetGeneroModelById;
import com.trepudox.filmgen.dataprovider.model.GeneroModel;
import com.trepudox.filmgen.dataprovider.repository.GeneroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetGeneroModelById implements IGetGeneroModelById {

    private final GeneroRepository generoRepository;

    @Override
    public GeneroModel get(Integer id) {
        return generoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Gênero com esse ID não existe"));
    }

}
