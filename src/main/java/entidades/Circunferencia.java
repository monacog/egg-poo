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
package entidades;


public class Circunferencia {
    
    private double radio;
    
    public Circunferencia (double radio){
        this.radio=radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio=radio;
    }
    
    public double area(){
        double v= Math.pow(radio,2)*Math.PI;
        return Math.round(v*100.0)/100.0;
    }

    
    public double perimetro(){  
        double v=2*Math.PI*radio;
        return Math.round(v*100.0)/100.0;
    }
    
    
    @Override
    public String toString (){
        return " Circunferencia{ radio= "+radio+"}";
    }
}
