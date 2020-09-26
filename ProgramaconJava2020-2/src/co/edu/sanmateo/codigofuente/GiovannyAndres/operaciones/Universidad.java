/*
                    FUNDACIÓN UNIVERSITARIA SAN MATEO
                    FACULTAD DE INGENIERÍAS Y AFINES
                        INGENIERÍA DE SISTEMAS
                              SEMESTRE VI
                                 2020
 */
package co.edu.sanmateo.codigofuente.GiovannyAndres.operaciones;

import co.edu.sanmateo.codigofuente.GiovannyAndres.modelo.Estudiante;
import java.util.Scanner;


public class Universidad {

    private String nombre;

    public Universidad() {
    }

    public Estudiante crearEstudiante() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("|--------------------------------|");
        System.out.println("| Ingresando un nuevo estudiante |");
        System.out.println("| Nombre completo del estudiante |");
        System.out.println("|--------------------------------|");
        String nombre = entrada.nextLine();
        System.out.println("|--------------------------------|");
        System.out.println("| Cedula del estudiante          |");
        System.out.println("|--------------------------------|");
        String cedula = entrada.nextLine();

        Estudiante estudiante = new Estudiante(nombre, cedula);
        System.out.println("|--------------------------------|");

        return estudiante;
    }
}
