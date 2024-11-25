package com.alt165.Literalura.principal;

import com.alt165.Literalura.model.RespuestaRecord;
import com.alt165.Literalura.service.ConsultaAPI;
import com.alt165.Literalura.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ConsultaAPI consultaAPI = new ConsultaAPI();
    private final ConvierteDatos conversor = new ConvierteDatos();
    public void muestraRespuesta() {
        System.out.println("texto: ");
        var texto = scanner.nextLine();
        String datos = consultaAPI.obtieneRespuestaAPI(texto);
        RespuestaRecord respuesta = conversor.obtenerDatos(datos, RespuestaRecord.class);

        respuesta.libros()
                .forEach(System.out::println);
    }
}
