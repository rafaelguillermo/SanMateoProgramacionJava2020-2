package co.edu.sanmateo.codigofuente.rafaelguillermo;

import co.edu.sanmateo.codigofuente.rafaelguillermo.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.rafaelguillermo.operaciones.Universidad;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael Guillermo Blanco Banquez <rafaelg.blancob@gmail.com>
 */
public class Main {
    
    public Main() {
        System.out.println("Construyendo la clase desde una instanacia");
    }
    
    public void ejecutarMenu() throws IOException{
        
        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        
        File fileLectura = new File("F:\\r\\software\\docs\\j\\cursos\\Java SE 8 Programming\\Java SE 8 Programming\\estudiantes2.txt");
        
        Scanner leerArchivo = new Scanner(fileLectura);
        while( leerArchivo.hasNextLine() ){
            String linea = leerArchivo.nextLine();
            System.out.println("LINEA:"+ linea );
            
            String arreglo[] = linea.split(",");
            
            Estudiante estudiante = new Estudiante(arreglo[1], arreglo[0]);
            listaEstudiante.add(estudiante);
        }
        
        Universidad universidad = new Universidad();

        while (true) {
            
            System.out.println("Bienvenido a la universidad San Mateo > RAFAEL");
            System.out.println("-------- Menu ------------");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar Estudiante en la lista");
            System.out.println("4. Guardar informacion de los estudiantes");
            System.out.println("5. Eliminar un estudiante");
            System.out.println("0. Salir");
            
            int opcion = entrada.nextInt();
            
            if (opcion == 0) {
                System.out.println("Saliendo....");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu);
                System.out.println("El estudiante: " + estu.nombreCompleto + " ha sido ingresado a la universidad");
            }else if (opcion == 2) {
                //Inicializacion
                //Pregunta
                //Incremento
                System.out.println("ESTUDIANTES A MOSTRAR: "+listaEstudiante.size());
                System.out.println("DOCUMENTO       NOMBRE COMPLETO");
                System.out.println("---------------------------------");
                
                for(int indice=0; indice < listaEstudiante.size(); indice ++ ){
                    
                    Estudiante estudiante = listaEstudiante.get(indice);
                    System.out.println(estudiante.cedula+"      "+estudiante.nombreCompleto);
                }
            }else if(opcion == 3){
                
                Estudiante estudianteBuscado = universidad.buscarEstudiante(entrada, listaEstudiante);
                if( estudianteBuscado != null){
                    System.out.println("ESTUDIANTE ENCONTRADO..."+estudianteBuscado.nombreCompleto);
                }else{
                    System.out.println("lo siento, el estudiante buscado no fue encontrado");
                }
                
            }else if(opcion == 4){
                ///System.out.println("");
                FileWriter fileWriter = new FileWriter("F:\\r\\software\\docs\\j\\cursos\\Java SE 8 Programming\\Java SE 8 Programming\\estudiantes2.txt", false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                
                for(int indice=0; indice < listaEstudiante.size(); indice ++ ){
                    
                    Estudiante estudiante = listaEstudiante.get(indice);
                    bufferedWriter.write(estudiante.cedula+","+estudiante.nombreCompleto);
                    bufferedWriter.write("\n");
                }
                bufferedWriter.close();
                System.out.println("Estudiantes han sido guardado correctamente");
                
            }else if( opcion == 5){
                
                Estudiante estudianteBuscado = universidad.buscarEstudiante(entrada, listaEstudiante);
                if( estudianteBuscado != null){
                    listaEstudiante.remove(estudianteBuscado);
                    System.out.println("Se ha eliminado al estudiante: "+estudianteBuscado.nombreCompleto);
                }else{
                    System.out.println("lo siento, NO PUEDO ELIMINAR UN ESTUDIANTE QUE NO EXISTE");
                }
                
            }
        }
    }
    
    public static void main(String[] args) throws IOException {

        Main m = new Main();
        m.ejecutarMenu();

    }
}
