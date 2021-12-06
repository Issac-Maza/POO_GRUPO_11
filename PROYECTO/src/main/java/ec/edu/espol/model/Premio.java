/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import ec.edu.espol.util.Util;
import java.util.Scanner;

/**
 *
 * @author ROMMEL ZAMORA
 */
public class Premio {
    private int id;
    private String lugar;
    private String descripcion;
    private int idConcurso;
    private Concurso concurso;

    public Premio(int id, String lugar, String descripcion, int idConcurso, Concurso concurso) {
        this.id = id;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.idConcurso = idConcurso;
        this.concurso = concurso;
    }
    

    public int getId() {
        return id;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDescripcion() {
        return descripcion;
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

    public void setLugar(String lugar) {
        this.lugar = lugar;
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
    
    
    @Override
    public String toString(){
        return "Premio{ Id: "+this.id+", Lugar: "+this.lugar+", Descripcion: "+this.descripcion+", Id de Concurso: "+this.idConcurso+", Concurso: "+this.concurso+"}";
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
        Premio p=(Premio)obj;
        return this.id==p.id;
    }
    
    public static Premio nextPremio(Scanner sc){
        int id=Util.nextID("premios.txt");
        System.out.println("Lugar:");
        String lugar=sc.next();
        System.out.println("Descripcion de premio:");
        String descripcion=sc.next();
        System.out.println("Id del Concurso:");
        int idConcurso=sc.nextInt();
        //Falta agregar para un concurso
        Premio p=new Premio(id,lugar,descripcion,idConcurso,concurso);
        return p;
    }
    
    
}
