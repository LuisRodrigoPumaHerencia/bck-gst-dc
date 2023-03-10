package com.gestion.gestiondocentes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.gestiondocentes.model.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Long>{
    
}
