package com.trepudox.filmgen.entrypoint.controller;

import com.trepudox.filmgen.dataprovider.entity.Genero;
import com.trepudox.filmgen.dataprovider.model.GeneroModel;
import com.trepudox.filmgen.dataprovider.repository.GeneroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genero")
@RequiredArgsConstructor
public class GeneroController {

    private final GeneroRepository generoRepository;

    @GetMapping("/all")
    public ResponseEntity<List<GeneroModel>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(generoRepository.findAll());
    }

}
