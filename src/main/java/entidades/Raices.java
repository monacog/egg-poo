/*
 Ejercicio extra Nro. 3
 */
package entidades;


public class Raices {
    private double a,b,c;
    
    public Raices(){}
    
    public Raices(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;   
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double getDiscriminante(){
        
        return (Math.round(Math.pow(b, 2)-4*a*c)*100.0)/100.0;
    }
    
    public boolean tieneRaices(){
        
        return getDiscriminante()>0;
    }
    public boolean tieneRaiz(){
    
        return getDiscriminante()==0 ;
    }

    public void obtenerRaices(){
        if(tieneRaices()){
            double x1 = (-(b)+ (Math.sqrt(Math.pow(b,2)-(4*a*c))))/2*a;
            double x2 = (-(b)- (Math.sqrt(Math.pow(b,2)-(4*a*c))))/2*a;
            x1=Math.round(x1*100.0)/100.0;
            x2=Math.round(x2*100.0)/100.0;
            System.out.println("Raices: ");
            System.out.println("Raiz 1 : "+x1);
            System.out.println("Raiz 2 : "+x2);
        }
    }
    
    public void obtenerRaiz(){
        if(tieneRaiz()){
            double x1 = (-(b)+ (Math.sqrt(Math.pow(b,2)-(4*a*c))))/2*a;
            x1=Math.round(x1*100.0)/100.0;
            System.out.println("Raiz 1 : "+x1);
        }
    }
    
    public void calcular(){
    
        if(tieneRaices()){
            obtenerRaices();
        }
        
        if(tieneRaiz()){
            obtenerRaiz();
        }
        
        if(getDiscriminante()<0){
            System.out.println("No tiene soluciones posibles.");
        }
    }

    //: esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
    //pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    //obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
    //de no existir solución, se mostrará un mensaje.
    
    
    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
                
}// fin clase
