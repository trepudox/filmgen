package com.trepudox.filmgen.entrypoint.controller;

import com.trepudox.filmgen.core.usecase.IGetAllGeneroModel;
import com.trepudox.filmgen.core.usecase.IGetGeneroModelById;
import com.trepudox.filmgen.dataprovider.model.GeneroModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genero")
@RequiredArgsConstructor
public class GeneroController {

    private final IGetAllGeneroModel getAllGeneroModel;
    private final IGetGeneroModelById getGeneroModelById;

    @GetMapping("/all")
    public ResponseEntity<List<GeneroModel>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(getAllGeneroModel.get());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<GeneroModel> getById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(getGeneroModelById.get(id));
    }

}
