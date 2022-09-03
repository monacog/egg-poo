/*
Ejercicio extra Nro.4
 */
package servicios;
import entidades.Nif;
import java.util.Scanner;


public class NifService {
 
       
    public static Nif crearNif(){
        String[] letra  = new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        Scanner leer = new Scanner(System.in);  
        System.out.println("Ingrese su numero de DNI: ");
        int dni=leer.nextInt();
        while(dni<1&&dni>99999){
            System.out.print("Ingrese un numero de 8 digitos maximo: ");
            dni=leer.nextInt();
        }
        String digito = letra[(dni%23)-1];
        
        return new Nif(dni,digito);
    }
    
}