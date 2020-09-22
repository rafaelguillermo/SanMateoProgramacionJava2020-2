/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.JohnsGalindo.Operaciones;

import co.edu.sanmateo.codigofuente.JohnsGalindo.Modelo.Estudiante;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Universidad {

    public Universidad() {
    }
    
    
    public Estudiante crearEstudiante(){
        
                Scanner entrada = new Scanner(System.in);
                System.out.println("----------------------------------");
                System.out.println("Ingrsando un nuevo Estudiante");
                System.out.println("Nombre completo del Extudiante: ");
                String nombre = entrada.nextLine();
                
                System.out.println("Cedula del estudiante: ");
                String cedula = entrada.nextLine();
                
                Estudiante estudiante = new Estudiante (nombre, cedula);
                return estudiante;
    }
    
}
