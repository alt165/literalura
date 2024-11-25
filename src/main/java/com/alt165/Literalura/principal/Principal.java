package com.alt165.Literalura.principal;

import com.alt165.Literalura.service.ConsultaAPI;

import java.util.Scanner;

public class Principal {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ConsultaAPI consultaAPI = new ConsultaAPI();
    public void muestraRespuesta() {
        System.out.println("texto");
        var texto = scanner.nextLine();
        System.out.println(consultaAPI.obtieneRespuestaAPI(texto));
    }
}
