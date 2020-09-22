package co.edu.sanmateo.codigofuente.Duvanar.operaciones;

import co.edu.sanmateo.codigofuente.Duvanar.modelo.Estudiante;
import java.util.Scanner;

/**
 *
 * @author duvan
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

        System.out.println("Ingrese la cedula del estudiante");
        String cedula = entrada.nextLine();

        Estudiante estudiante = new Estudiante(nombre, cedula);
        System.out.println("---------------------------------");

        return estudiante;
    }

}
