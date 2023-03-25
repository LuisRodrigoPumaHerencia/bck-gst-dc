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

import com.gestion.gestiondocentes.model.Curso;
import com.gestion.gestiondocentes.services.CursoService;

@RestController
@RequestMapping("api/cursos")
@CrossOrigin("*")
public class CursoController {
    
    @Autowired
    private CursoService cursoService;

    @GetMapping("/lista")
    public List<Curso> listarCursos() throws Exception{
        return cursoService.listarCursos();
    }

    @PostMapping("/registrar_curso")
    public Curso registrarCurso(@RequestBody Curso curso) throws Exception{
        return cursoService.registrarCurso(curso);
    }

    @PutMapping("/actualizar_curso")
    public Curso actualizarCurso(@RequestBody Curso curso) throws Exception{
        return cursoService.actualizarCurso(curso);
    }

    @DeleteMapping("/eliminar_curso/{idCurso}")
    public Curso eliminarCurso(@PathVariable("idCurso") Long idCurso) throws Exception{
        return cursoService.eliminarCurso(idCurso);
    }

}
