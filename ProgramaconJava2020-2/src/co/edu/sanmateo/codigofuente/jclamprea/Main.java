package co.edu.sanmateo.codigofuente.jclamprea;

import co.edu.sanmateo.codigofuente.jclamprea.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.jclamprea.operaciones.Universidad;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public Main() {
        System.out.println("Menu universidad");
    }

    public void ejecutarMenu() throws IOException {
        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();

        File fileLectura = new File("C:\\Users\\juanc\\Documents\\NetBeansProjects\\SanMateoProgramacionJava2020-2\\Base Estudiantes\\estudiantes.txt");
        Scanner leerArchivo = new Scanner(fileLectura);
        while (leerArchivo.hasNextLine()) {
            String linea = leerArchivo.nextLine();
            System.out.println(linea);

            String arreglo[] = linea.split(",");
            Estudiante estudiante = new Estudiante(arreglo[1], arreglo[0]);
            listaEstudiante.add(estudiante);
        }
        Universidad universidad = new Universidad();
        while (true) {

            System.out.println("Bienvenido a la Universidad San Juan");
            System.out.println("Menu Principal");
            System.out.println("1 Regstrar un estudiante");
            System.out.println("2 Lista de estudiantes");
            System.out.println("3 Buscar un estudiante");
            System.out.println("4 Guardar datos de los estudiantes");
            System.out.println("5 Eliminar los datos de un estudiante");
            System.out.println("6 Modificar los datos de un estudiante");
            System.out.println("0 para salir del menu");
            int opcion = entrada.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante busqueda = universidad.buscarEstudiante(entrada, listaEstudiante);
                if (busqueda != null) {
                    System.out.println("El estudiante ya existe: " + busqueda.nombrecompleto);
                } else {

                    Estudiante nuevo = universidad.crearEstudiante();
                    listaEstudiante.add(nuevo);
                    System.out.println("Se ha creado el estudiante " + nuevo.nombrecompleto + " correctamente");
                    System.out.println("");
                }
                }else if (opcion == 2) {
                System.out.println("\nCantidad de Estudiantes Regitrados : " + listaEstudiante.size());
                System.out.println("Documento          Nombre");
                System.out.println("----------------------------");
                for (int i = 0; i < listaEstudiante.size(); i++) {
                    Estudiante estudiante = listaEstudiante.get(i);
                    System.out.println(estudiante.cedula + "                " + estudiante.nombrecompleto);
                }
                System.out.println("----------------------------");
            } else if (opcion == 3) {
                System.out.println("Digite la cedula del estudiante:");
                String busqueda;
                busqueda = entrada.next();
                System.out.println("Estudiante no encontrado");
                System.out.println("-------------------------");
                for (int i = 0; i < listaEstudiante.size(); i++) {
                    Estudiante estudiante = listaEstudiante.get(i);

                    if (estudiante.cedula.equals(busqueda)) {
                        System.out.println("los datos del estudiante encontrado son:");
                        System.out.println("\nDocumento" + " " + estudiante.cedula + " " + "Nombre : " + estudiante.nombrecompleto);
                        System.out.println("----------------------------");

                    }
                }

            } else if (opcion == 4) {
                FileWriter escritura = new FileWriter("C:\\Users\\juanc\\Documents\\NetBeansProjects\\SanMateoProgramacionJava2020-2\\Base Estudiantes\\estudiantes.txt", false);
                BufferedWriter bufered = new BufferedWriter(escritura);

                for (int indice = 0; indice < listaEstudiante.size(); indice++) {

                    Estudiante estudiante = listaEstudiante.get(indice);
                    bufered.write(estudiante.cedula + "," + estudiante.nombrecompleto);
                    bufered.write("\n");
                }
                bufered.close();
                System.out.println("Los estudiantes han sido guardados correctamente.");
            } else if (opcion == 5) {

                Estudiante estudianteBuscado = universidad.buscarEstudiante(entrada, listaEstudiante);
                if (estudianteBuscado != null) {
                    listaEstudiante.remove(estudianteBuscado);
                    System.out.println("Se ha eliminado al estudiante: " + estudianteBuscado.nombrecompleto);
                } else {
                    System.out.println("LO SIENTO, NO PUEDO ELIMINAR UN ESTUDIANTE QUE NO EXISTE");
                }
            } else if (opcion == 6) {

                Estudiante estudianteBuscado = universidad.buscarEstudiante(entrada, listaEstudiante);
                if (estudianteBuscado != null) {
                    Estudiante nuevo = universidad.crearEstudiante();
                    listaEstudiante.remove(estudianteBuscado);
                    listaEstudiante.add(nuevo);
                    System.out.println("Se ha modificado el estudiante" + nuevo.nombrecompleto + " correctamente");
                    System.out.println("");
                } else {
                    System.out.println("LO SIENTO, NO PUEDO MODIFICAR UN ESTUDIANTE QUE NO EXISTE");
                }

            }

            }

        }

    

    public static void main(String[] args) throws IOException {

        Main m = new Main();
        m.ejecutarMenu();
    }
}
