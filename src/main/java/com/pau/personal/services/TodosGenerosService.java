package com.pau.personal.services;

import com.pau.personal.model.entitats.Genero;
import com.pau.personal.model.repositoris.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class TodosGenerosService {

    @Autowired
    private GeneroRepository generoRepository;

    public Iterable<Genero> getAllGeneros() {
        return generoRepository.findAll();

    }
}
