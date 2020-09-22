package co.edu.sanmateo.codigofuente.Duvanar;

import co.edu.sanmateo.codigofuente.Duvanar.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.Duvanar.operaciones.Universidad;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        System.out.println("Bienvenidos a la universidad San Mateo");
        System.out.println("----------Menú----------");
        System.out.println("1) Registrar estudiante");
        System.out.println("0) Salir");

        int opcion = entrada.nextInt();

        if (opcion == 0) {
            System.out.println("Saliendo...");
            System.exit(0);
        } else if (opcion == 1) {
            Estudiante estu = universidad.crearEstudiante();
            listaEstudiante.add(estu);
            System.out.println("El estudiante: "+estu.nombreCompleto+" ha sido ingresado a la universidad");
        }

    }
}
