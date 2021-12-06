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

    public Concurso(int id, String nombre, Date fecha, Date fechaInscripcion, Date fechaCierreInscripcion, String tematica, Double costo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaCierreInscripcion = fechaCierreInscripcion;
        this.tematica = tematica;
        this.costo = costo;
        this.inscripciones = new ArrayList<>();
        this.premios = new ArrayList<>();
        this.criterios = new ArrayList<>();
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
    
    //##########Setters##########

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
    public void addInscripcion(Inscripcion i1){
        this.inscripciones.add(i1);
    }
    
    public void addPremio(Premio p1){
        this.premios.add(p1);
    }
    
    public void addCriterio(Criterio c1){
        this.criterios.add(c1);
    }
    
    @Override
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        for (Inscripcion i : this.inscripciones){
            sb.append("Inscripcion ");
            sb.append(i.getId());
            sb.append(":<Id de Mascota: ");
            sb.append(i.getIdMascota());
            sb.append(", Descuento: ");
            sb.append(i.getDescuento());
            sb.append(">, "); 
        }
        
        StringBuilder sb_premio = new StringBuilder();
        for (Premio p : this.premios){
            sb_premio.append("Premio: ");
            sb_premio.append(p.getId());
            sb_premio.append(", ");
        }
        
        StringBuilder sb_criterio = new StringBuilder();
        for (Criterio c : this.criterios){
            sb_criterio.append("Criterio: ");
            sb_criterio.append(c.getId());
            sb_criterio.append(",");
        }
        
        return "Concurso "+this.id+" :{Nombre: "+this.nombre+", Fecha: "+this.fecha+", Fecha de inscripcion: "+this.fechaInscripcion+", Fecha de cierre de inscripcion: "+this.fechaCierreInscripcion+", Tematica: "+this.tematica+", Costo de Inscripcion: "+this.costo+", Inscripciones:["+sb.toString()+"], Premios:["+sb_premio.toString()+"], Criterios:["+sb_criterio.toString()+"]}";
    }
    
    
}
