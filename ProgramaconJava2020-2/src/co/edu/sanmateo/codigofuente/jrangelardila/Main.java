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
                    + "1- Registrar un nuevo estudiante\n0- Salir\n");
            int option = input.nextInt();
            if (option == 0) {
                System.out.println("Saliendo......");
                System.exit(0);
            } else if (option == 1) {
                Estudiante newStudent = university.newStudent();
                listEstudents.add(newStudent);
                System.out.println("\nEl estudiante " + newStudent.name + " ha sido registrado\n");
            }
        }

    }

}
