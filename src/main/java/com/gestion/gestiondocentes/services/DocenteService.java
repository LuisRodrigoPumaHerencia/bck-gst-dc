package com.gestion.gestiondocentes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.gestiondocentes.model.Docente;
import com.gestion.gestiondocentes.repository.DocenteRepository;

@Service
public class DocenteService {
    
    @Autowired
    private DocenteRepository docenteRepository;

    public List<Docente> listarDocentes(){
        return docenteRepository.findAll();
    }

}
