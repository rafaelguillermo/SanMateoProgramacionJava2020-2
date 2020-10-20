/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.extrandres;

import co.edu.sanmateo.codigofuente.extrandres.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.extrandres.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lerman
 */
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {
            //MENU
            System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
            System.out.println(" BIENVENIDO A LA UNIVERSIDAD SAN MATEO");
            System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
            System.out.println("                  MENU");
            System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
            System.out.println("1. REGISTRAR ESTUDIANTE");
            System.out.println("2. LISTA ESTUDIANTES");
            System.out.println("3. BUSCAR ESTUDIANTE");
            System.out.println("0. Salir");
            System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
            System.out.println("             INGRESAR OPCION");
            int opcion = entrada.nextInt();
            if (opcion == 0) {
                System.out.println("Saliendo....");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu);
                System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
                System.out.println("EL ESTUDIANTE:  " + estu.nombreCompleto + " ESTA REGISTRADO");

            } else if (opcion == 2) {

                System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
                System.out.println("          LISTA DE ESTUDIANTES ");
                System.out.println("    NUMERO DE ESTUDIANTES REGISTRADOS " + listaEstudiante.size());
                System.out.println();

                for (int i = 0; i < listaEstudiante.size(); i++) {
                    Estudiante estudiante = listaEstudiante.get(i);
                    System.out.println("     DOCUMENTO          NOMBRE COMPLETO");
                    System.out.println("        " + estudiante.cedula + "                 " + estudiante.nombreCompleto);
                }

            } else if (opcion == 3) {
                System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
                System.out.println("    INGRESAR DOCUMENTO DEL ESTUDIANTE");
                String identificacion = entrada.next();

                for (int i = 0; i < listaEstudiante.size(); i++) {

                    Estudiante estudiante = listaEstudiante.get(i);
                    if (estudiante.cedula.equals(identificacion)) {
                        System.out.println("☆☆★★★★★★★★★★★★★★★★★★★★★★★★★★★☆☆");
                        System.out.println("EL DOCUMENTO PERTENECE AL ESTUDIANTE: " + estudiante.nombreCompleto);
                        
                    }
                }
            }

        }

    }
}
