/*
Método Static y Clase Math

9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Ejercicios;
import entidades.Matematica;

public class pooej09 {

    public static void main(String[] args) {
        System.out.println("Se crea un objeto de la clase Matematica.");
        Matematica operacion = new Matematica();
        System.out.println("");
        System.out.println("Se inicializan los 2 valores aleatoriamente entre 0 y 100.");
        operacion.setNum1(Math.random()*101);
        System.out.println("Numero 1: " + operacion.getNum1());
        operacion.setNum2(Math.random()*101);
        System.out.println("Numero 2: " + operacion.getNum2());
        System.out.println("");
        //retornar cuál de los dos atributos tiene el mayor valor
        System.out.print("El mayor valor de los dos numeros ingresaro lo tiene el atributo: " );
        System.out.println(Matematica.devolverMayor(operacion.getNum1(), operacion.getNum2()));
        System.out.println("");
        //calcular la potencia del mayor valor de la clase elevado al menor número.
        System.out.print("Calcula la potencia del mayor valor de la clase elevado al menor número: ");
        System.out.println(Matematica.calcularPotencia(operacion.getNum1(), operacion.getNum2()));
        System.out.println("");
        //para calcular la raíz cuadrada del menor de los dos valores.
        System.out.println("Calcular la raíz cuadrada del menor de los dos valores: ");
        System.out.println(Matematica.calculaRaiz(operacion.getNum1(),operacion.getNum2()));
         
    }
    
}
