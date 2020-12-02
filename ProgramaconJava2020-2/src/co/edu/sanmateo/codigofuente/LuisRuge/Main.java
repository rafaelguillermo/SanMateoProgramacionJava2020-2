package co.edu.sanmateo.codigofuente.LuisRuge;

import co.edu.sanmateo.codigofuente.LuisRuge.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.LuisRuge.operaciones.Universidad;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public Main() {
        System.out.println("Construyendo la clase desde una instanacia");
    }
    
    public void ejecutarMenu() throws IOException{
        
        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        
        Universidad universidad = new Universidad();

        while (true) {
            
            System.out.println("Bienvenido a la universidad San Mateo > LUIS RUGE");
            System.out.println("-------- Menu ------------");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar Estudiante en la lista");
            System.out.println("4. Guardar informacion de los estudiantes");
            System.out.println("5. Listar Estudiantes en Mayúsculas");
            System.out.println("6. Actualizar Estudiantes");
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
                System.out.println("Por favor ingrese la identificación a buscar: ");
                String identificacion;
                identificacion = entrada.next();
                
                for(int indice=0; indice < listaEstudiante.size(); indice ++ ){
                    
                    Estudiante estudiante = listaEstudiante.get(indice);
                    
                    if(estudiante.cedula.equals(identificacion)){
                        System.out.println("ESTUDIANTE ENCONTRADO..."+estudiante.nombreCompleto);
                    }
                    //System.out.println(estudiante.cedula+"      "+estudiante.nombreCompleto);
                }
            }else if(opcion == 4){
                ///System.out.println("");
                FileWriter fileWriter = new FileWriter("C:\\Users\\RUGE\\Documents\\Ejercicios Java\\estudiantes.txt", false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                
                for(int indice=0; indice < listaEstudiante.size(); indice ++ ){
                    
                    Estudiante estudiante = listaEstudiante.get(indice);
                    bufferedWriter.write(estudiante.cedula+","+estudiante.nombreCompleto);
                    bufferedWriter.write("\n");
          
                  }
                bufferedWriter.close();
                System.out.println("Estudiantes han sido guardado correctamente");
            }else if (opcion == 5) {
                //Inicializacion
                //Pregunta
                //Incremento
                System.out.println("ESTUDIANTES A MOSTRAR: "+listaEstudiante.size());
                System.out.println("DOCUMENTO       NOMBRE COMPLETO");
                System.out.println("---------------------------------");
                
                for(int indice=0; indice < listaEstudiante.size(); indice ++ ){
                    
                    Estudiante estudiante = listaEstudiante.get(indice);
                    System.out.println(estudiante.cedula+"      "+estudiante.nombreCompleto.toUpperCase());
                }
            }else if (opcion == 6) {
                System.out.println("Por favor ingrese la identificación para actualizar: ");
                String identificacion;
                String nuevonombre;
                
                identificacion = entrada.next();
   
           
                for(int indice=0; indice < listaEstudiante.size(); indice ++ ){
                    
                    Estudiante estudiante = listaEstudiante.get(indice);
                    
                    if(estudiante.cedula.equals(identificacion)){
                        System.out.println("Estudiante encontrado. Por favor Ingrese el nuevo nombre: ");
                        nuevonombre = entrada.next();
                        estudiante.nombreCompleto = nuevonombre;
                        estudiante.cedula = identificacion;
                        listaEstudiante.set(indice, estudiante);
                        
                    }
                    System.out.println(estudiante.cedula+"      "+estudiante.nombreCompleto);
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {

        Main m = new Main();
        m.ejecutarMenu();

    }
}
