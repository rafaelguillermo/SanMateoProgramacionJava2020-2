/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.jclamprea.modelo;

/**
 *
 * @author portatil
 */
public class Estudiante {
    public String nombrecompleto;
    public String cedula;

    public Estudiante(String nombrecompleto, String cedula) {
        this.nombrecompleto = nombrecompleto.toUpperCase();
        this.cedula = cedula;
    }
        
}
