package com.alt165.Literalura.service;

/**
 *
 * Esta clase se encarga de obtener la respuesta de la API https://gutendex.com/
 * */
public class ConsultaAPI {

    /**
     *
     * */
    private ConsumoAPI consumoAPI = new ConsumoAPI();

    /**
     * Busca en la API los libros que contengan en su titulo y/o nombre del autor los datos pasados por parametro.
     * @param textoABuscar el dato a buscar.
     * @return un String con la respuesta obtenida
     * TODO convertir el formato de la respuesta a Json
     */
    public String obtieneRespuestaAPI(String textoABuscar) {
        String textoLimpio = limpiarTexto(textoABuscar);
        var json = consumoAPI.obtenerDatos(Constantes.URL_BASE+textoLimpio);
        return json;
    }

    /**
     * Prepara el String para que se pueda pasar a la API en el formato que acepta elimina los espacios al principio y
     * fin de la cadena, convierte a minusculas y reemplaza los espacios entre palabras por la cadena "%20".
     * @param texto la cadena a procesar.
     * @return un String con el formato necesario para procesar.
     */
    private String limpiarTexto(String texto) {
        String textoLimpio = texto.toLowerCase().strip().replace(" ", "%20");
        return textoLimpio;
    }
}
