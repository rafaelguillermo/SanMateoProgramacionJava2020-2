/*
                    FUNDACIÓN UNIVERSITARIA SAN MATEO
                    FACULTAD DE INGENIERÍAS Y AFINES
                        INGENIERÍA DE SISTEMAS
                              SEMESTRE VI
                                 2020
 */
package co.edu.sanmateo.codigofuente.GiovannyAndres;

import co.edu.sanmateo.codigofuente.GiovannyAndres.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.GiovannyAndres.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {
            System.out.println("|-------------------------------------|");
            System.out.println("|Bienvenido a la Universidad San Mateo|");
            System.out.println("|--------------- Menú ----------------|");
            System.out.println("|1. Registrar Estudiante              |");
            System.out.println("|0. Salir                             |");
            System.out.println("|-------------------------------------|");
            int opcion = entrada.nextInt();
            if (opcion == 0) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu);
                System.out.println("El estudiante: " + estu.nombreCompleto + " se ha registrado en la Universidad");
            }
        }
    }

}


