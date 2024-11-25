package com.alt165.Literalura.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Esta clase provee una función para consumir datos desde una URL especificada.
 * Usa un cliente HTTP para enviar un GET a la URL especificada y devuelve
 * el cuerpo de la respuesta como string.
 */
public class ConsumoAPI {
    /**
     * Obtiene la información de la URL especificada.
     *
     * @param url La URL de la que obtendrá la  información.
     * @return El cuerpo de la respuesta como string.
     * @throws RuntimeException Si ocurre un error durante el request HTTP o el procesamiento de la respuesta.
     */
    public String obtenerDatos(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response;
        response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response.body();
    }
}
