package com.pau.personal.controller;

import com.pau.personal.model.repositoris.ArtistaRepository;
import com.pau.personal.model.repositoris.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistaController {

    @Autowired
    ArtistaRepository artistaRepository;

    @GetMapping("/artista")
    public String obtenirArtista(Model model) {
        model.addAttribute("artista", artistaRepository.findAll());
        return "artista";
    }
}