package co.edu.sanmateo.codigofuente.jrangelardila;

import co.edu.sanmateo.codigofuente.jrangelardila.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.jrangelardila.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jrangelardila
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Estudiante> listEstudents = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Universidad university = new Universidad();
        while (true) {
            System.out.println("Bienvenidos a la Fundación Universitaria San Mateo\n"
                    + "-----------------------MENÚ-----------------------\n"
                    + "1- Registrar un nuevo estudiante\n"
                    + "2- Listar estudiantes\n"
                    + "3- Buscar estudiantes en la lista\n"
                    + "4- "
                    + "0- Salir\n");
            int option = input.nextInt();
            if (option == 0) {
                System.out.println("Saliendo......");
                System.exit(0);
            } else if (option == 1) {
                Estudiante newStudent = university.newStudent();
                listEstudents.add(newStudent);
                System.out.println("\nEl estudiante " + newStudent.name + " ha sido registrado\n");
            } else if(option ==2){
                System.out.println("ESTUDIANTES A MOSTRAR "+ listEstudents.size());
                for (int i = 0; i < listEstudents.size(); i++) {
                    Estudiante estudiante = listEstudents.get(i);
                    System.out.println(estudiante.identification + "      " + estudiante.name);
                }
            } else if(option ==3){
                System.out.println("Ingresar el numero de indentificación a buscar:\n");
                String identificactionSearch=input.next();
                boolean search=false;
               Estudiante newStudent=null;
                for(int i=0;i<listEstudents.size();i++){
                     newStudent=listEstudents.get(i);
                    if(newStudent.identification.equals(identificactionSearch)){
                        search=true;
                        i=listEstudents.size();
                    }
                }
                
               if(search==true){
                    System.out.println("Estudiante identificado con "+identificactionSearch+" ha sido encontrado: "+newStudent.name+"\n");
               }else{
                   System.out.println("Estudiante identificado con "+identificactionSearch+" no hs sido encontrado\n");
               }
            }
        }

    }

}
