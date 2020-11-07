package co.edu.sanmateo.codigofuente.jrangelardila;

import co.edu.sanmateo.codigofuente.jrangelardila.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.jrangelardila.operaciones.Universidad;
import java.io.*;
import java.util.*;

/**
 *
 * @author jrangelardila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public void menu() {
        List<Estudiante> listEstudents = new ArrayList<>();

        //traer estudiantes guardados
        try {
            File fileSaved = new File("/home/jrangelardila/NetBeansProjects/SanMateoProgramacionJava2020-2/SanMateoProgramacionJava2020-2/ProgramaconJava2020-2/src/co/edu/sanmateo/codigofuente/jrangelardila/Students.txt");
            Scanner readFile = new Scanner(fileSaved);
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String identification = "";
                String name = "";
                boolean coma = false;
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ',' && coma == false) {
                        identification = identification + line.charAt(i);
                    } else if (line.charAt(i) == ',' && coma == false) {
                        coma = true;
                    }
                    if (line.charAt(i) != ',' && coma == true) {
                        name = name + line.charAt(i);
                    }
                }
                Estudiante student = new Estudiante(name, identification);
                listEstudents.add(student);
            }

        } catch (Exception e) {
            System.out.println("\n El archivo no existe: " + e);
        }

        Scanner input = new Scanner(System.in);
        Universidad university = new Universidad();
        while (true) {
            System.out.println("\nBienvenidos a la Fundación Universitaria San Mateo\n"
                    + "-----------------------MENÚ-----------------------\n"
                    + "1- Registrar un nuevo estudiante\n"
                    + "2- Listar estudiantes\n"
                    + "3- Buscar estudiantes en la lista\n"
                    + "4- Guardar estudiantes\n"
                    + "5- Borrar estudiante\n"
                    + "6- Editar nombre de estudiante\n"
                    + "0- Salir\n");
            int option = input.nextInt();
            if (option == 0) {
                System.out.println("Saliendo......");
                System.exit(0);
            } else if (option == 1) {
                Estudiante newStudent = university.newStudent();
                Boolean valido = university.validarCedula(listEstudents, newStudent.identification);
                if (valido == true) {
                    listEstudents.add(newStudent);
                    System.out.println("\nEl estudiante " + newStudent.name + " ha sido registrado\n");
                } else {
                    System.out.println("\nEl estudiante " + newStudent.identification + " ya estaba registrado\n");
                }
            } else if (option == 2) {
                System.out.println("ESTUDIANTES A MOSTRAR " + listEstudents.size());
                for (int i = 0; i < listEstudents.size(); i++) {
                    Estudiante estudiante = listEstudents.get(i);
                    System.out.println(estudiante.identification + "      " + estudiante.name);
                }
            } else if (option == 3) {
                System.out.println("Ingresar el numero de indentificación a buscar:\n");
                String identificactionSearch = input.next();
                boolean search = false;
                Estudiante newStudent = null;
                for (int i = 0; i < listEstudents.size(); i++) {
                    newStudent = listEstudents.get(i);
                    if (newStudent.identification.equals(identificactionSearch)) {
                        search = true;
                        i = listEstudents.size();
                    }
                }
                if (search == true) {
                    System.out.println("Estudiante identificado con " + identificactionSearch + " ha sido encontrado: " + newStudent.name + "\n");
                } else {
                    System.out.println("Estudiante identificado con " + identificactionSearch + " no hs sido encontrado\n");
                }
            } else if (option == 4) {
                try {
                    FileWriter fileWriter = new FileWriter("/home/jrangelardila/NetBeansProjects/SanMateoProgramacionJava2020-2/SanMateoProgramacionJava2020-2/ProgramaconJava2020-2/src/co/edu/sanmateo/codigofuente/jrangelardila/Students.txt", false);
                    BufferedWriter file = new BufferedWriter(fileWriter);
                    for (int i = 0; i < listEstudents.size(); i++) {
                        Estudiante estudiante = listEstudents.get(i);
                        file.write(estudiante.identification + "," + estudiante.name + "\n");
                    }
                    System.out.println("\nLos estudintes han sido guardados");
                    file.close();
                } catch (Exception e) {
                    System.out.println("\nLa ubicación es erronea: " + e);
                }
            } else if (option == 5) {
                System.out.println("Ingresar el numero de indentificación a buscar:\n");
                String identificactionSearch = input.next();
                boolean search = false;
                Estudiante newStudent = null;
                for (int i = 0; i < listEstudents.size(); i++) {
                    newStudent = listEstudents.get(i);
                    if (newStudent.identification.equals(identificactionSearch)) {
                        System.out.println("Estudiante identificado con " + identificactionSearch + " nombre: " + newStudent.name + " ha sido borrado\n");
                        listEstudents.remove(newStudent);
                        search = true;
                        break;
                    }
                }
                if (search == false) {
                    System.out.println("Estudiante identificado con " + identificactionSearch + " no ha sido encontrado\n");
                }
            } else if (option == 6) {
                Scanner entrada = new Scanner(System.in);
                System.out.println("\n¿Cuál es la cedula del estudiante a cambiar nombre?\n");
                String cedula = entrada.nextLine();
                Boolean search = university.validarCedula(listEstudents, cedula);
                if (search == false) {
                    System.out.println("\n¿Cuál es el nuevo nombre?\n");
                    String nombre = entrada.nextLine();
                    university.editarNOmbre(listEstudents, cedula, nombre);
                    System.out.println("\nEl estudiante identificado con " + cedula + " ha sido actualizado");
                } else {
                    System.out.println("\nEl estudiante identificado con " + cedula + " no existe");
                }
            }
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Main main = new Main();
        main.menu();
    }

}
