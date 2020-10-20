/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.extrandres.operaciones;

import co.edu.sanmateo.codigofuente.extrandres.modelo.Estudiante;
import java.util.Scanner;

/**
 *
 * @author lerman
 */
public class Universidad {
    
     public Estudiante crearEstudiante(){
        
        // instanciar clase scanner
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
        System.out.println("          INGRESANDO ESTUDIANTE");
        System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
        System.out.println("      NOMBRE COMPLETO DEL ESTUDIANTE");
        System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
        String nombre = entrada.nextLine();
        
        
        System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
        System.out.println("          CEDULA DEL ESTUDIANTE");
        System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
        String cedula = entrada.nextLine();
        
        Estudiante estudiante = new Estudiante(nombre, cedula);
        
        
        return estudiante;
    }
    
}
