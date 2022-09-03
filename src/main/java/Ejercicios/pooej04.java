/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/

package Ejercicios;
import entidades.Rectangulo;

public class pooej04 {

    public static void main(String[] args) {
        //crea el objeto rectangulo
        Rectangulo rectangulo1= new Rectangulo();
        //Inicializa los valores del rectangulo creado
        rectangulo1.crearRectangulo();
        System.out.println("");
        // Calucla la superficie y el Perimetro
        rectangulo1.calcularPerimetro();
        rectangulo1.calcularSuperficie();
        //Muestra el perimetro y la superficie
        System.out.print("El perimetro es: " + rectangulo1.getPerimetro());
        System.out.println("");
        System.out.print("La superficie es: " + rectangulo1.getSuperficie());
        System.out.println("");
        System.out.println("");
        //Dibuja el rectangulo
        rectangulo1.dibujarRectangulo();
        
    }
    
}
