package com.alt165.Literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Representa un libro con un identificador, título, lista de autores y los idiomas en los que está escrito
 * @param id identificador unico para cada libro.
 * @param titulo nombre del libro.
 * @param autores lista de autores del libro.
 * @param idiomas lista de idiomas en los que fue escrito el libro.
 * @param cantidadDeDescargas cantidad de descargas del libro.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
        @JsonAlias("id") int id,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<DatosAutor> autores,
        @JsonAlias("languages") List<String> idiomas,
        @JsonAlias("download_count") int cantidadDeDescargas
) {
}
