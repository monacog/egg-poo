/*
Ejercicio 5
 */
package entidades;
import java.util.Scanner;


public class CuentaBancaria {
    
    private int numeroCuenta;
    private int dni;
    private int saldoActual;
    private Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria(){}
    
    public CuentaBancaria(int numeroCuenta, int dni, int saldoActual){
        this.numeroCuenta=numeroCuenta;
        this.dni=dni;
        this.saldoActual=saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void crearCuenta(){
        System.out.println("Ingresela siguiente informacion:");
        System.out.print(" Nro. de cuenta: ");
        numeroCuenta=leer.nextInt();
        System.out.print(" DNI: ");
        dni=leer.nextInt();
        System.out.print(" Saldo actual: ");
        saldoActual=leer.nextInt();
        System.out.println("");
    }
    
    public void ingresar(double ingreso){
        saldoActual+=ingreso;
    }
    public void retirar(double retiro){
        if(saldoActual<retiro){
            saldoActual=0;
        }else {
            saldoActual-=retiro;
        }
    }
    
    public void extraccionRapida(int extraccion){
        if(extraccion<=saldoActual*0.20){
            saldoActual-=extraccion;
        }else{
            System.out.println("Esta operacion no se puede realizar, solo puede extraer hasta $"+saldoActual*0.20);
        }
    }
    
    public void consultarSaldo(){
        System.out.println("El saldo disponible es de $ " + Math.round(saldoActual*100.0)/100.0);
    }
    
    public void consultarDatos(){
        System.out.println("Datos de la cuenta: ");
        System.out.println("Nro. cuenta : " + numeroCuenta);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo actual: "+ saldoActual);
    }
   
    @Override
    public String toString(){
        return " CuentaBancaria { numeroCuenta= " + numeroCuenta + "dni= "+ dni + " saldoActual= " + saldoActual + " ";
    }
    
}
