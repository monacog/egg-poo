/*
Ejercicio 9
 */
package entidades;

public class Matematica {
    private double num1;
    private double num2;
    
    public Matematica(){}
    public Matematica( double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public static String devolverMayor(double num1 , double num2){
        
        if(num1>num2){
            return "num1";
        }else{
            return "num2";
        }
    }
    
    public static double calcularPotencia(double num1 , double num2){
        
         return Math.pow(Math.max(Math.round(num1),Math.round(num2)), Math.min(Math.round(num1), Math.round(num2)));
    } 
    
    public static double calculaRaiz(double num1, double num2){
       
        return Math.sqrt(Math.abs(Math.min(num1,num2)));
    }
    

    
    
    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }//fin toString
    
}//fin clase
