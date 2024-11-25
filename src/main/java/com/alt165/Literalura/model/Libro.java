package com.alt165.Literalura.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "libros")
public class Libro {
    @Id
    private Long id;
    private String titulo;
    private Integer cantidadDeDescargas;
    @ManyToMany
    @JoinTable(name
            = "libro_autor",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id"))
    private List<DatosAutor> autores;
    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL)
    private List<String> idiomas;

    public Libro() {
    }

    public Libro(DatosLibro datosLibro) {
        this.titulo = datosLibro.titulo();
        this.cantidadDeDescargas = datosLibro.cantidadDeDescargas();
        this.autores = datosLibro.autores();
        this.idiomas = datosLibro.idiomas();
    }
}
