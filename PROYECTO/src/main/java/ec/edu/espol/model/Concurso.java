/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ROMMEL ZAMORA
 */
public class Concurso {
    private int id;
    private String nombre;
    private Date fecha;
    private Date fechaInscripcion;
    private Date fechaCierreInscripcion;
    private String tematica;
    private Double costo;
    private ArrayList<Inscripcion> inscripciones;
    private ArrayList<Premio> premios;
    private ArrayList<Criterio> criterios;

    public Concurso(int id, String nombre, Date fecha, Date fechaInscripcion, Date fechaCierreInscripcion, String tematica, Double costo, ArrayList<Inscripcion> inscripciones, ArrayList<Premio> premios, ArrayList<Criterio> criterios) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaCierreInscripcion = fechaCierreInscripcion;
        this.tematica = tematica;
        this.costo = costo;
        this.inscripciones = inscripciones;
        this.premios = premios;
        this.criterios = criterios;
    }
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public Date getFechaCierreInscripcion() {
        return fechaCierreInscripcion;
    }

    public String getTematica() {
        return tematica;
    }

    public Double getCosto() {
        return costo;
    }

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public ArrayList<Premio> getPremios() {
        return premios;
    }

    public ArrayList<Criterio> getCriterios() {
        return criterios;
    }
    
    
}
