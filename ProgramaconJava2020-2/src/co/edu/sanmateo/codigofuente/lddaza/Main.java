/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.lddaza;

import static java.lang.System.out;
import java.util.List;
import java.util.Scanner;
import co.edu.sanmateo.codigofuente.lddaza.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.lddaza.operaciones.Universidad;
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();

        Universidad universidad = new Universidad();

        while (true) {

            System.out.println("BIENVENIDOS A LA UNIVERSIDAD SAN MATEO");
            System.out.println("------------------------------------------------");

            System.out.println("------MENÚ DE OPCIONES------------");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Guardar info de estudiantes");
            System.out.println("5. Importar info de estudiante");
            System.out.println("6. Modificar info de estudiante");
            System.out.println("7. Eliminar datos de estudiante");
            System.out.println("0. Salir");
            System.out.println("-----");
            int opcion = entrada.nextInt();
            System.out.println("-----");
            if (opcion == 0) {
                System.out.println("Saliendo...");
                System.exit(0);

            } else if (opcion == 1) {
                Estudiante estudi = universidad.crearEstudiante();
                listaEstudiante.add(estudi);
                System.out.println("El estudiante: " + estudi.nombrecompleto.toUpperCase() + " ha sido registrado correctamente");
            } else if (opcion == 2) {
                //1.inicializamos 
                //2.pregunta o condicion
                //3.incremento
                System.out.println("------------------------------------");
                System.out.println("IDENTIFICACIÓN      NOMBRE COMPLETO");
                System.out.println("-------------------------------------");
                for (int indice = 0; indice < listaEstudiante.size(); indice++) {
                    Estudiante estudiante = listaEstudiante.get(indice);
                    System.out.println(estudiante.cedula + "       " + estudiante.nombrecompleto.toUpperCase());
                }

            } else if (opcion == 3) {
                System.out.println("Ingrese el número de documento que desea encontrar:");
                String identidad = entrada.next();
                for (int indice = 0; indice < listaEstudiante.size(); indice++) {

                    Estudiante estudiante = listaEstudiante.get(indice);
                    if (estudiante.cedula.equals(identidad)) {
                        System.out.println("------------------------------------");
                        System.out.println("Los datos corresponden al estudiante: " + estudiante.nombrecompleto.toUpperCase());
                        System.out.println("------------------------------------");
                    }

                }
            } else if (opcion == 4) {
                FileWriter filew = new FileWriter("C:\\Users\\Admin\\Documents\\Universidad\\estudiantesSM.txt", true);
                try (BufferedWriter writer = new BufferedWriter(filew)) {
                    for (int indice = 0; indice < listaEstudiante.size(); indice++) {

                        Estudiante estudiante = listaEstudiante.get(indice);
                        writer.write("CÉDULA: " + estudiante.cedula + "       " + "NOMBRE DEL ESTUDIANTE: " + estudiante.nombrecompleto.toUpperCase());
                        writer.write("\n");
                    }
                }
                System.out.println("------------------------------------------------");
                System.out.println("La información ha sido almacenada correctamente");
                System.out.println("------------------------------------------------");

            } else if (opcion == 5) {

                try {
                    // Apertura del fichero y creacion de BufferedReader para poder
                    // hacer la lectura del archivo estudiantesSM y visualizarlo en el programa
                    File DBSanMateo = new File("C:\\Users\\Admin\\Documents\\Universidad\\estudiantesSM.txt");
                    FileReader fr = new FileReader(DBSanMateo);
                    BufferedReader br = new BufferedReader(fr);

                    // Lectura del fichero
                    String linea;
                    while ((linea = br.readLine()) != null) {

                        System.out.println(linea);
                        System.out.println("-------------------------");

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("----------------------------");
                    System.out.println("ERROR AL IMPORTAR LOS DATOS");
                    System.out.println("----------------------------");
                }

            } else if (opcion == 6) {

                System.out.println("Si desea modificar los datos de un estudiante, por favor ingrese el número de documento");
                String id;
                String newname;

                id = entrada.next();
                for (int i = 0; i < listaEstudiante.size(); i++) {

                    Estudiante estudiante = listaEstudiante.get(i);

                    if (estudiante.cedula.equals(id)) {
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("Se ha encontrado el estudiante: " + estudiante.nombrecompleto);
                        System.out.println("-------------------------------------------------------------");

                        System.out.println("NUEVO NOMBRE: ");
                        newname = entrada.next();
                        estudiante.nombrecompleto = newname;
                        estudiante.cedula = id;
                        listaEstudiante.set(i, estudiante);
                    }

                }
            } else if (opcion == 7) {
                System.out.println("Si desea modificar los datos de un estudiante, por favor ingrese el número de documento");
                String id;

                id = entrada.next();
                for (int i = 0; i < listaEstudiante.size(); i++) {

                    Estudiante estudiantebuscar = listaEstudiante.get(i);
                    if (estudiantebuscar.cedula.endsWith(id)) {
                        System.out.println("Se ha encontrado al estudiante: " + estudiantebuscar.nombrecompleto);
                        listaEstudiante.remove(estudiantebuscar);
                    }
                }
            }

        }
    }
}
