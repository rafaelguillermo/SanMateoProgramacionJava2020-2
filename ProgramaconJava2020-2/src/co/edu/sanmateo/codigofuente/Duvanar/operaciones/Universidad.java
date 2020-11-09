package co.edu.sanmateo.codigofuente.Duvanar.operaciones;

import co.edu.sanmateo.codigofuente.Duvanar.modelo.Estudiante;
import java.util.List;
import java.util.Scanner;

public class Universidad {

    public Universidad() {
    }

    public Estudiante buscarEstudiante(Scanner entrada,List<Estudiante> listaEstudiante) {   
        System.out.println("Ingrese el numero de identificacións del estudiante");
        String identificacion = entrada.next();
        for (int i = 0; i < listaEstudiante.size(); i++) {
            Estudiante estudiante = listaEstudiante.get(i);
            if (estudiante.cedula.equals(identificacion)) {
                return estudiante;
            }
        }
        return null;
    }

    public Estudiante crearEstudiante() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Ingresando un nuevo estudiante");
        System.out.println("------------------------------");
        
        System.out.println("Ingrese la cedula del estudiante");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese el nombre completo del estudiante");
        String cedula = entrada.nextLine();

        Estudiante estudiante = new Estudiante(nombre, cedula);
        System.out.println("---------------------------------");

        return estudiante;
    }

}
