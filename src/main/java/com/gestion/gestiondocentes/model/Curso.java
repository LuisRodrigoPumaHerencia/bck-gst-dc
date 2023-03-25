package com.gestion.gestiondocentes.model;

import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "curso_seq", sequenceName = "curso_seq", allocationSize = 1)
    @Column(name = "id_curso")
    private Long idCurso;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "lugar_curso", nullable = false, length = 100)
    private String lugarCurso;

    @Column(name = "horario")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "es-PE", timezone = "America/Latina")
    private Date horario;

    @ManyToOne
    @JoinColumn(name = "id_docente_fk", referencedColumnName = "id_docente")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Docente docente;

    public Curso(Long idCurso, String nombre, String lugarCurso, Date horario, Docente docente) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.lugarCurso = lugarCurso;
        this.horario = horario;
        this.docente = docente;
    }

    public Curso() {
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarCurso() {
        return lugarCurso;
    }

    public void setLugarCurso(String lugarCurso) {
        this.lugarCurso = lugarCurso;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    
}
