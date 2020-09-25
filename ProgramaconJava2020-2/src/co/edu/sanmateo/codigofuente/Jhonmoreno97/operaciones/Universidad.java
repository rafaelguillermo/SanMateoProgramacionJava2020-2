
package co.edu.sanmateo.codigofuente.Jhonmoreno97.operaciones;

import co.edu.sanmateo.codigofuente.Jhonmoreno97.modelo.Estudiante;
import java.util.Scanner;


public class Universidad {
    
    public Estudiante CrearEstudiante(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("--------------");
        System.out.println("Ingresando un nuevo estudiante");
        System.out.println("Nombre completo estudiante");
        String nombre = entrada.nextLine();
        
        System.out.println("Cedula estudiante");
        String cedula = entrada.nextLine();
        
        Estudiante estudiante = new Estudiante(nombre, cedula);
        System.out.println("---------------------------");
        
        return estudiante;
        
       
    }
    
}
