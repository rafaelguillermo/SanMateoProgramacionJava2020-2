/*
                    FUNDACIÓN UNIVERSITARIA SAN MATEO
                     FACULTAD DE INGENIERÍA Y AFINES
                         INGENIERÍA DE SISTEMAS
                              GRUPO O1N30
                              BOGOTÁ D,C.
                                  2020
       
 */
package co.edu.sanmateo.codigofuente.YersonRomero;

import co.edu.sanmateo.codigofuente.YersonRomero.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.YersonRomero.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 public static void main (String[] args){
     
     Scanner entrada = new Scanner(System.in);
     List<Estudiante> listaEstudiante = new ArrayList<>();
     Universidad universidad = new Universidad();
     
        while (true) {
            System.out.println("\033[35mBienvenidos a la Fundación Universitaria San Mateo");
            System.out.println("\033[34m------ Menú ------");
            System.out.println("\033[32m1. Registrar Estudiante");
            System.out.println("\033[31m0. Salir");
            int opcion = entrada.nextInt();
            if (opcion == 0) {
                System.out.println("\033[31mSaliendo...");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu);
                System.out.println("\033[36mEl estudiante " + estu.nombreCompleto + " ha sido ingresado a la iniversidad");
            }
        }
    }
}
