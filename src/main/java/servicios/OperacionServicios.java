// Ejercicio 3 POO
package servicios;
import entidades.Operacion;
import java.util.Scanner;
public class OperacionServicios {
    
    private Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        
        Operacion operacion = new Operacion();
        System.out.print("Ingrese el numero 1 :");
        operacion.setNumero1(leer.nextDouble());
        System.out.print("Ingrese el numero 2 :");
        operacion.setNumero2(leer.nextDouble());
        return operacion ;
    }
}
