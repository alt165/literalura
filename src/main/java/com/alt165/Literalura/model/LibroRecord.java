package com.alt165.Literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Representa un libro con un identificador, título, lista de autores y los idiomas en los que está escrito
 * @param id
 * @param titulo
 * @param autores
 * @param idiomas
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record LibroRecord(
        @JsonAlias("id") int id,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<Autor> autores,
        @JsonAlias("languages") List<String> idiomas
) {
}
