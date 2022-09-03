/*
Ejercicio extra Nro. 5
 */
package entidades;
import java.util.Scanner;
public class Secreto {
    
    private String [] meses; 
    private String mesSecreto; 
    private Scanner leer = new Scanner(System.in);
    
    public Secreto(){
        meses= new String[]{"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        mesSecreto= meses[(int)Math.random()*11];
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    public void adivinar(){
        System.out.println("Introduzca el nombre del mes en minúsculas:");
        String secreto = leer.next();
        while(!secreto.equals(mesSecreto)){
                System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
                secreto=leer.next();
        }
        System.out.println("¡Ha acertado!");
    }

    @Override
    public String toString() {
        return "Secreto{" + "meses=" + meses + ", mesSecreto=" + mesSecreto + '}';
    }
    
    
    
}
