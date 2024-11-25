package com.alt165.Literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "idiomas")
public class Idioma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    @Enumerated(EnumType.STRING)
    private IdiomaEnum idioma;
    @ManyToOne
    private Libro libro;

}
