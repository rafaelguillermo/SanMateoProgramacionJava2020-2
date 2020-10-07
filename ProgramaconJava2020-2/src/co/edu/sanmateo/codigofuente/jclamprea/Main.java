package co.edu.sanmateo.codigofuente.jclamprea;

import co.edu.sanmateo.codigofuente.jclamprea.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.jclamprea.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class Main {

    @SuppressWarnings("NestedAssignment")
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {

            System.out.println("Bienvenido a la Universidad San Juan");
            System.out.println("Menu Principal");
            System.out.println("1 Regstrar un estudiante");
            System.out.println("2 Lista de estudiantes");
            System.out.println("3 Buscar un estudiante");
            System.out.println("0 para salir del menu");
            int opcion = entrada.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante nuevo = universidad.crearEstudiante();
                listaEstudiante.add(nuevo);
                System.out.println("Se ha creado el estudiante " + nuevo.nombrecompleto + " correctamente");
                System.out.println("");
            } else if (opcion == 2) {
                System.out.println("\n Cantidad de Estudiantes Regitrados : " + listaEstudiante.size());
                System.out.println("Documento          Nombre");
                System.out.println("----------------------------");
                for (int i = 0; i < listaEstudiante.size(); i++) {
                    Estudiante estudiante = listaEstudiante.get(i);
                    System.out.println(estudiante.cedula + "                " + estudiante.nombrecompleto);
                }
                System.out.println("----------------------------");
            } else if (opcion == 3) {
                int opc;
                opc=0;
                do {
                    System.out.println("Digite la cedula del estudiante:");
                    String busqueda = entrada.nextLine();
                    for (int i = 0; i < listaEstudiante.size(); i++) {
                        Estudiante estudiante = listaEstudiante.get(i);
                        String aux = estudiante.cedula;

                        if (aux == busqueda) {
                            System.out.println("los datos del estudiante son:");
                            System.out.println("documento" + estudiante.cedula + estudiante.nombrecompleto);
                        }else{
                            System.out.println("No se encontro ningun estudiante con ese documento");
                        System.out.println("Deseaa hacer otra busqueda? ");
                        System.out.println("1 SI");
                        System.out.println("2 NO");
                        opc = entrada.nextInt();
                        }       
                    }

                } while (opc == 2);

            }
        }
    }

}
