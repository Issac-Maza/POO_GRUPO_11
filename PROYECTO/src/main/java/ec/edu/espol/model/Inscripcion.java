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
public class Inscripcion {
    private int id;
    private int idMascota;
    private Mascota mascota;
    private int idConcurso;
    private double valor;
    private double descuento;
    private ArrayList<Evaluacion> evaluaciones = new ArrayList() ;
}
