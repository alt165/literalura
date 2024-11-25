package com.alt165.Literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Representa la primera respuesta que da la API donde dice la cantidad de datos obtenidos con los datos enviados
 * siguiente tiene un valor si hay más páginas con libros (cada página trae 32 datos) y una lista de libros si hay datos
 * obtenidos.
 * @param cantidad
 * @param siguiente
 * @param libros
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosRespuesta(
        @JsonAlias("count") Integer cantidad,
        @JsonAlias("next") String siguiente,
        @JsonAlias("results") List<DatosLibro> libros
) {

}
