package com.gestion.gestiondocentes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="docente")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "docente_seq", sequenceName = "docente_seq", allocationSize = 1)
    @Column(name = "id_docente")
    private Long idDocente;

    @Column(name = "primerNombre")
    private String primerNombre;

    @Column(name = "segundoNombre")
    private String segundoNombre;

    @Column(name = "primerApellido")
    private String primerApellido;

    @Column(name = "segundoApellido")
    private String segundioApellido;

    @Column(name = "especialidad")
    private String especialidad;

    

    public Docente() {
    }

    public Docente(Long idDocente, String primerNombre, String segundoNombre, String primerApellido,
            String segundioApellido, String especialidad) {
        this.idDocente = idDocente;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundioApellido = segundioApellido;
        this.especialidad = especialidad;
    }

    public Long getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Long idDocente) {
        this.idDocente = idDocente;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundioApellido() {
        return segundioApellido;
    }

    public void setSegundioApellido(String segundioApellido) {
        this.segundioApellido = segundioApellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
}
