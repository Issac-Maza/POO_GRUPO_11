/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.util.ArrayList;

/**
 *
 * @author Issac Maza
 */
public class Dueno extends Persona{
    private String direccion;
    private ArrayList<Mascota> mascotas;
    
    public  Dueno(int id, String nombres, String apellidos, String telefono, String email,String direccion, ArrayList<Mascota> mascotas){
        super(id,nombres,apellidos,telefono,email);
        this.direccion=direccion;
        this.mascotas= new ArrayList();
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
