/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

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
    
    
}
