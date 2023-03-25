package com.gestion.gestiondocentes.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public Docente registrarDocente(Docente docente){
        Docente docenteLocal = docenteRepository.getByPrimerNombreAndSegundoApellido(docente.getPrimerNombre(), docente.getSegundoApellido());
        if(docenteLocal!=null){
            return null;
        }else{
            docenteRepository.save(docente);
            return docente;
        }
    }

    public Docente actualizarDocente(Docente docente){
        Optional<Docente> docenteLocal = docenteRepository.findById(docente.getIdDocente());
        if(docenteLocal.isPresent()){
            //ACTUALIZANDO DATOS
            docenteLocal.get().setPrimerNombre(docente.getPrimerNombre());
            docenteLocal.get().setSegundoNombre(docente.getSegundoNombre());
            docenteLocal.get().setPrimerApellido(docente.getPrimerApellido());
            docenteLocal.get().setSegundoApellido(docente.getSegundoApellido());
            docenteLocal.get().setEspecialidad(docente.getEspecialidad());
            docenteRepository.save(docenteLocal.get());
            return docenteLocal.get();
        }else{
            return null;
        }
    }

    public Docente eliminarDocente (Long idDocente){
        Optional<Docente> docenteLocal = docenteRepository.findById(idDocente);
        if(docenteLocal.isPresent()){
            docenteRepository.delete(docenteLocal.get());
            return docenteLocal.get();
        }else{
            return null;
        }
    }

    public List<Docente> buscarDocente (String palabra, String tipoBusqueda){
        List<Docente> listaDocenteLocal = new ArrayList<>();
        switch (tipoBusqueda) {
            case "primerNombre":
                listaDocenteLocal = docenteRepository.findAll().stream().filter(docente -> docente.getPrimerNombre().equals(palabra)).sorted(Comparator.comparing(Docente::getPrimerNombre)).collect(Collectors.toList());
                break;
            case "segundoNombre":
                listaDocenteLocal = docenteRepository.findAll().stream().filter(docente -> docente.getSegundoNombre().equals(palabra)).sorted(Comparator.comparing(Docente::getPrimerNombre)).collect(Collectors.toList());
                break;
            case "primerApellido":
                listaDocenteLocal = docenteRepository.findAll().stream().filter(docente -> docente.getPrimerApellido().equals(palabra)).sorted(Comparator.comparing(Docente::getPrimerNombre)).collect(Collectors.toList());
                break;
            case "segundoApellido":
                listaDocenteLocal = docenteRepository.findAll().stream().filter(docente -> docente.getSegundoApellido().equals(palabra)).sorted(Comparator.comparing(Docente::getPrimerNombre)).collect(Collectors.toList());
                break;
            case "especialidad":
                listaDocenteLocal = docenteRepository.findAll().stream().filter(docente -> docente.getEspecialidad().equals(palabra)).sorted(Comparator.comparing(Docente::getPrimerNombre)).collect(Collectors.toList());
                break;
        }
        return listaDocenteLocal;
    }

}
