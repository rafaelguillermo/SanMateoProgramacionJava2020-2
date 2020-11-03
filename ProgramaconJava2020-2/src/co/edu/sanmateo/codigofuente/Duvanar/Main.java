package co.edu.sanmateo.codigofuente.Duvanar;

import co.edu.sanmateo.codigofuente.Duvanar.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.Duvanar.operaciones.Universidad;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public Main() {
        System.out.println("Constructor");
    }

    public static void EjecutarMenu() throws IOException {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        
        File filelectura = new File("C:\\Users\\duvan\\OneDrive\\Escritorio\\info\\estudiantes.txt");
        Scanner leerArchivo = new Scanner(filelectura);
        while (leerArchivo.hasNextLine()) {
            String linea = leerArchivo.nextLine();
            System.out.println(linea);
        }

        Universidad universidad = new Universidad();

        while (true) {

            System.out.println("------------------------");
            System.out.println("Bienvenidos a la universidad San Mateo");
            System.out.println("----------Menú----------");
            System.out.println("1) Registrar estudiante");
            System.out.println("2) Listar estudiantes");
            System.out.println("3) Buscar estudiante");
            System.out.println("4) Guardar información del estudiante");
            System.out.println("0) Salir");

            int opcion = entrada.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu);
                System.out.println("El estudiante: " + estu.nombreCompleto + " ha sido ingresado a la universidad");
            } else if (opcion == 2) {
                System.out.println("Los estudiantes registrados en el sistema son: ");
                System.out.println("NOMBRE:                CEDULA:");
                for (int i = 0; i < listaEstudiante.size(); i++) {
                    Estudiante estudiante = listaEstudiante.get(i);
                    System.out.println(estudiante.cedula + "               " + estudiante.nombreCompleto);
                }
                System.out.println("-------------------------------");
            } else if (opcion == 3) {
                System.out.println("Ingrese el numero de identificacións del estudiante");
                String identificacion = entrada.next();
                for (int i = 0; i < listaEstudiante.size(); i++) {
                    Estudiante estudiante = listaEstudiante.get(i);
                    if (estudiante.cedula.equals(identificacion)) {
                        System.out.println("Estudiante encontrado: " + estudiante.nombreCompleto);
                    }
                }
            } else if (opcion == 4) {
                FileWriter fileWriter = new FileWriter("C:\\Users\\duvan\\OneDrive\\Escritorio\\info\\estudiantes.txt", false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for (int i = 0; i < listaEstudiante.size(); i++) {
                    Estudiante estudiante = listaEstudiante.get(i);
                    bufferedWriter.write(estudiante.nombreCompleto + "," + estudiante.cedula);
                    bufferedWriter.write("\n");
                }
                bufferedWriter.close();
                System.out.println("Los estudiantes han sido guardados correctamente!");
            } else if (opcion == 5) {
                FileReader fileReader = new FileReader("C:\\Users\\duvan\\OneDrive\\Escritorio\\info\\estudiantes.txt");

            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.EjecutarMenu();
    }
}
