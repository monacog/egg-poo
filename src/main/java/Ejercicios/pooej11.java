/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Ejercicios;
import java.util.Date;
import java.util.Scanner;


public class pooej11 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio;
        Date fechaIndicada;
        Date fechaActual=new Date();
        System.out.println(" Ingrese los datos a continuacion: ");
        
        System.out.print("Dia: ");
        dia=leer.nextInt();
        while(dia<1||dia>31){
            System.out.println("Ingrese el dia entre 1 y 31");
            dia=leer.nextInt();
        }
        
        System.out.print("Mes :");
        mes=leer.nextInt();
        while(mes<1 || mes>12){
            System.out.println("Ingrese el mes entre 1 y 12");
            mes=leer.nextInt();
        }
        
        System.out.print("Año :");
        anio=leer.nextInt();
        while(anio<1){
            System.out.println("Ingrese el año , debe ser mayor a 0");
            anio=leer.nextInt();
        }
        
       fechaIndicada=new Date((anio-1900), mes-1, dia); 
       
        System.out.println("Fecha ingresada : " + fechaIndicada.getDate()+"-" + (fechaIndicada.getMonth()+1)+ "-" + (fechaIndicada.getYear()+1900));
        System.out.println("Fecha actual : " + fechaActual.getDate()+ "-" + (fechaActual.getMonth()+1)+ "-" + (fechaActual.getYear()+1900));
        System.out.println("Hay " + (fechaActual.getYear()-fechaIndicada.getYear()) + " años entre la fecha actual y la fecha indicada.");
    }
    
}
