package com.pau.personal.model.entitats;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Artista")
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    long id;
    String name;
    int birth;
    String country;
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "artistaName")
    String artistaName;

    String actualImage;

    @OneToMany(mappedBy = "artName")
    @JsonIgnoreProperties("artista")
    List<Album> albums;

    public Artista() {
    }

    public Artista(String name, int birth, String country, String artistaName, String actualImage) {
        this.name = name;
        this.birth = birth;
        this.country = country;
        this.artistaName = artistaName;
        this.actualImage = actualImage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArtistaName() {
        return artistaName;
    }

    public void setArtistaName(String artistaName) {
        this.artistaName = artistaName;
    }

    public String getActualImage() {
        return actualImage;
    }

    public void setActualImage(String actualImage) {
        this.actualImage = actualImage;
    }

    public List<Album> getAlbums() {
        return albums;
    }
}
