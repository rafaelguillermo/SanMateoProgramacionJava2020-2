/*
                    FUNDACIÓN UNIVERSITARIA SAN MATEO
                    FACULTAD DE INGENIERÍAS Y AFINES
                        INGENIERÍA DE SISTEMAS
                              SEMESTRE VI
                                 2020
 */
package co.edu.sanmateo.codigofuente.GiovannyAndres;

import co.edu.sanmateo.codigofuente.GiovannyAndres.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.GiovannyAndres.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {
            System.out.println("                                       ");
            System.out.println("|-------------------------------------|");
            System.out.println("|Bienvenido a la Universidad San Mateo|");
            System.out.println("|            Giovanny Andres          |");
            System.out.println("|--------------- Menú ----------------|");
            System.out.println("|1. Registrar Estudiante              |");
            System.out.println("|2. Listar Estudiantes                |");
            System.out.println("|3. Buscar Estudiante en la Lista     |");
            System.out.println("|0. Salir                             |");
            System.out.println("|-------------------------------------|");
            
            int opcion = entrada.nextInt();
            
            if (opcion == 0) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu);
                System.out.println("El estudiante: " + estu.nombreCompleto + " se ha registrado en la Universidad");
            } else if (opcion == 2) {

                System.out.println("|--------------------------------|");
                System.out.println("|ESTUDIANTES A MOSTRAR " + listaEstudiante.size() + "         |");
                System.out.println("|DOCUMENTO        NOMBRE COMPLETO|");
                System.out.println("|--------------------------------|");
                
                for(int indice = 0 ; indice < listaEstudiante.size();indice ++){
                    Estudiante estudiante = listaEstudiante.get(indice);
                    System.out.println(estudiante.cedula + "       " + estudiante.nombreCompleto);
                }
            }else if(opcion == 3){
                System.out.println("Por favor ingrese la identificación a buscar");
                String identificacion = entrada.next();
                
                for(int indice = 0 ; indice < listaEstudiante.size();indice ++){
                    
                    Estudiante estudiante = listaEstudiante.get(indice);
                    if(estudiante.cedula.equals(identificacion)){
                        System.out.println("ESTUDIANTE ENCONTRADO: " + estudiante.nombreCompleto);
                    }
                }
            }
        }
    }
}
