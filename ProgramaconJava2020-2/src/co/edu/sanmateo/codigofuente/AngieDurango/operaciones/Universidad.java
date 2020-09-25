package co.edu.sanmateo.codigofuente.AngieDurango.operaciones;

import co.edu.sanmateo.codigofuente.AngieDurango.modelo.Estudiante;
import java.util.Scanner;

public class Universidad {

    public Estudiante crearEstudiante() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Ingresando un nuevo studiante");
        System.out.println("Nombre completo estudiante");
        String nombre = entrada.nextLine();

        System.out.println("Cédula estudiante");
        String cedula = entrada.nextLine();

        Estudiante estudiante = new Estudiante(nombre, cedula);
        System.out.println("-------------------------");

        return estudiante;

    }
}
