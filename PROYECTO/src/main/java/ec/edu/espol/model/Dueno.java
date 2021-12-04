/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;
import ec.edu.espol.util.Util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Scanner;

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
        this.mascotas= new ArrayList<>();
    }
    
    public Dueno(int id, String nombres, String apellidos, String direccion){
        super(id,nombres,apellidos);
        this.direccion = direccion;
        this.mascotas = new ArrayList<>();
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public void saveFile(String File) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNombres() {
        return nombres;
}

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String getEmail() {
        return email;
    }
    
    public static Dueno nextDueno(Scanner sc, String nomFile ){
        nomFile = null;
        int id_0 = Util.nextID(nomFile);
        String nomb = sc.nextLine();
        String nomb_0 = sc.nextLine();
        return null;
    }
    
    
}
