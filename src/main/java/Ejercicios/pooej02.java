/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = pi ∗ radio 2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ pi ∗ radio).
 */
package Ejercicios;
import entidades.Circunferencia;
import servicios.CircunferenciaServicios;


public class pooej02 {
  
    public static void main(String[] args) {
        CircunferenciaServicios c = new CircunferenciaServicios();
        Circunferencia circulo1 = c.crearCircunferencia();
        System.out.println("");
        System.out.println("El area del circulo es: " + circulo1.area());
        System.out.println("");
        System.out.println("El perimetro del circulo es: " + circulo1.perimetro());
    }
}
