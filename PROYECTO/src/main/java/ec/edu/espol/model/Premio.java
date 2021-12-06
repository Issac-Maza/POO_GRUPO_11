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
        System.out.println("Ingrese el ID del Premio:");
        int id_next=sc.nextInt();
        System.out.println("Ingrese el Lugar de premio:");
        sc.nextLine();
        String lugar_next = sc.nextLine();
        System.out.println("Ingrese la descripcion del premio:");
        String descripcion_next = sc.nextLine();
        System.out.println("Ingrese la fecha de INICIO de las inscripciones del Concurso:");
        int idConcurso_next = sc.nextInt();
        sc.nextLine();
        
        Scanner sc1 = new Scanner(System.in);
        Concurso concurso_next = Concurso.nextConcurso(sc1);

        Premio p=new Premio(id_next,lugar_next,descripcion_next,idConcurso_next,concurso_next);
        return p;
    }
    
    
}
