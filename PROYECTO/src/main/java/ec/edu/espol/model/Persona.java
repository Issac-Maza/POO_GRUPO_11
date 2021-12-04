/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Issac Maza
 */
public abstract class Persona {
    public int id;
    public String nombres;
    public String apellidos;
    public String telefono;
    public String email;
    
    public Persona(int id, String nombres, String apellidos, String telefono, String email){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
    }
    public Persona(int id, String nombres, String apellidos){
        this.id=id;
        this.nombres=nombres;
        this.apellidos=apellidos;
        
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

    @Override
    public String toString() {
        return "Persona{" + "Id:" + id + ", Nombres:" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona pers = (Persona) obj;
        return this.id == pers.id && Objects.equals(this.nombres, pers.nombres) && Objects.equals(this.apellidos, pers.apellidos);
        
 
    }
    
    
    
    public abstract void saveFile(String File);

}
    

