/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.jclamprea.operaciones;

import co.edu.sanmateo.codigofuente.jclamprea.modelo.Estudiante;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class Universidad {

    public Universidad() {
    }
    public Estudiante buscarEstudiante(Scanner entrada, List<Estudiante> listaEstudiante){
        
        System.out.println("Por favor ingrese el número de identificación: ");
        String identificacion;
        identificacion = entrada.next();

        for(int indice=0; indice < listaEstudiante.size(); indice ++ ){

            Estudiante estudiante = listaEstudiante.get(indice);

            if(estudiante.cedula.equals(identificacion)){
                return estudiante;
            }
            //System.out.println(estudiante.cedula+"      "+estudiante.nombreCompleto);
        }
        return null;
    }
    
    public Estudiante crearEstudiante(){
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("--------------------------");
        System.out.println("Ingresando un nuevo estudiante");        
        System.out.println("Digite el nombre completo del estudiante:");  
        String nombre = entrada.nextLine();
        
        System.out.println("Digite la cedula del estudiante:");  
        String cedula = entrada.nextLine();
        
        Estudiante estudiante = new Estudiante(nombre,cedula);
        System.out.println("----------------------------");
        
        return estudiante;
    }
    
}
