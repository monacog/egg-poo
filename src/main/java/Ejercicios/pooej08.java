/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Ejercicios;
import entidades.Cadena;
import java.util.Scanner;


public class pooej08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena frase = new Cadena();
        String letra="";
        String frase2="";
        System.out.print("Ingrese una frase: ");
        frase.setFrase(leer.next());
        System.out.println("");
        //muestra la cantidad de vocales que tiene la frase ingresada
        System.out.println("Cantidade de vocales: "+ frase.mostrarVocales());
        //muestra invertida la frase ingresada
        System.out.println("Frase invertida: " + frase.invertirFrase());
        //muestra la catidad de veces que se repetida la letra indicada en la frase
        System.out.print("Ingrese una letra:");
        letra=leer.next();
        while(letra.length()>1){
            System.out.print("Ingrese solo una (1) letra: ");
            letra=leer.next();
        }
        if(frase.vecesRepetido(letra)>0){
            System.out.println("El caracter '"+letra+"' se repite "+frase.vecesRepetido(letra)+" veces.");
        } else{
            System.out.println("La letra '"+letra+"' no se repite.");
        }
        
        //Compara la longitud de 2 cadenas
        System.out.print("Ingrese una cadena: ");
        frase2=leer.next();
        if(frase.compararLongitud(frase2)){
            System.out.println("La longitu de ambas cadenas son iguales.");
        }else{
            System.out.println("La longitu de ambas cadenas no son iguales.");
        }
        // Concatena 2 frases
        System.out.print("Ingrese una cadena: ");
        frase2=leer.next();
        System.out.println("Cadenas concatenadas: "+frase.unirFrases(frase2));
        
        //Remplaza la letra indicada por una "a"
        System.out.print("Ingrese una letra a remplazar en la frase: ");
        letra=leer.next();
        while(letra.length()>1){
            System.out.print("Ingrese solo una (1) letra: ");
            letra=leer.next();
        }
        System.out.println(" Se muestra la frase:");
        frase.reemplazar(letra);
        // muestra si la frase contiene la letra ingresada
        System.out.print("Ingrese una letra a buscar en la frase: ");
        letra=leer.next();
        while(letra.length()>1){
            System.out.print("Ingrese solo una (1) letra: ");
            letra=leer.next();
        }
        if(frase.contiene(letra)){
            System.out.println("La letra indicada se encuentra en la frase.");
        }else{
            System.out.println("La letra indicada NO se encuentra en la frese.");
        }
        
    }
    
}
