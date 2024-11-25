package com.alt165.Literalura.service;

/**
 * Esta clase contiene todas las constantes que utilizara la aplicacion.
 */
public class Constantes {
    // La URL donde buscar los datos en la API
    public static final String URL_BASE = "https://gutendex.com/books/?search=";

    // Cantidad maxima de resultados que puede traer cada respuesta de la API
    public static final int RESULTADOS_POR_RESPUESTA = 32;

    // Plantilla con el menu a mostrar en la pantalla principal
    public static final String menu =
            "\n\t******************\n" +
                    "\t*** Literalura ***\n" +
                    "\t******************\n" +
                    "Aplicación de consulta de libros\n" +
                    "********************************\n" +
                    "Elija la opción deseada\n" +
                    "1.- Consulta de libros por titulo y/o autor.\n" +
                    "2.- Consulta de todos los libros.\n" +
                    "0.- Salir\n" +
                    "-> ";
}
