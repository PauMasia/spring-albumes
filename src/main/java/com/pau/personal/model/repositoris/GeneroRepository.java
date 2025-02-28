package com.pau.personal.model.repositoris;

import com.pau.personal.model.entitats.Album;
import com.pau.personal.model.entitats.Genero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//                                                Classe Genero | Id clase Genero
public interface GeneroRepository extends CrudRepository<Genero, Long> {
}