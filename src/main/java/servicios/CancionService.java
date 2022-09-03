/*
Ejercicio extra Nro. 01
 */
package servicios;
import entidades.Cancion;
import java.util.Scanner;

public class CancionService {
    
   public static Cancion crearCancion(){
       
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
       System.out.println("Ingrese el titulo de la cancion: ");
       String titulo = leer.next();
       
       System.out.println(" Ingrese el autor de la cancion: ");
       String autor = leer.next();
      
       return new Cancion(titulo,autor);
   }
    
}
