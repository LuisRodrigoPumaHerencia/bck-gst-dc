package com.gestion.gestiondocentes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/registrar_docente")
    public Docente registrarDocente(@RequestBody Docente docente) throws Exception{
        return docenteService.registrarDocente(docente);
    }

    @PutMapping("/actualizar_docente")
    public Docente actualizarDocente(@RequestBody Docente docente) throws Exception{
        return docenteService.actualizarDocente(docente);
    }

    @DeleteMapping("/eliminar_docente/{idDocente}")
    public Docente eliminarDocente(@PathVariable("idDocente") Long idDocente) throws Exception{
        return docenteService.eliminarDocente(idDocente);
    }

    @GetMapping("/buscar_docente/{palabra}/{tipo}")
    public List<Docente> buscarDocente(@PathVariable("palabra") String palabra, @PathVariable("tipo") String tipo){
        return docenteService.buscarDocente(palabra, tipo);
    }

}
