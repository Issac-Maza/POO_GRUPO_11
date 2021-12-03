/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Eduardo Vasquez
 */
public class Evaluacion {
    private int id;
    private int idInscripcion;
    private String eMienbroJurado;
    private int criterio;
    private double nota;

    public Evaluacion(int id, int idInscripcion, String eMienbroJurado, int criterio, double nota) {
        this.id = id;
        this.idInscripcion = idInscripcion;
        this.eMienbroJurado = eMienbroJurado;
        this.criterio = criterio;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public String getIdMienbroJurado() {
        return eMienbroJurado;
    }

    public int getCriterio() {
        return criterio;
    }

    public double getNota() {
        return nota;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public void setIdMienbroJurado(String eMienbroJurado) {
        this.eMienbroJurado = eMienbroJurado;
    }

    public void setCriterio(int criterio) {
        this.criterio = criterio;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "La nota del jurado " + eMienbroJurado + " para la mascota " + idInscripcion + " en el criterio " + criterio + " es: " + nota;
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
        Evaluacion r=(Evaluacion)obj;
        return this.id==r.id;
    }
    
    public void saveFile(String nomFile){
        try(PrintWriter pw=new PrintWriter(new FileOutputStream(new File(nomFile)))){
            pw.println(this.toString());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }
}