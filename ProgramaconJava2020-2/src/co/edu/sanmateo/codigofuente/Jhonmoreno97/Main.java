1
package co.edu.sanmateo.codigofuente.Jhonmoreno97;

import co.edu.sanmateo.codigofuente.Jhonmoreno97.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.Jhonmoreno97.operaciones.Universidad;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public Main() {

        System.out.println("construyendo la clase desde una instancia");
    }

    public static void ejecutarmenu() throws IOException {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaestudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {

            System.out.println("Bienvenido a la universidad San Mateo");
            System.out.println("------Menu-------");
            System.out.println("1.Registrar estudiante");
            System.out.println("2.Listar estudiantes");
            System.out.println("3.Buscar estudiante en la lista");
            System.out.println("4. Guardar informacion de los estudiantes1"
                    + "");
            System.out.println("0. Salir");
            int opcion = entrada.nextInt();
            if (opcion == 0) {
                System.out.println("Saliendo....");
                System.exit(0);

            } else if (opcion == 1){
            
                

                    Estudiante estu = universidad.CrearEstudiante();
                    listaestudiante.add(estu);

                    System.out.println("El estudiante:" + estu.nombrecompleto + "ha sido ingresado a la universidad");
        }else if(opcion == 2){
                    
                    System.out.println("Estudiante a mostrar " +listaestudiante.size());
                    System.out.println("DOCUMENTO         NOMBRE COMPLETO");
                    System.out.println("-------------------------------");
                    
                    for (int indice=0; indice < listaestudiante.size(); indice ++){
                    
                        Estudiante estudiante = listaestudiante.get(indice);
                        System.out.println(estudiante.cedula+"      "+estudiante.nombrecompleto);
                }
            } else if(opcion ==3){
                    
                    System.out.println("Por favor ingrese la identificacion a buscar:  ");
                    String identificacion;
                    identificacion = entrada.next();
                   
                    for (int indice=0; indice < listaestudiante.size(); indice ++ ){
                     
                       Estudiante estudiante = listaestudiante.get(indice);
                    
                       if(estudiante.cedula.equals(identificacion)){
                        System.out.println("ESTUDIANTE ENCONTTRADO..."+estudiante.nombrecompleto);
                    
                    }
                    
                }
                    }else if (opcion ==4){      
                    
                        FileWriter fileWriter = new FileWriter("C:\\Users\\Familia\\Documents\\NetBeansProjects\\SanMateoProgramacionJava2020-2\\ProgramaconJava2020-2\\src\\co\\edu\\sanmateo\\codigofuente\\Jhonmoreno97\\estudi.txt",false);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    
                        for (int indice=0; indice < listaestudiante.size(); indice ++){
                    
                            Estudiante estudiante = listaestudiante.get(indice);
                            bufferedWriter.write(estudiante.cedula+","+estudiante.nombrecompleto);
                            bufferedWriter.write("\n");
                                
                    }
                    bufferedWriter.close();
                    System.out.println("Estudiantes han sido guardados exitosamente");
                    
                  
            }
            }
        }
    
    

    public static void main(String[] args) throws IOException {

        Main m = new Main();
        m.ejecutarmenu();
    }
}
