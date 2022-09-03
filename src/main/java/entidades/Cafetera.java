/**
 * Ejercicio 6
 */

package entidades;
import java.util.Scanner;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    private Scanner leer = new Scanner(System.in);
    
    public Cafetera(){}    
    public Cafetera(int capacidadMaxima, int cantidadActual){
        this.capacidadMaxima=capacidadMaxima;
        this.cantidadActual=cantidadActual;
    }  

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
    }
    
    public void servirTaza(){
        int tamañoTaza;
        System.out.print("Ingrese el tamaño de la taza a servir : ");
        tamañoTaza=leer.nextInt();
        if(cantidadActual<tamañoTaza){
            System.out.println("No se lleno la taza. Se completaron " + cantidadActual + " cc. con cafe.");
            cantidadActual=0;
        }else{
            System.out.println("La taza se lleno completa.");
            cantidadActual-=tamañoTaza;
        }
    }
    
    public void vaciarCafetera(){
        cantidadActual=0;
    }

    public void agregarCafe(){
        int cantidadCafe=0;
        System.out.print("Ingrese la cantidad de cafe para agregar en la cafetera : ");
        cantidadCafe=leer.nextInt();
        if((cantidadActual+cantidadCafe)>capacidadMaxima){
            System.out.println("Solo se completaron " + (capacidadMaxima-cantidadActual) + " cc. Ya que la cantidad indicada supera la cantidad maxima de la cafetera.");
        }else {
            System.out.println("Se añadio correctamente a la cafetera la cantidad indicada.");
            cantidadActual+=cantidadCafe;
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
}
