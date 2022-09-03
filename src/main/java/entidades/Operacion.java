//Ejercicio 3 de POO
package entidades;


public class Operacion {
    
    private double numero1;
    private double numero2;
    
    
    public Operacion (){
    }
    
    public Operacion ( double numero1, double numero2){
        this.numero1=numero1;
        this.numero2=numero2; 
    }
    
    public void setNumero1(double numero1){
        this.numero1=numero1;
    }
    public double getNumero1 (){
        return numero1;
    }
    
    public void setNumero2 (double numero2){
        this.numero2=numero2;
    }
    
    public double getNumero2(){
        return numero2;
    }
    
    public void sumar(){
        System.out.println("suma: " + numero1 +" + " + numero2 + " = " +
                            Math.round((numero1+numero2)*100.0)/100.0
        );
    }
    
    public void resta(){
        System.out.println("resta: " + numero1 +" - " + numero2 + " = " +
                            Math.round((numero1-numero2)*100.0)/100.0
        );
    }

    public void multiplicar(){
        
        if(numero1==0||numero2==0){
            System.out.println("resultado= 0");
            System.out.println("Error: no se puede multiplicar por cero.");
        }else{
            System.out.println("Multiplicacion: " + numero1 + " * " + numero2 + " = "+
                                Math.round((numero1*numero2)*100.0)/100.0);
        }
    }
    
    public void dividir(){
        if(numero1==0||numero2==0){
            System.out.println("resultado= 0");
            System.out.println("Error: no se puede dividir por cero.");
        }else{
            System.out.println("Divicion: " + numero1 + " * " + numero2 + " = "+
                                Math.round((numero1/numero2)*100.0)/100.0);
        }
    }
    
    @Override
    public String toString(){
    
        return " Operacion{ numero1= " +numero1 + "numero2= "+numero2+ " }";
    }

    
}
