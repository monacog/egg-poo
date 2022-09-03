/*
    Ejercicio 12
 */
package servicios;
import entidades.Person;
import java.util.Date;
import java.util.Scanner;

public class PersonService {

    public PersonService(){}
    
    public static Person crearPerson(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int dia;
        int mes;
        int anio;
        String nombre;
        System.out.println("Ingrese la siguiente informacion: ");
        System.out.print("Nombre: ");
        nombre=leer.next();
        System.out.println("Datos del nacimiento.");
        System.out.print("Dia: ");
        dia=leer.nextInt();
        System.out.print("Mes: ");
        mes=leer.nextInt();
        System.out.print("Año: ");
        anio=leer.nextInt();
               
        return new Person(nombre, new Date((anio-1900),(mes-1),dia));
    }  
    
    
}
