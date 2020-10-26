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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public Main(){
        System.out.println("Construyendo la clase desde una instancia");
    }

    public void ejecutarMenu() throws IOException {
        
        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        
               File fileLectura = new File("C:\\Users\\57311\\Documents\\estudiantes.txt"); 
        Scanner leerArchivo = new Scanner(fileLectura); 
        while (leerArchivo.hasNextLine()) {
            String linea = leerArchivo.nextLine();
            System.out.println("LINEA:" + linea);
        } 
        
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
            System.out.println("|4. Guardar información del Estudiante|");
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
            }else if(opcion == 4){
                FileWriter fileWriter = new FileWriter("C:\\Users\\57311\\Documents\\estudiantes.txt", false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                for(int indice=0; indice < listaEstudiante.size(); indice ++ ){

                    Estudiante estudiante = listaEstudiante.get(indice);
                    bufferedWriter.write(estudiante.cedula+","+estudiante.nombreCompleto);
                    bufferedWriter.write("\n");
                }
                bufferedWriter.close();
                System.out.println("Estudiante ha sido guardado correctamente");
            }
        }
    }
    
    public static void main(String[] args) throws IOException {

        Main m = new Main();
        m.ejecutarMenu();
        
    }
}
