package co.edu.sanmateo.codigofuente.YersonRomero.operaciones;

import co.edu.sanmateo.codigofuente.YersonRomero.modelo.Estudiante;
import java.util.List;
import java.util.Scanner;

public class Universidad {

    public Estudiante buscarEstudiante(Scanner entrada, List<Estudiante> listaEstudiante) {

        System.out.println("Por favor ingrese el número de identificación a buscar...");
        String identificacion;
        identificacion = entrada.next();

        for (int indice = 0; indice < listaEstudiante.size(); indice++) {
            Estudiante estudiante = listaEstudiante.get(indice);
            if (estudiante.cedula.equals(identificacion)) {
                return estudiante;
            }
        }
        return null; //Null significa que no existe
    }

    public Estudiante crearEstudiante() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("|--------------------------------------------------|");
        System.out.println("Ingresando un nuevo estudiante");
        System.out.println("Nombre completo del estudiante");
        String nombre = entrada.nextLine();

        System.out.println("Cedula del estudiante");
        String cedula = entrada.nextLine();

        Estudiante estudiante = new Estudiante(nombre, cedula);
        System.out.println("|--------------------------------------------------|");

        return estudiante;
    }

}
