package co.edu.sanmateo.codigofuente.dmb2020.operaciones;
/**
 *
 * @author dbola
 */
import co.edu.sanmateo.codigofuente.dmb2020.modelo.Estudiante;
import java.util.Scanner;


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


