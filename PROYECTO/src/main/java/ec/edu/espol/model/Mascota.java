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
 * @author Issac Maza
 */
public class Mascota {
    private int id;
    private String nombre;
    private String raza;
    private Date fechaNacimiento;
    private String tipo;
    private int idDueno;
    private Dueno dueno;
    private ArrayList<Inscripcion> inscripciones = new ArrayList();
    
    public Mascota(int id, String nombre, String raza, Date fechaNacimiento, String tipo, int idDueno, Dueno dueno,ArrayList<Inscripcion> inscripciones ){
        this.id=id;
        this.nombre=nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo=tipo;
        this.idDueno = idDueno;
        this.dueno=dueno;
        this.inscripciones = inscripciones;
        
        
        
    } 

    public ArrayList<Inscripcion> getInscripciones() {
        return inscripciones;
    }
    
    
}
