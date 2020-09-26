package co.edu.sanmateo.codigofuente.josepasr;

import co.edu.sanmateo.codigofuente.josepasr.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.josepasr.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main (String[]args){
    Scanner entrada= new Scanner (System.in);
    List <Estudiante> listaEstudiante =new ArrayList<>();
    Universidad universidad= new Universidad();
    while (true){
        System.out.println("Bienvenido A La Fundacion Universitaria San Mateo");
        System.out.println("-------------Menu-------------");
        System.out.println("1. Registrar Estudiante");
        System.out.println("0. Salir");
        int opcion= entrada.nextInt();
        if(opcion==0){
            System.out.println("Saliendo del proyecto............");
            System.exit(0);
                        
        }else if (opcion==1) {
            Estudiante estu=universidad.crearEstudiante();
            listaEstudiante.add(estu);
            System.out.println("El estudiante: "+ estu.nombreCompleto+ "Ha sido ingresado al sistema de la universidad");
            
        }
        
    }
       
}
}
