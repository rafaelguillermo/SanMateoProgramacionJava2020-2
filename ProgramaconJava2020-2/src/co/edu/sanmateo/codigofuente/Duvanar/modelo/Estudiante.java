package co.edu.sanmateo.codigofuente.Duvanar.modelo;

/**
 *
 * @author duvan
 */
public class Estudiante {

    public String nombreCompleto;
    public String cedula;
    
    
    /**
     * Este es el constructor de la clase Estudiante
     * Usted debe enviar como parametros el nombre y la cedula del estudiante
     * @param nombreCompleto
     * @param cedula 
     */
    
    
    public Estudiante(String nombreCompleto, String cedula) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
    }

}
