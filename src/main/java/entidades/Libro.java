/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package entidades;

public class Libro {
    private int    isbn;
    private String titulo;
    private String autor;
    private int    nroPaginas;
    
    public Libro(){};
    
    public Libro(int isbn, String titulo, String autor, int nroPaginas){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.nroPaginas=nroPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    @Override
    public String toString(){
    
        return  "Libros {autor: " + autor + " isbn= "+ isbn + " titulo: " + titulo + " autor: "+ autor + " nroPaginas: " + nroPaginas + " }";
    }
    
 
}   

