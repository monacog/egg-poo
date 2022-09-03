/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */
package Ejercicios;
import entidades.Cancion;
import servicios.CancionService;

public class pooextraej01 {


    public static void main(String[] args) {
        
        Cancion tema1 = CancionService.crearCancion();
        System.out.println("Se muestran los datos del tema ingresado:");
        System.out.println("Autor: "+ tema1.getAutor());
        System.out.println("Cancion: :" + tema1.getTitulo());
    }
    
}
