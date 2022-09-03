/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package Ejercicios;

import java.util.Arrays;


public class pooej10 {

    public static void main(String[] args) {
        
        double[] a = new double[50];
        double[] b= new double[20];
        System.out.println("Se llena el array 'A' de forma aleatoria.");
        //deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
        for(int i=0; i<a.length; i++ ){
            a[i]=Math.round((Math.random()*101)*100.0)/100.0;
            System.out.print(a[i] + " - ");
        }
        
        //arreglo A se debe ordenar de menor a mayor
        System.out.println("Se ordena el array 'A'.");
        Arrays.sort(a);
        System.out.println("se muestrae el array 'A' ordenado de forma ascendente: ");
        for(int i=0; i<a.length; i++ ){
            System.out.print(a[i] + ",");
        }
         
        System.out.println(" Copiar los primeros 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5.");
        for(int i=0; i<b.length; i++ ){
            if(i<=9){
                b[i]=a[i];
            }else{
                b[i]=0.5;
            }
        }
        
        System.out.println("Se imprimen los 2 arreglos:");
        System.out.println("---------------------------");
        
        System.out.print("Arreglo A: ");
        for(int i=0; i<a.length; i++ ){
            System.out.print(a[i] + ",");            
        }
        System.out.println("");
        System.out.print("Arreglo B: ");
        for(int i=0; i<b.length; i++ ){
            System.out.print(b[i] + ",");            
        }
    
    }
}
