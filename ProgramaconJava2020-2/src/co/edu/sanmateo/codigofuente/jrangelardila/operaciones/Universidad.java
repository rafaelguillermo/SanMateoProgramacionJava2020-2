/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.jrangelardila.operaciones;

import co.edu.sanmateo.codigofuente.jrangelardila.modelo.Estudiante;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jrangelardila
 */
public class Universidad {

    public Universidad() {
    }

    public Estudiante newStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("FUNDACIÓN PARA LA EDUCACIÓN SUPERIOR SAN MATEO\n"
                + "Agregando nuevo estudiante\n"
                + "¿Cual es el nombre completo del estudiante?\n");
        String name = input.nextLine();
        System.out.println("\n¿Cual es la cedula del estudiante?\n");
        String identification = input.nextLine();
        Estudiante estudiante = new Estudiante(name.toUpperCase(), identification);
        return estudiante;
    }

    public Boolean validarCedula(List<Estudiante> estudents, String cedula) {
        Boolean valido = true;
        for (int i = 0; i < estudents.size(); i++) {
            Estudiante estudent = estudents.get(i);
            if (estudent.identification.equals(cedula)) {
                valido = false;
                break;
            }
        }
        return valido;
    }

    public Boolean editarNOmbre(List<Estudiante> estudents, String cedula, String newName) {
        Boolean valido = false;
        for (int i = 0; i < estudents.size(); i++) {
            Estudiante estudent = estudents.get(i);
            if (estudent.identification.equals(cedula)) {
                estudent.setName(newName.toUpperCase());
                valido = true;
                break;
            }
        }
        return valido;
    }
}
