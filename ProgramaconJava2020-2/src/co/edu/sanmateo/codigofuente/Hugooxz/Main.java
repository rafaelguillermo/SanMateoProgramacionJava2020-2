
package co.edu.sanmateo.codigofuente.Hugooxz;

import co.edu.sanmateo.codigofuente.Hugooxz.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.Hugooxz.operaciones.Universidad;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public void mostrarMenu() throws IOException {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {
            System.out.println("Bienvenido a la Fundación Universitaria San Mateo");
            System.out.println("****** Menu de la Universidad ******");
            System.out.println("Seleccione una de las siguintes opciones:");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar estudiante (documento)");
            System.out.println("4. Guardar información de los estudiantes");
            System.out.println("0. Salir");
            System.out.println("-----------------------");
            int opcion = entrada.nextInt();
            if (opcion == 0) {
                System.out.println("Saliendo....");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estudiantes = universidad.crearEstudiante();
                listaEstudiante.add(estudiantes);
                System.out.println("El estudiante: " + estudiantes.nombreCompleto + " ha sido ingresado a la universidad");
                System.out.println("-------------------------------------");
            } else if (opcion == 2) {
                //Inicializar la cantidad de estudiantes
                //Pregunta 
                //Incremento

                System.out.println("Los estudiantes a mostrar son: " + listaEstudiante.size());
                System.out.println("DOCUMENTO                       NOMBRE");
                System.out.println("----------------------------------------------------------");

                //Inicia el For que iniciara el recorrido imprimiendo todos los estudiantes de la lista
                for (int indice = 0; indice < listaEstudiante.size(); indice++) {
                    Estudiante estudiante = listaEstudiante.get(indice);
                    System.out.println(estudiante.cedula + "                     " + estudiante.nombreCompleto);
                }
                System.out.println("----------------------------------------------------------");
            } else if (opcion == 3) {
                System.out.println("Escriba la cedula del estudiante a buscar");
                System.out.println("-------------------------");
                String docBuscar = entrada.next();
                int existe = 0;
                for (int indice = 0; indice < listaEstudiante.size(); indice++) {
                    Estudiante estudiante = listaEstudiante.get(indice);
                    if (estudiante.cedula.equals(docBuscar)) {
                        System.out.println("El estudiante si existe en la lista");
                        System.out.println(estudiante.nombreCompleto + "       " + estudiante.cedula);
                        System.out.println("------------------------------");
                        existe = 1;
                    }
                }
                if (existe == 0) {
                    System.out.println("El estudiante con documento " + docBuscar + " no existe en la lista");
                    System.out.println("------------------------------");
                }

            } else if (opcion == 4) {
                //System.out.println("");
                FileWriter fw = new FileWriter("C:\\Users\\LuckRotz\\Documents\\NetBeansProjects\\Base\\estudiantes2.txt", false);
                BufferedWriter bw = new BufferedWriter(fw);

                for (int indice = 0; indice < listaEstudiante.size(); indice++) {

                    Estudiante estudiante = listaEstudiante.get(indice);
                    bw.write(estudiante.cedula + "," + estudiante.nombreCompleto);
                    bw.write("\n");
                }
                fw.close();
                System.out.println("Los estudiantes han sido guardados correctamente.");

            } else if (opcion == 5) {
                FileReader fr = new FileReader("C:\\Users\\LuckRotz\\Documents\\NetBeansProjects\\Base\\estudiantes2.txt");
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {

        Main m = new Main();
        m.mostrarMenu();

    }
}