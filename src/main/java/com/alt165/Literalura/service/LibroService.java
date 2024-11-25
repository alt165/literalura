package com.alt165.Literalura.service;

import com.alt165.Literalura.DTO.LibroDTO;
import com.alt165.Literalura.model.Autor;
import com.alt165.Literalura.model.DatosRespuesta;
import com.alt165.Literalura.model.Libro;
import com.alt165.Literalura.repository.AutorRepository;
import com.alt165.Literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private AutorRepository autorRepository;

//
//    public void guardarLibrosDesdeJSON(List<LibroDTO> librosDTO) {
//        for (LibroDTO libroDTO : librosDTO) {
//            Libro libro = new Libro();
//            libro.setTitulo(libroDTO.getTitulo());
//            libro.setCantidadDeDescargas((libroDTO.getCantidadDeDescargas()));
//
//            Set<Autor> autores = new HashSet<>();
//            for (String nombreAutor : libroDTO.getAutores()) {
//                Autor autor = autorRepository.findByNombre(nombreAutor).orElseGet(() -> {
//                    Autor nuevoAutor = new Autor();
//                    nuevoAutor.setNombre(nombreAutor);
//                    return nuevoAutor;
//                });
//                autores.add(autor);
//            }
//
//            libro.setAutores(autores);
//            libroRepository.save(libro);
//        }
//    }
}
