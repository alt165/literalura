package com.alt165.Literalura.principal;

import com.alt165.Literalura.model.RespuestaRecord;
import com.alt165.Literalura.service.Constantes;
import com.alt165.Literalura.service.ConsultaAPI;
import com.alt165.Literalura.service.ConvierteDatos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Maneja la interaccion con el usuario
 */
public class Principal {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Menu menu = new Menu();

    /**
     * Punto de entrada a la aplicacion. Maneja las opciones que permiten hacer uso de la misma.
     */
    public void principal() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println(Constantes.menu);
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("*** Opcion incorrecta ***");
            }
            switch (opcion) {
                case 1:
                    menu.opcion1();
                    break;
                case 2:
                    menu.opcion2();
                case 0:
                    break;
                default:
                    System.out.println("*** Opcion incorrecta ***");
            }
        }
    }
}
