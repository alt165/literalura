package com.alt165.Literalura.principal;

import com.alt165.Literalura.service.ConsultaAPI;

import java.util.Scanner;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private static ConsultaAPI consultaAPI = new ConsultaAPI();
    public void muestraRespuesta() {
        System.out.println("texto");
        var texto = scanner.nextLine();
        System.out.println(consultaAPI.obtieneRespuestaAPI(texto));
    }
}
