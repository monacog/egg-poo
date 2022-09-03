
package servicios;
import entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicios {
    
    private Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        System.out.print("Ingrese el radio de la circunferencia: ");
        Circunferencia c = new Circunferencia(leer.nextDouble());
        return c;
    }


}
