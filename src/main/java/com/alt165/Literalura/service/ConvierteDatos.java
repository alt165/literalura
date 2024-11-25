package com.alt165.Literalura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Implementación de la interfaz {@link IConvierteDatos} para convertir la información JSON al el objeto del tipo
 * elegido
 */
public class ConvierteDatos implements IConvierteDatos{
    private ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Convierte la información JSON al objeto del tipo especificado.
     *
     * @param json  el String a convertir.
     * @param clase La clase del objeto a crear.
     * @return El objeto convertido al tipo T.
     * @throws RuntimeException si hay un error al procesar el Json.
     */
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
