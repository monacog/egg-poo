/*
 Ejercicio 8
 */
package entidades;

public class Cadena {
    private String frase;
    private int longitud;
    
    public Cadena(){}

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    public int mostrarVocales(){
        int vocales=0;
        
        for(int i=0;i<frase.length();i++){
            switch(frase.substring(i,i+1).toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    vocales++;
            }
        }
        
        return vocales;
    }
    
    public String invertirFrase(){
        String invertida="";
        for(int i=(frase.length()-1);i>=0;i--){
            invertida+=frase.substring(i,i+1);
        }
        return invertida;
    }
    
    public int vecesRepetido(String letra){
        int repetida=0;
        for(int i=0;i<frase.length();i++){
            if(frase.substring(i,i+1).toLowerCase().equals(letra)){
                repetida++;
            }
        }
        return repetida;
    }
    
    public boolean compararLongitud(String frase){
        return this.frase.length()== frase.length();
    }
    
    public String unirFrases(String frase){
        return this.frase+ ". "+frase+". ";
    }
    
    public void reemplazar(String letra){
        String cadena="";
        for(int i=0; i<frase.length();i++){
            if(!frase.substring(i,i+1).equalsIgnoreCase("a")){
                cadena+=frase.substring(i,i+1);
            }else{
                cadena+=letra;
            }
        }
        System.out.println(cadena);
    }
    
    public boolean contiene(String letra){
        for(int i=0; i<frase.length();i++){
            if(frase.substring(i,i+1).equalsIgnoreCase(letra)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
}
