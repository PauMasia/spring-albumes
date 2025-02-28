package com.pau.personal.controller;

import com.pau.personal.model.entitats.Genero;
import com.pau.personal.model.repositoris.GeneroRepository;
import com.pau.personal.services.TodosAlbumService;
import com.pau.personal.services.TodosGenerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GeneroController {

    @Autowired
    TodosGenerosService generoService;
    @GetMapping("/generos")
    public List<Genero> obtenirGeneros(Model model) {
//        model.addAttribute("generos", generoRepository.findAll());
        return (List<Genero>) generoService.getAllGeneros();
    }

}