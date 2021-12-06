/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.util.ArrayList;

/**
 *
 * @author ROMMEL ZAMORA
 */
public class Criterio {
    private int id;
    private String descripcion;
    private ArrayList<Evaluacion> evaluaciones;
    private int idConcurso;
    private Concurso concurso;

    public Criterio(int id, String descripcion,int idConcurso, Concurso concurso) {
        this.id = id;
        this.descripcion = descripcion;
        this.evaluaciones = new ArrayList<>();
        this.idConcurso = idConcurso;
        this.concurso = concurso;
    }
    

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public int getIdConcurso() {
        return idConcurso;
    }

    public Concurso getConcurso() {
        return concurso;
    }

    //##########Setters##########
    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdConcurso(int idConcurso) {
        this.idConcurso = idConcurso;
    }

    public void setConcurso(Concurso concurso) {
        this.concurso = concurso;
    }
    
    public void addEvaluacion(Evaluacion e1){
        this.evaluaciones.add(e1);
    }
    
    
    @Override
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        for (Evaluacion e : this.evaluaciones){
            sb.append("Evaluacion ");
            sb.append(e.getId());
            sb.append(":<Id de Inscripcion: ");
            sb.append(e.getIdInscripcion());
            sb.append(", Miembro de Jurado: ");
            sb.append(e.getIdMiembroJurado());

            sb.append(", Nota: ");
            sb.append(e.getNota());
            sb.append(">, "); 
        }
        
        return "Criterio "+this.id+" :{Descripcion: "+this.descripcion+", Evaluaciones:["+sb.toString()+"], ID de Concurso: "+this.idConcurso+"}";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Criterio c=(Criterio)obj;
        return this.id==c.id;
    }
    
}
