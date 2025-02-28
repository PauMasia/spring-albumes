package com.pau.personal.model.entitats;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    //    @Column(nullable = false)
    String name;
    int anyo;
    int sales;
    String actual_image;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "artista_Name")
    public Artista artista_name;
    @ManyToMany
    @JoinTable(name = "ALBUM_GENERO",
            joinColumns = @JoinColumn(name = "album_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id")
    )
    public List<Genero> genero;



    public void setId(long id) {
        this.id = id;
    }


    public Album() {
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }



}
