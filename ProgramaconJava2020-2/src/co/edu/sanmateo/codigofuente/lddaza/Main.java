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
            System.out.println("1.Registrar Estudiante");
            System.out.println("2.Listar estudiantes");
            System.out.println("3.Buscar estudiante");
            System.out.println("4. Guardar info de estudiantes");
            System.out.println("5. Importar info de estudiante");
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
                System.out.println("El estudiante" + estudi.nombrecompleto + " ha sido registrado correctamente");
            } else if (opcion == 2) {
                //1.inicializamos 
                //2.pregunta o condicion
                //3.incremento
                System.out.println("------------------------------------");
                System.out.println("IDENTIFICACIÓN      NOMBRE COMPLETO");
                System.out.println("-------------------------------------");
                for (int indice = 0; indice < listaEstudiante.size(); indice++) {
                    Estudiante estudiante = listaEstudiante.get(indice);
                    System.out.println(estudiante.cedula + "       " + estudiante.nombrecompleto);
                }

            } else if (opcion == 3) {
                System.out.println("Ingrese el número de documento que desea encontrar:");
                String identidad = entrada.next();
                for (int indice = 0; indice < listaEstudiante.size(); indice++) {

                    Estudiante estudiante = listaEstudiante.get(indice);
                    if (estudiante.cedula.equals(identidad)) {
                        System.out.println("------------------------------------");
                        System.out.println("Los datos corresponden al estudiante: " + estudiante.nombrecompleto);
                        System.out.println("------------------------------------");
                    }

                }
            } else if (opcion == 4) {
                FileWriter filew = new FileWriter("C:\\Users\\Admin\\Desktop\\Universidad\\estudiantesSM.txt", true);
                BufferedWriter writer = new BufferedWriter(filew);

                for (int indice = 0; indice < listaEstudiante.size(); indice++) {

                    Estudiante estudiante = listaEstudiante.get(indice);
                    writer.write("CÉDULA: " + estudiante.cedula + "       " + "NOMBRE DEL ESTUDIANTE: " + estudiante.nombrecompleto);
                    writer.write("\n");
                }
                writer.close();
                System.out.println("------------------------------------------------");
                System.out.println("La información ha sido almacenada correctamente");
                System.out.println("------------------------------------------------");

            } else if (opcion == 5) {

                try {
                    // Apertura del fichero y creacion de BufferedReader para poder
                    // hacer una lectura comoda (disponer del metodo readLine()).
                    File DBSanMateo = new File("C:\\Users\\Admin\\Desktop\\Universidad\\estudiantesSM.txt");
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

            }
        }

    }
}
