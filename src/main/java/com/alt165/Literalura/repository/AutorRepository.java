package com.alt165.Literalura.repository;

import com.alt165.Literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor,Long> {
    Optional<Autor> findByNombre(String nombreAutor);
}
