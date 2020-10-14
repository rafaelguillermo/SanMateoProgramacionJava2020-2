/*
                    FUNDACIÓN UNIVERSITARIA SAN MATEO
                     FACULTAD DE INGENIERÍA Y AFINES
                         INGENIERÍA DE SISTEMAS
                              GRUPO O1N30
                              BOGOTÁ D,C.
                                  2020
       
 */
package co.edu.sanmateo.codigofuente.YersonRomero;

import co.edu.sanmateo.codigofuente.YersonRomero.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.YersonRomero.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>(); //Creación de lista
        Universidad universidad = new Universidad();

        while (true) {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|Bienvenidos a la Fundación Universitaria San Mateo|");
            System.out.println("|---------------------- Menú ----------------------|");
            System.out.println("|1. Registrar Estudiante                           |");
            System.out.println("|2. Listar Estudiantes                             |");
            System.out.println("|3. Buscar Estudiante en la Lista                  |");
            System.out.println("|0. Salir                                          |");
            System.out.println("|--------------------------------------------------|");

            int opcion = entrada.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu); //El .add es para adicionar un estudiante a la lista.
                System.out.println("El estudiante " + estu.nombreCompleto + " ha sido ingresado a la iniversidad");
            } else if (opcion == 2) {
                //Un ciclo for realiza tres operaciones fundamentales de la siguiente manera:
                //1. Inicialización.
                //2. Pregunta.
                //3. Incrementa o Disminuye.
                System.out.println("ESTUDIANTES A MOSTRAR: " + listaEstudiante.size()); //El .size es para conocer el tamaño de la lista.
                System.out.println("DOCUMENTO      NOMBRE COMPLETO");
                System.out.println("|--------------------------------------------------|");
                for (int indice = 0; indice < listaEstudiante.size(); indice++) {
                    Estudiante estudiante = listaEstudiante.get(indice); //El .get es para mostrar la información de un estudiante.
                    System.out.println(estudiante.cedula + "      " + estudiante.nombreCompleto);
                }
            } else if (opcion == 3) {
                System.out.println("Por favor ingrese el número de identificación a buscar");
                String identificacion;
                identificacion = entrada.next();
                for (int indice = 0; indice < listaEstudiante.size(); indice++) {
                    Estudiante estudiante = listaEstudiante.get(indice); 
                    if (estudiante.cedula.equals(identificacion)){
                     System.out.println("Estudiante encontrado   "+ estudiante.nombreCompleto);   
                    }
                     System.out.println("Estudiante no encontrado   "+ estudiante.nombreCompleto);
                }
            }
        }
    }
}
