package com.pau.personal.model.repositoris;

import com.pau.personal.model.entitats.Album;
import com.pau.personal.model.entitats.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//                                                 Classe artista | Id clase artista
public interface ArtistaRepository extends CrudRepository<Artista , Long> {
}