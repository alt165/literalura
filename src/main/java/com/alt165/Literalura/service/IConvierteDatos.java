package com.alt165.Literalura.service;

/**
 * Interfaz para convertir datos JSON a un objeto de un tipo especifico.
 */
public interface IConvierteDatos {
    /**
     * Convierte la información JSON al objeto del tipo especificado.
     * @param json el String a convertir.
     * @param clase La clase del objeto a crear.
     * @param <T> el tipo del objeto a retornar.
     * @return El objeto convertido al tipo T.
     */
    <T> T obtenerDatos(String json, Class<T> clase);
}
