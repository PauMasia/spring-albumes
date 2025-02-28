package com.pau.personal.services;

import com.pau.personal.model.entitats.Artista;
import com.pau.personal.model.repositoris.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class TodosArtistaService {

        @Autowired
        private ArtistaRepository artistaRepository;

        public Iterable<Artista> getAllArtista() {
            return artistaRepository.findAll();

    }
}
