package com.pau.personal.model.repositoris;

import com.pau.personal.model.entitats.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//                                               Classe album | Id clase album
public interface AlbumRepository extends CrudRepository<Album, Long> {
}