package com.pau.personal.services;

import com.pau.personal.model.entitats.Album;
import com.pau.personal.model.repositoris.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class TodosAlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Iterable<Album> getAllAlbum() {
        return albumRepository.findAll();

    }
}
