/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.IngMauriciop;
import co.edu.sanmateo.codigofuente.IngMauriciop.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.IngMauriciop.modelo.operaciones.Univesrsidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author patinojm
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Univesrsidad universidad = new Univesrsidad();
        
        System.out.println("Bienvenido a la universidad San Mateo");
        System.out.println("-------- Menu ------------");
        System.out.println("1. Registrar Estudiante");
        System.out.println("0. Salir");
        int opcion = entrada.nextInt();
        if(opcion == 0){
            System.out.println("Saliendo....");
            System.exit(0);
        }else if(opcion == 1){
            Estudiante estu = universidad.crearEstudiante();
            listaEstudiante.add(estu);
            System.out.println("El estudiante: "+estu.nombreCompleto+"Se creo en la universidad FUS");
        }
    }
}
    

