/*
 Ejercicio extra Nro.6
 */
package entidades;


public class Ahorcado {
    private String palabra;
    private String[] letras;
    private String[] encontradas;
    private int letrasEncontradas;
    private int jugadasMaximas;
    
    public Ahorcado(){}

    public Ahorcado(String palabra, String[] letras, String[] encontradas, int letrasEncontradas, int jugadasMaximas) {
        this.palabra = palabra;
        this.letras = letras;
        this.encontradas = encontradas;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }



    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    
    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", letras=" + letras + ", encontradas=" + encontradas + ", letrasEncontradas=" + letrasEncontradas + ", jugadasMaximas=" + jugadasMaximas + '}';
    }
    

    
    
}
