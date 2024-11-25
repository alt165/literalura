package com.alt165.Literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Representa un autor con año de nacimiento, de fallecimiento y su nombre
 * @param anioNacimiento
 * @param anioMuerte
 * @param nombre
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor(
        @JsonAlias("birth_year") int anioNacimiento,
        @JsonAlias("death_year") int anioMuerte,
        @JsonAlias("name") String nombre
) {
}
