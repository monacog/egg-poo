/*
 Ejercicio 7
 */
package servicios;
import entidades.Persona;
import java.util.Scanner;

public class PersonaServicios {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public PersonaServicios(){
    }
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        
        System.out.println("Ingrese los datos de la persona: ");
        
        System.out.print("Nombre: ");
        persona.setNombre(leer.next());
        
        System.out.print("Edad: ");
        persona.setEdad(leer.nextShort());
        while( persona.getEdad()<1 || persona.getEdad()> 105){
            System.out.print("La edad debe eser entre 1 y 105: ");
            persona.setEdad(leer.nextShort());
        }
        
        System.out.print("Sexo ('H' hombre, 'M' mujer, 'O' otro): ");
        persona.setSexo(leer.next().toLowerCase());
        while( !persona.getSexo().equals("h") && !persona.getSexo().equals("m") && !persona.getSexo().equals("o")){
            System.out.print("Solo puede ingrese una letra - 'H' hombre, 'M' mujer, 'O' otro : ");
            persona.setSexo(leer.next().toLowerCase());
        }
        
        System.out.print("Peso en kg : ");
        persona.setPeso(Math.round((leer.nextDouble())*100.0)/100.0);
        while(persona.getPeso()>400){
            System.out.print("el peso no debe superar los 400kg: ");
            persona.setPeso(Math.round((leer.nextDouble())*100.0)/100.0);
        } 
        
        System.out.print("Altura en metros : ");
        persona.setAltura(Math.round( (leer.nextDouble())*100.0)/100.0);
        while(persona.getAltura()<0.5 || persona.getAltura()>3  ){
            System.out.print("Altura debe estar entre 0.50 metros y 3 metros ");
            persona.setPeso(Math.round((leer.nextDouble())*100.0)/100.0);
        }
        
        return persona;
    }
    
    
}// Fin Clase
