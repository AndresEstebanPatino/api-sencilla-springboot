package com.crudapispringbootpostgresjpa.infra.repositories;

import com.crudapispringbootpostgresjpa.domain.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
    //Tiene la responsabilidad de comunicarse con la base de datos
}

