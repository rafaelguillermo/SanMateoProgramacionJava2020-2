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
        System.out.println("Constryendo la clase desde una instancia");
    }

    public void ejecutarMenu() throws IOException {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();

        File filelectura = new File("C:\\Users\\duvan\\OneDrive\\Escritorio\\info\\estudiantes.txt");
        Scanner leerArchivo = new Scanner(filelectura);
        while (leerArchivo.hasNextLine()) {
            String linea = leerArchivo.nextLine();
            System.out.println("---LINEA---" + linea);

            String arreglo[] = linea.split(",");

            Estudiante estudiante = new Estudiante(arreglo[1], arreglo[0]);
            listaEstudiante.add(estudiante);
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
            System.out.println("5) Eliminar estudiante");
            System.out.println("6) Convertir nombre a mayusculas");
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
                //Inicializacion
                //Pregunta
                //Incremento
                System.out.println("ESTUDIANTES A MOSTRAR" + listaEstudiante.size());
                System.out.println("DOCUMENTO:                NOMBRE:");
                System.out.println("-----------------------------------");

                for (int i = 0; i < listaEstudiante.size(); i++) {
                    Estudiante estudiante = listaEstudiante.get(i);
                    System.out.println(estudiante.cedula + "               " + estudiante.nombreCompleto);
                }
                System.out.println("-------------------------------");
                    
            } else if (opcion == 3) {

                Estudiante estudianteBuscado = universidad.buscarEstudiante(entrada,listaEstudiante);
                if( estudianteBuscado != null){
                    System.out.println("ESTUDIANTE ENCONTRADO..."+estudianteBuscado.nombreCompleto);
                }else{
                    System.out.println("lo siento, el estudiante buscado no fue encontrado");
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
                
                Estudiante estudianteBuscado = universidad.buscarEstudiante(entrada,listaEstudiante);
                if( estudianteBuscado != null){
                    listaEstudiante.remove(estudianteBuscado);
                    System.out.println("El estudiante fue eliminado exitosamente");
                }else{
                    System.out.println("El estudiante no existe, no se puede eliminar");
                }

            } else if (opcion == 6) {
                
                Estudiante estudianteBuscado = universidad.buscarEstudiante(entrada,listaEstudiante);
                if( estudianteBuscado != null){
                    for (int i = 0; i < listaEstudiante.size(); i++) {
                        Estudiante estuMinusculas = listaEstudiante.get(i);
                        
                    }
                }else{
                    System.out.println("lo siento, el estudiante buscado no fue encontrado");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.ejecutarMenu();
    }
}
