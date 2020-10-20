/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.lddaza.operaciones;

import co.edu.sanmateo.codigofuente.lddaza.modelo.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Universidad {
    
    
    public  Estudiante crearEstudiante(){{
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("-----------------------------");
   
    System.out.println("Ingrese el nombre del estudiante");
    
    System.out.println("Nombre del estudiante");
    String nombre = entrada.nextLine();
    
    System.out.println("Cédula del estudiante");
    String cedula = entrada.nextLine();
    
    Estudiante e= new Estudiante(nombre,cedula);    
    System.out.println("-----------------------------");
    
    return e;
    }
    }
}