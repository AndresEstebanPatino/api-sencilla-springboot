package com.crudapispringbootpostgresjpa;

import com.crudapispringbootpostgresjpa.domain.models.Libro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication


public class CrudApiSpringBootPostgresJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudApiSpringBootPostgresJpaApplication.class, args);
	}

}
