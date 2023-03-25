package com.gestion.gestiondocentes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.gestiondocentes.model.Curso;
import com.gestion.gestiondocentes.repository.CursoRepository;

@Service
public class CursoService {
    
    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }

    public Curso registrarCurso(Curso curso){
        Curso cursoLocal = cursoRepository.getByNombre(curso.getNombre());
        if(cursoLocal!=null){
            return null;
        }else{
            cursoRepository.save(curso);
            return curso;
        }
    }

    public Curso actualizarCurso(Curso curso){
        Optional<Curso> cursoLocal = cursoRepository.findById(curso.getIdCurso());
        
        if(cursoLocal.isPresent()){
            //ACTUALIZANDO DATOS
            cursoLocal.get().setNombre(curso.getNombre());
            cursoLocal.get().setLugarCurso(curso.getLugarCurso());
            cursoLocal.get().setHorario(curso.getHorario());
            cursoLocal.get().setDocente(curso.getDocente());
            cursoRepository.save(cursoLocal.get());
            return cursoLocal.get();
        }else{
            return null;
        }
    }

    public Curso eliminarCurso (Long idCurso){
        Optional<Curso> cursoLocal = cursoRepository.findById(idCurso);
        if(cursoLocal.isPresent()){
            cursoRepository.delete(cursoLocal.get());
            return cursoLocal.get();
        }else{
            return null;
        }
    }

}
