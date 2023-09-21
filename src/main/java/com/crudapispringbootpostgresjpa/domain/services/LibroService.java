package com.crudapispringbootpostgresjpa.domain.services;

import com.crudapispringbootpostgresjpa.domain.models.Libro;
import com.crudapispringbootpostgresjpa.infra.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    private final LibroRepository libroRepository;
    @Autowired

    public LibroService(LibroRepository libroRepository) {

        this.libroRepository = libroRepository;
    }

    public List<Libro> getBook(){
        return libroRepository.findAll(); // SELECT * FROM libros
    }

    public Libro libroById(Integer id){
    Optional<Libro> libroByID = (libroRepository.findById(id));
    return libroByID.orElse(null);
    }
    public void newLibro(Libro libro) {
        libroRepository.save(libro);
    }

    public void update(Integer id, Libro libro) {

        Libro bookExistente = libroById(id);
        if (bookExistente == null ) {
            System.out.println("erorr");
        }


            bookExistente.setName(libro.getName());
            bookExistente.setAutor(libro.getAutor());
            bookExistente.setGender(libro.getGender());

            libroRepository.save(bookExistente);
        }


    public void deleteBook(Integer id, Libro libro) {
        boolean existe = libroRepository.existsById(id);
        if (existe) {
            libroRepository.delete(libro);
        }
    }
}
