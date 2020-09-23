/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.YcifuentesA.operaciones;

import co.edu.sanmateo.codigofuente.YcifuentesA.modelo.Estudiante;
import java.util.Scanner;

/**
 *
 * @author yonie
 */
public class Universidad {
    public Estudiante crearEstudiante(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Ingresando un nuevo estudiante");
        System.out.println("Nombre completo del estudiante");
        String nombre = entrada.nextLine();
        
        System.out.println("Cedula del estudiante");
        String cedula = entrada.nextLine();
        
        Estudiante estudiante = new Estudiante(nombre, cedula);
        System.out.println("--------------------");
        
        return estudiante;
    }
}
