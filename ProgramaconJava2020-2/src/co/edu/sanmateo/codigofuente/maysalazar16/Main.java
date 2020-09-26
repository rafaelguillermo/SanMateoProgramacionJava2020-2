/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.maysalazar16;

import co.edu.sanmateo.codigofuente.maysalazar16.Modelo.Estudiante;
import co.edu.sanmateo.codigofuente.maysalazar16.Operaciones.Universidad;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Msalazar
 */
public class Main {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();
        
        while (true) {
        System.out.println("Bienvenido a la Universidad San Mateo");
        System.out.println("---------Menu-------");
          System.out.println("1.Registrar Estudiante");
            System.out.println("0.Salir");
                int opcion = entrada.nextInt();
                if(opcion == 0 ){
                    System.out.print("Saliendo....");
                    System.exit(0);
                }else if(opcion == 1){
                    Estudiante estu = universidad.crearEstudiante();
                    listaEstudiante.add(estu);
                    System.out.print("El estudiante: "+estu.nombreCompleto+" Ha sido registrado.");
                }
        }
    }
    
}