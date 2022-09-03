/*
    Ejercicio 4
 */
package entidades;
import java.util.Scanner;

/**
 *
 * @author gera_
 */
public class Rectangulo {


    private int base;
    private int altura;
    private int superficie;
    private int perimetro;
    private Scanner leer = new Scanner(System.in);
    
    public Rectangulo(){
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getSuperficie() {
        return superficie;
    }

    public int getPerimetro() {
        return perimetro;
    }
   
    public void crearRectangulo(){
        System.out.print("Ingrese la base del rectangulo :");
        base=leer.nextInt();
        System.out.print("Ingrese la altura del rectangulo :");
        altura=leer.nextInt();
    }
    
    public void calcularSuperficie(){
        superficie = base * altura;
    }

    public void calcularPerimetro(){
        perimetro = (base + altura) * 2;
    }
    
    public void dibujarRectangulo(){
    
        if(base!=0 && altura!=0){
            for(int i =1; i<=altura; i++){
                for(int j=1; j<=base; j++){
                    if(i==1 || i==altura || j==1 || j==base){
                        System.out.print("* ");  
                    }else{
                        System.out.print("  ");
                    }
                }
                    System.out.println("");
            }
        }else {
            System.out.println("No se puede imprimir el rectangulo.");
            System.out.println(" Primero tiene que crear el rectangulo.");
        }
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", superficie=" + superficie + ", perimetro=" + perimetro + '}';
    }

}

