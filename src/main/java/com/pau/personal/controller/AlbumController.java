package com.pau.personal.controller;

import com.pau.personal.model.entitats.Album;
import com.pau.personal.model.repositoris.AlbumRepository;
import com.pau.personal.model.repositoris.GeneroRepository;
import com.pau.personal.services.TodosAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    TodosAlbumService albumService;
    @GetMapping("/albums")
    public List<Album> obtenirAlbums(Model model) {
        return (List<Album>) albumService.getAllAlbum();
    }
    @PostMapping
    public Album createAlbum(@RequestBody Album generation) {
        return albumRepository.save(generation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Album> updateAlbum(@PathVariable Long id, @RequestBody Album updateAlbum) {
        Optional<Album> a = albumRepository.findById(id);
        if (a.isPresent()) {
            Album album = a.get();
            album.setGenero(updateAlbum.getGenero());
            return ResponseEntity.ok().body(albumRepository.save(album));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteAlbum(@PathVariable Long id) {
        albumRepository.deleteById(id);
    }

}