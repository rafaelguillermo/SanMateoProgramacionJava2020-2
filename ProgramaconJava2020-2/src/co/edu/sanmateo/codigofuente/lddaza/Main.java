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
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class Main {
   public static void main(String[] args) {
      
       
       Scanner entrada = new Scanner(System.in);
       List<Estudiante> listaEstudiante = new ArrayList<>();
       Universidad universidad= new Universidad();
    
       while (true) {           
           System.out.println("BIENVENIDOS A LA UNIVERSIDAD SAN MATEO");
    
       System.out.println("------Menú------");
       System.out.println("1.Registrar Estudiante");
       System.out.println("2.Listar estudiantes");
       System.out.println("3.Buscar estudiante");
       System.out.println("0. Salir");
       int opcion=entrada.nextInt();
       if(opcion == 0){
       System.out.println("Saliendo...");
       System.exit(0);
       }else if(opcion == 1){
       Estudiante estudi = universidad.crearEstudiante();
       listaEstudiante.add(estudi);
           System.out.println("El estudiante"+ estudi.nombrecompleto+ " ha sido registrado correctamente");
        }else if(opcion == 2){
        //1.inicializamos 
        //2.pregunta o condicion
        //3.incremento
           System.out.println("IDENTIFICACIÓN      NOMBRE COMPLETO"); 
           System.out.println("-------------------------------------------"); 
           for (int indice=0; indice< listaEstudiante.size(); indice++) {
               Estudiante estudiante = listaEstudiante.get(indice);
               System.out.println(estudiante.cedula+"       "+estudiante.nombrecompleto);       
           }
    
        }
        } 
    }
        
  }
   

