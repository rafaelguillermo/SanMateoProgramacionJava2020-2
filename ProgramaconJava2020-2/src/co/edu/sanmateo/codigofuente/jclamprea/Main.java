/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.jclamprea;

import co.edu.sanmateo.codigofuente.jclamprea.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.jclamprea.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {

            System.out.println("Bienvenido a la Universidad San Juan");
            System.out.println("Menu Principal");
            System.out.println("1 Regstrar un estudiante");
            System.out.println("0 para salir del menu");
            int opcion = entrada.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante nuevo = universidad.crearEstudiante();
                listaEstudiante.add(nuevo);
                System.out.println("\n Se ha creado el estudiante " + nuevo.nombrecompleto + " correctamente");

            }

        }
    }

}
