package co.edu.sanmateo.codigofuente.rafaelguillermo.operaciones;

import co.edu.sanmateo.codigofuente.rafaelguillermo.modelo.Estudiante;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael Guillermo Blanco Banquez <rafaelg.blancob@gmail.com>
 */
public class Universidad {

    public Universidad() {
    }
    
    public Estudiante buscarEstudiante(Scanner entrada, List<Estudiante> listaEstudiante){
        
        System.out.println("Por ingrese la identificación a buscar: ");
        String identificacion;
        identificacion = entrada.next();

        for(int indice=0; indice < listaEstudiante.size(); indice ++ ){

            Estudiante estudiante = listaEstudiante.get(indice);

            if(estudiante.cedula.equals(identificacion)){
                return estudiante;
            }
            //System.out.println(estudiante.cedula+"      "+estudiante.nombreCompleto);
        }
        return null;
    }
    
    public Estudiante crearEstudiante(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Ingresando un nuevo estudiante");
        System.out.println("Nombre completo del estudiante");
        String nombre = entrada.nextLine();
        
        System.out.println("Cedula del estudiante");
        String cedula = entrada.nextLine();
        
        Estudiante estudiante = new Estudiante(nombre, cedula);
        System.out.println("--------------------------------");
        
        return estudiante;
    }
}
