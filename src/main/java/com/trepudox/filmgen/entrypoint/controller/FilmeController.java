package com.trepudox.filmgen.entrypoint.controller;

import com.trepudox.filmgen.dataprovider.model.FilmeModel;
import com.trepudox.filmgen.dataprovider.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filme")
@RequiredArgsConstructor
public class FilmeController {

    private final FilmeRepository filmeRepository;

    @GetMapping("/all")
    public ResponseEntity<List<FilmeModel>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(filmeRepository.findAll());
    }

}
