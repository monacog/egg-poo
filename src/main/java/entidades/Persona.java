/*
Ejercicio 7
 */

package entidades;
import java.util.Scanner;


public class Persona {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String  nombre;
    private short   edad;
    private String  sexo;
    private double  peso;
    private double  altura;
    
    public Persona(){}
    public Persona (String nombre, short edad, String sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        
        double mc= (peso/Math.pow(altura,2));
        
        if(mc<20){
            return -1;        
        }else if ( mc<=25){
            return 0;
        }else{
            return 1;
        } 
    } 
    
    public boolean esMayorDeEdad(){
        
        return edad>=18;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    } // fin metodo
    
}//fin clase
