/*
Ejercicio extra Nro.3
 */
package servicios;
import entidades.Raices;
import java.util.Scanner;

public class RaicesService {
    
    public static Raices creaeRaices (){
        double a,b,c;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los siguientes valores: ");
        System.out.print("a : ");
        a=leer.nextDouble();
        System.out.print("b : ");
        b=leer.nextDouble();
        System.out.print("c : ");
        c=leer.nextDouble();
        return new Raices(a,b,c);
    }
    
}
