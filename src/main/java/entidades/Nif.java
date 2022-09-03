/*
Ejercicio Extra Nro.4
 */
package entidades;


public class Nif {
    
    int dni;
    String letra;
    
    public Nif(){}
    
    public Nif(int dni , String letra){
        this.dni=dni;
        this.letra=letra;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public String mostrar(){
        String nif="";
        
        for( int i=0; i<(8-Integer.toString(dni).length());i++ ){
            nif+="0";
        }
        
        nif+=dni+"-"+letra;
        return nif;
    }

    @Override
    public String toString() {
        return "Nif{" + "dni=" + dni + ", letra=" + letra + '}';
    }
     
}
