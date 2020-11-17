
package co.edu.sanmateo.codigofuente.AngieDurango.modelo;


public class Estudiante {
    
    public String nombrecompleto;
    public String cedula;

    public Estudiante(String nombrecompleto, String cedula) {
        this.nombrecompleto = nombrecompleto.toUpperCase();
        this.cedula = cedula;
    }
    
    
    
}
