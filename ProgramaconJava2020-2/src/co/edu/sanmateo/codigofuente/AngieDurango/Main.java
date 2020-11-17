package co.edu.sanmateo.codigofuente.AngieDurango;

import co.edu.sanmateo.codigofuente.AngieDurango.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.AngieDurango.operaciones.Universidad;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public Main() {
        System.out.println("Construyendo la clase desde una instancia");
    }

    public void ejecutarMenu() throws IOException {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {
            System.out.println("Bienvenido a la Universidad San Mateo");
            System.out.println("----------Menú----------");
            System.out.println("1.Registrar Estudiante");
            System.out.println("2.Listar Estudiantes");
            System.out.println("3.Buscar Estudiante en la lista");
            System.out.println("4.Almacenar información de los estudiantes");
            System.out.println("0. Salir");

            int opcion = entrada.nextInt();
            if (opcion == 0) {
                System.out.println("Saliendo.....");
                System.exit(0);

            } else if (opcion == 1) {

                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu);

                System.out.println("El estudiante:" + estu.nombrecompleto + " ha sido ingresado a la universidad");

            } else if (opcion == 2) {

                System.out.println("Estudiante a mostrar:" + listaEstudiante.size());
                System.out.println("Documento       Nombre Completo");
                System.out.println("--------------------------------");

                for (int indice = 0; indice < listaEstudiante.size(); indice++) {

                    Estudiante estudiante = listaEstudiante.get(indice);
                    System.out.println(estudiante.cedula + "        " + estudiante.nombrecompleto);

                }

            } else if (opcion == 3) {
                System.out.println("Por favor ingrese la identificación a buscar:");
                String Identificacion;
                Identificacion = entrada.next();

                for (int indice = 0; indice < listaEstudiante.size(); indice++) {

                    Estudiante estudiante = listaEstudiante.get(indice);

                    if (estudiante.cedula.equals(Identificacion)) {

                        System.out.println("Estudiante Encontrado..." + estudiante.nombrecompleto);

                    }

                }

            } else if (opcion == 4) {

                FileWriter fileWriter = new FileWriter("D:\\Users\\USER\\Documents\\NetBeansProjects\\SanMateoProgramacionJava2020-2\\ProgramaconJava2020-2\\src\\co\\edu\\sanmateo\\codigofuente\\AngieDurango\\infoestudiantes.txt", false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                for (int indice = 0; indice < listaEstudiante.size(); indice++) {

                    Estudiante estudiante = listaEstudiante.get(indice);
                    bufferedWriter.write(estudiante.cedula + "," + estudiante.nombrecompleto);
                    bufferedWriter.write("\n");
                }
                bufferedWriter.close();
                System.out.println("Los estudiantes han sido almacenados exitosamente");

            } else if (opcion == 6) {
                System.out.println("Por favor ingrese la identificación a buscar:");
            }
            String Identificacion;
            Identificacion = entrada.next();
            
            String Nombre;
            Nombre=entrada.next();
                 
           
               

           
                
            

    
        }}
    public static void main(String[] args) throws IOException {

        Main m = new Main();
        m.ejecutarMenu();
    }

}
