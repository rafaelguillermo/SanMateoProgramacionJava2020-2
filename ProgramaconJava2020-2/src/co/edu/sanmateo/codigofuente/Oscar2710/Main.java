package co.edu.sanmateo.codigofuente.Oscar2710;

import co.edu.sanmateo.codigofuente.Oscar2710.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.Oscar2710.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {
            System.out.println("Bienvenido a la Universidad San Mateo");
            System.out.println("-------- MENU ------------");
            System.out.println("1. Registro Estudiante");
            System.out.println("0. Salir");
            int opcion = entrada.nextInt();
            if (opcion == 0) {
                System.out.println("Salir*****");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu);
                System.out.println("El estudiante: " + estu.nombreCompleto + " ha sido ingresado a la universidad");
            }
        }

    }
}
