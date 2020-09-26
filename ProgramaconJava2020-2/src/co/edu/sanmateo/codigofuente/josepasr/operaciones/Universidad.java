
package co.edu.sanmateo.codigofuente.josepasr.operaciones;
import co.edu.sanmateo.codigofuente.josepasr.modelo.Estudiante;
import java.util.Scanner;


public class Universidad {
    

public Universidad(){

}
public Estudiante crearEstudiante(){
Scanner entrada =new Scanner (System.in);
    System.out.println("---------------------------------------");
    System.out.println("Ingresando Un Nuevo Estudiante");
    System.out.println("Nombre Completo Del Estudiante");
    String nombre =entrada.nextLine();
    
    System.out.println("Cedula Del Estudiante");
    String cedula= entrada.nextLine();
    Estudiante estudiante =new Estudiante (nombre, cedula);
    System.out.println("--------------------------------------");
    return estudiante;

}
}

