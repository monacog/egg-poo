/*
Ejercicio 12
 */
package entidades;
import java.util.Date;

public class Person {
   String nombre;
   Date fechaNacimiento;
   
   public Person (){}
   public Person(String nombre, Date fechaNacimiento){
       this.nombre=nombre;
       this.fechaNacimiento=fechaNacimiento;
   }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int calcularEdad(){
        Date actual=new Date();
        
        if(fechaNacimiento.getMonth()>actual.getMonth()){
            return (actual.getYear()-fechaNacimiento.getYear())+1;
        }
        
        if((fechaNacimiento.getMonth()== actual.getMonth())&& fechaNacimiento.getDate()<actual.getDate()){
                return (actual.getYear()-fechaNacimiento.getYear())+1;
        }
        return actual.getYear()-fechaNacimiento.getYear();
    }
    
    public boolean menorQue(int edad){
        return calcularEdad()< edad;
    }
    
    public void mostrarPersona(){
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha Nacimiento: " + fechaNacimiento.getDate()+"-"+ (fechaNacimiento.getMonth()+1) + "-" + (fechaNacimiento.getYear()+1900));
    }
    
    @Override
    public String toString() {
        return "Persona1{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
   
}
