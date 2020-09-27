
package co.edu.sanmateo.codigofuente.dgaitan861;

import co.edu.sanmateo.codigofuente.dgaitan861.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.dgaitan861.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad=new Universidad();
        while (true){
            System.out.println("Bienvenido a la universidad san mateo");
            System.out.println("-------Menu----------");
            System.out.println("1. Registrar estudiante");
            System.out.println("0. Salir");
            int opcion = entrada.nextInt();
            if (opcion == 0){
                System.out.println("Saliendo....");
                System.exit(0);
                
            } else if (opcion == 1){
                Estudiante estu=universidad.crearEstudiante();
                listaEstudiante.add(estu);
                System.out.println("El estudiante: "  + estu.nombreCompleto+" Ha sido ingresaddo a la universidad");
            }
        }
    }
    
}
