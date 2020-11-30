package co.edu.sanmateo.codigofuente.dgaitan861;
import co.edu.sanmateo.codigofuente.dgaitan861.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.dgaitan861.operaciones.Universidad;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public void menu() {
        List<Estudiante> listaestudiante = new ArrayList<>();

        //traer estudiantes guardados
        try {
            File fileSaved = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\SanMateoProgramacionJava2020-2\\SanMateoProgramacionJava2020-2\\SanMateoProgramacionJava2020-2\\ProgramaconJava2020-2\\src\\co\\edu\\sanmateo\\codigofuente\\dgaitan861\\estudiante.txt");
            
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
                listaestudiante.add(student);
            }

        } catch (Exception e) {
            System.out.println("El archivo no existe: " + e);
        }

        Scanner input = new Scanner(System.in);
        Universidad university = new Universidad();
        while (true) {
            System.out.println("Bienvenidos a la Fundación Universitaria San Mateo"
                    + "-----------------------MENÚ-----------------------"
                    + "1- Registrar un nuevo estudiante"
                    + "2- Listar estudiantes"
                    + "3- Buscar estudiantes en la lista"
                    + "4- Guardar estudiantes"
                    + "5- Borrar estudiante"
                    + "6- Editar nombre de estudiante"
                    + "0- Salir");
            int option = input.nextInt();
            if (option == 0) {
                System.out.println("Saliendo......");
                System.exit(0);
            } else if (option == 1) {
                Estudiante newStudent = university.newStudent();
                Boolean valido = university.validarCedula(listaestudiante, newStudent.identification);
                if (valido == true) {
                    listaestudiante.add(newStudent);
                    System.out.println("El estudiante " + newStudent.name + " ha sido registrado");
                } else {
                    System.out.println("El estudiante " + newStudent.identification + " ya estaba registrado");
                }
            } else if (option == 2) {
                System.out.println("ESTUDIANTES A MOSTRAR " + listaestudiante.size());
                for (int i = 0; i < listaestudiante.size(); i++) {
                    Estudiante estudiante = listaestudiante.get(i);
                    System.out.println(estudiante.identification + "      " + estudiante.name);
                }
            } else if (option == 3) {
                System.out.println("Ingresar el numero de indentificación a buscar:");
                String identificactionSearch = input.next();
                boolean search = false;
                Estudiante newStudent = null;
                for (int i = 0; i < listaestudiante.size(); i++) {
                    newStudent = listaestudiante.get(i);
                    if (newStudent.identification.equals(identificactionSearch)) {
                        search = true;
                        i = listaestudiante.size();
                    }
                }
                if (search == true) {
                    System.out.println("Estudiante identificado con " + identificactionSearch + " ha sido encontrado: " + newStudent.name + "\n");
                } else {
                    System.out.println("Estudiante identificado con " + identificactionSearch + " no hs sido encontrado\n");
                }
            } else if (option == 4) {
                try {
                    FileWriter fileWriter = new FileWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\SanMateoProgramacionJava2020-2\\SanMateoProgramacionJava2020-2\\SanMateoProgramacionJava2020-2\\ProgramaconJava2020-2\\src\\co\\edu\\sanmateo\\codigofuente\\dgaitan861\\estudiante.txt", false);
                    BufferedWriter file = new BufferedWriter(fileWriter);
                    for (int i = 0; i < listaestudiante.size(); i++) {
                        Estudiante estudiante = listaestudiante.get(i);
                        file.write(estudiante.identification + "," + estudiante.name + "\n");
                    }
                    System.out.println("Los estudintes han sido guardados");
                    file.close();
                } catch (Exception e) {
                    System.out.println("La ubicación es erronea: " + e);
                }
            } else if (option == 5) {
                System.out.println("Ingresar el numero de indentificación a buscar:");
                String identificactionSearch = input.next();
                boolean search = false;
                Estudiante newStudent = null;
                for (int i = 0; i < listaestudiante.size(); i++) {
                    newStudent = listaestudiante.get(i);
                    if (newStudent.identification.equals(identificactionSearch)) {
                        System.out.println("Estudiante identificado con " + identificactionSearch + " nombre: " + newStudent.name + " ha sido borrado");
                        listaestudiante.remove(newStudent);
                        search = true;
                        break;
                    }
                }
                if (search == false) {
                    System.out.println("Estudiante identificado con " + identificactionSearch + " no ha sido encontrado");
                }
            } else if (option == 6) {
                Scanner entrada = new Scanner(System.in);
                System.out.println("¿Cuál es la cedula del estudiante a cambiar nombre?");
                String cedula = entrada.nextLine();
                Boolean search = university.validarCedula(listaestudiante, cedula);
                if (search == false) {
                    System.out.println("¿Cuál es el nuevo nombre?");
                    String nombre = entrada.nextLine();
                    university.editarNombre(listaestudiante, cedula, nombre);
                    System.out.println("El estudiante identificado con " + cedula + " ha sido actualizado");
                } else {
                    System.out.println("El estudiante identificado con " + cedula + " no existe");
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