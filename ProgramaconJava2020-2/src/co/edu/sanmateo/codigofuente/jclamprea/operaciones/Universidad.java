/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.jclamprea.operaciones;

import co.edu.sanmateo.codigofuente.jclamprea.modelo.Estudiante;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class Universidad {

    public Universidad() {
    }
    
    
    public Estudiante crearEstudiante(){
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("--------------------------");
        System.out.println("Ingresando un nuevo estudiante");        
        System.out.println("Digite el nombre completo del estudiante:");  
        String nombre = entrada.nextLine();
        
        System.out.println("Digite la cedula del estudiante:");  
        String cedula = entrada.nextLine();
        
        Estudiante estudiante = new Estudiante(nombre,cedula);
        System.out.println("----------------------------");
        
        return estudiante;
    }
    
}
