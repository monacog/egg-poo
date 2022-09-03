/*
Ejercicio extra Nro.2
 */
package servicios;
import entidades.Puntos;
import java.util.Scanner;

public class PuntosService {
    
    
    public static Puntos crearPuntos(){
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese las coordenas de dos (2) puntos, para calcular la distancia entre ambos.");
        System.out.println("Ingrese las coordenadas del punto uno: ");
        System.out.print("X1: ");
        double x1=leer.nextInt();
        System.out.print("Y1: ");
        double y1=leer.nextInt();
        System.out.println("");
        
        System.out.println("Ingrese las coordenadas del punto dos: ");
        System.out.print("X2: ");
        double x2=leer.nextInt();
        System.out.print("Y2: ");
        double y2=leer.nextInt();
        
        return new Puntos(x1,x2,y1,y2);
    }
}
