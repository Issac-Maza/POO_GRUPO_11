/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;
import ec.edu.espol.util.Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public void saveFile(String nomFile) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(new File(nomFile),true))){
            pw.println(Util.nextID(nomFile)+"|"+this.nombres + "|" + this.apellidos + "|" + this.direccion + "|" + this.telefono + "|" + this.email );
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static ArrayList<Dueno> readFromFile(String nomFile) throws FileNotFoundException{
        ArrayList<Dueno> listad_0 = new ArrayList<>();
        try(Scanner sc = new Scanner(new File(nomFile))){
            while(sc.hasNextLine()){
                String linea = sc.nextLine();
                String[] partes = linea.split("\\|");
                Dueno due = new Dueno(Integer.parseInt(partes[0]), partes[1], partes[2], partes[3], partes[4], partes[5], partes[6]);
                listad_0.add(due);
            }
        }
        catch(Exception ex){
                    System.out.println(ex.getMessage());

        }
        return listad_0;
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
