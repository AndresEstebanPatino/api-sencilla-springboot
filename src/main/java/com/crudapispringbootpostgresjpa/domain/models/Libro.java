package com.crudapispringbootpostgresjpa.domain.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table

public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Para hacer el id autoincremental
    private Integer id;
    private String name;
    private String autor;
    private String gender;

    public Libro() {
    }

    public Libro(Integer id, String name, String autor, String gender) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.gender = gender;
    }

    public Libro(String name, String autor, String gender) {
        this.name = name;
        this.autor = autor;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
