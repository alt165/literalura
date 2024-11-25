package com.alt165.Literalura.model;

public enum IdiomaEnum {
    INGLES("EN"),
    ESPANOL("ES"),
    PORTUGUES("PT");

    private String idioma;
    IdiomaEnum(String idioma) {
        this.idioma = idioma;
    }
}
