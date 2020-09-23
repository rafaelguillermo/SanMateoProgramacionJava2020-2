/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.Gersoncruz09;

import co.edu.sanmateo.codigofuente.Gersoncruz09.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.Gersoncruz09.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author _Asap
 */
public class Main {
    
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();
        
        while(true){
            System.out.println("Bienvenido a la universidad San Mateo");
            System.out.println("------ Menu ------");
            System.out.println("1. Registrar Estudiante");
            System.out.println("0. Sliar");
            int opcion = entrada.nextInt();
            if(opcion == 0) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else if (opcion == 1 ) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu);
                System.out.println("El estudiante: "+estu.nombreCompleto + "ha sido ingresado a al universidad");
            }
        }
    }
    
}
