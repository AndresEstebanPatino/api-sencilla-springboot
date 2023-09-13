package com.crudapispringbootpostgresjpa.apiControllers;

import com.crudapispringbootpostgresjpa.domain.models.Libro;
import com.crudapispringbootpostgresjpa.domain.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/libros")

public class LibroController {

    private final LibroService libroService;

    @Autowired

    public LibroController(LibroService libroService) {

        this.libroService = libroService;
    }

    @GetMapping
    public List<Libro> getBookController(){
        return libroService.getBook();
    }

    @PostMapping
    public void createBook(@RequestBody Libro libro){
        libroService.newLibro(libro);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable Integer id, @RequestBody Libro libro ){

        libroService.update(id, libro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id, Libro libro){
        libroService.deleteBook(id, libro);
    }

}
