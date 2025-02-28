package com.pau.personal.services;

import com.pau.personal.model.entitats.Album;
import com.pau.personal.model.repositoris.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
@Service
public class AlbumArtistaEspecifico {
    @Autowired
    AlbumRepository albumRepository;
    public List<Album> getAlbumsByArtist( int artistName) {
        List<Album> lista= (List<Album>) albumRepository.findAll();
        List<Album> resultado= new ArrayList<>();

        for (Album item: lista){
            if (item.getArtista_id().getId()== artistName){
                resultado.add(item);
            }}
   return resultado;
    }
}
