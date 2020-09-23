/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.Gersoncruz09.operaciones;

import co.edu.sanmateo.codigofuente.Gersoncruz09.modelo.Estudiante;
import java.util.Scanner;

/**
 *
 * @author _Asap
 */
public class Universidad {

    private String nombre;

    public Universidad() {
    }

    public Estudiante crearEstudiante() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Ingresando un nuevo estudiante");
        System.out.println("Nombre completo del estudiante");
        String nombre = entrada.nextLine();
        
        System.out.println("Cedula del estudiante");
        String cedula = entrada.nextLine();

        Estudiante estudiante = new Estudiante(nombre, cedula);
        System.out.println("--------------------------------");

        return estudiante;
    }
}
