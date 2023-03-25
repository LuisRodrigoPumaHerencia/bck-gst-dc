package com.gestion.gestiondocentes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.gestiondocentes.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{
    Curso getByNombre(String nombreCurso);
}
