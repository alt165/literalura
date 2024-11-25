package com.alt165.Literalura.principal;

import com.alt165.Literalura.model.RespuestaRecord;
import com.alt165.Literalura.service.Constantes;
import com.alt165.Literalura.service.ConsultaAPI;
import com.alt165.Literalura.service.ConvierteDatos;

import java.util.Scanner;

/**
 * Esta clase se encarga de manejar las opciones posibles del menu
 */
public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private static final ConsultaAPI consultaAPI = new ConsultaAPI();
    private final ConvierteDatos conversor = new ConvierteDatos();

    /**
     * La opcion uno corresponde a 1.- Consulta de libros por título y/o autor.
     * Muestra por consola el listado de libros que coincidan con un patron de busqueda elegido.
     */
    protected void opcion1(){
        System.out.println("\tIngrese el texto a buscar");
        var texto = scanner.nextLine();
        muestraLibros(texto);
    }

    /**
     * La opcion dos corresponde a 2.- Consulta de todos los libros.
     * Muestra por consola la totalidad de los libros de la API.
     */
    public void opcion2() {
        muestraLibros("");
    }

    /**
     * Muestra por consola el listado completo de libros
     * @param texto el dato a buscar.
     */
    private void muestraLibros(String texto) {
        RespuestaRecord respuesta = obtenerRespuesta(texto);
        int paginaActual = 0;
        String datos;
        int cantidadDePaginas = (int) Math.ceil((double) respuesta.cantidad() / Constantes.RESULTADOS_POR_RESPUESTA);
        if (respuesta.cantidad() == 0) {
            System.out.println("No se encontraron libros con los datos enviados.");
        } else {
            System.out.println("La busqueda obtuvo " + respuesta.cantidad() + " resultados");
            while (true) {
                System.out.println("Para mostrar datos presione 'S'");
                var opcion = scanner.nextLine();
                if (opcion.compareToIgnoreCase("s") != 0) {
                    break;
                }
                paginaActual++;
                System.out.println("Mostrando pagina " + paginaActual + "/" + cantidadDePaginas);
                respuesta.libros().forEach(System.out::println);
                if (respuesta.siguiente() != null) {
                    datos = consultaAPI.buscaSiguiente(respuesta.siguiente());
                    respuesta = conversor.obtenerDatos(datos, RespuestaRecord.class);
                } else {
                    break;
                }
            }
        }
    }

    /**
     * Convierte a RespuestaRecord el JSON obtenido de la API.
     * @param texto el texto a buscar.
     * @return un RespuestaRecord con los datos buscados.
     */
    private RespuestaRecord obtenerRespuesta(String texto) {
        String datos = consultaAPI.obtieneRespuestaAPI(texto);
        return conversor.obtenerDatos(datos, RespuestaRecord.class);
    }
}
