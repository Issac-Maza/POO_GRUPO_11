/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;
import java.util.Objects;

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
}
