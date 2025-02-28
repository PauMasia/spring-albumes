package com.pau.personal.controller.serviciosController;

import com.pau.personal.model.entitats.Album;
import com.pau.personal.model.repositoris.AlbumRepository;
import com.pau.personal.services.AlbumArtistaEspecifico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class AlbumesPorArtista {
    @Autowired
    private AlbumArtistaEspecifico albumArtistaEspecifico;;
    @GetMapping("/artista/{artistName}")
    public List<Album> getArtistAlbums(@PathVariable int artistName) {

        return albumArtistaEspecifico.getAlbumsByArtist(artistName);
    }
}
