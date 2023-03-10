package com.gestion.gestiondocentes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.gestiondocentes.model.Docente;
import com.gestion.gestiondocentes.services.DocenteService;

@RestController
@RequestMapping("api/docentes")
@CrossOrigin("*")
public class DocenteController {
    
    @Autowired
    private DocenteService docenteService;

    @GetMapping("/lista")
    public List<Docente> listarDocentes() throws Exception{
        return docenteService.listarDocentes();
    }

}
