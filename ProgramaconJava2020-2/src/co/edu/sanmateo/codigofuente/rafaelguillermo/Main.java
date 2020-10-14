package co.edu.sanmateo.codigofuente.rafaelguillermo;

import co.edu.sanmateo.codigofuente.rafaelguillermo.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.rafaelguillermo.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael Guillermo Blanco Banquez <rafaelg.blancob@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        
        Universidad universidad = new Universidad();

        while (true) {
            
            System.out.println("Bienvenido a la universidad San Mateo > RAFAEL");
            System.out.println("-------- Menu ------------");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar Estudiante en la lista");
            System.out.println("0. Salir");
            
            int opcion = entrada.nextInt();
            
            if (opcion == 0) {
                System.out.println("Saliendo....");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu);
                System.out.println("El estudiante: " + estu.nombreCompleto + " ha sido ingresado a la universidad");
            }else if (opcion == 2) {
                //Inicializacion
                //Pregunta
                //Incremento
                System.out.println("ESTUDIANTES A MOSTRAR: "+listaEstudiante.size());
                System.out.println("DOCUMENTO       NOMBRE COMPLETO");
                System.out.println("---------------------------------");
                
                for(int indice=0; indice < listaEstudiante.size(); indice ++ ){
                    
                    Estudiante estudiante = listaEstudiante.get(indice);
                    System.out.println(estudiante.cedula+"      "+estudiante.nombreCompleto);
                }
            }else if(opcion == 3){
                System.out.println("Por ingrese la identificación a buscar: ");
                String identificacion;
                identificacion = entrada.next();
                
                for(int indice=0; indice < listaEstudiante.size(); indice ++ ){
                    
                    Estudiante estudiante = listaEstudiante.get(indice);
                    
                    if(estudiante.cedula.equals(identificacion)){
                        System.out.println("ESTUDIANTE ENCONTRADO..."+estudiante.nombreCompleto);
                    }
                    //System.out.println(estudiante.cedula+"      "+estudiante.nombreCompleto);
                }
            }
        }

    }
}
