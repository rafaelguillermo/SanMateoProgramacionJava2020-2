package co.edu.sanmateo.codigofuente.Jhonmoreno97;

import co.edu.sanmateo.codigofuente.Jhonmoreno97.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.Jhonmoreno97.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaestudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {

            System.out.println("Bienvenido a la universidad San Mateo");
            System.out.println("------Menu-------");
            System.out.println("Registrsr estudiante");
            System.out.println("0. Salir");
            int opcion = entrada.nextInt();
            if (opcion == 0) {
                System.out.println("Saliendo....");
                System.exit(0);

            } else if (opcion == 1);
            {

                Estudiante estu = universidad.CrearEstudiante();
                listaestudiante.add(estu);

                System.out.println("El estudiante:" + estu.nombrecompleto + "ha sido ingresado a la universidad");
            }
        }
    }
}
