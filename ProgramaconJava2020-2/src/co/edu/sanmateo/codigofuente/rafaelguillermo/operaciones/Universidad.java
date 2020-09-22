package co.edu.sanmateo.codigofuente.rafaelguillermo.operaciones;

import co.edu.sanmateo.codigofuente.rafaelguillermo.modelo.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Rafael Guillermo Blanco Banquez <rafaelg.blancob@gmail.com>
 */
public class Universidad {

    public Universidad() {
    }
    
    
    public Estudiante crearEstudiante(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------------------------");
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
