package servicios;
import entidades.Libro;
import java.util.Scanner;

public class LibroServicios {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Libro crearLibro(){
        
        Libro libro=new Libro();
        
        System.out.println(" Ingrese el titulo del libro: ");
        libro.setTitulo(leer.next());
        
        System.out.println(" Ingrese el autor del libro: ");
        libro.setAutor(leer.next());
        
        System.out.println("Ingrese el ISBN del libro: ");
        libro.setIsbn(leer.nextInt());
        
        System.out.println("Ingrese el Nro. de pagimas del libro: ");
        libro.setNroPaginas(leer.nextInt());

        return libro ;
    }
    
    public void mostrarLibro(Libro libro){
        
        System.out.println(
        " Titulo del libro: " + libro.getTitulo()+
        " Autor: " + libro.getAutor() +
        " ISBN: " + libro.getIsbn() +
        " Nro. de paginas: " + libro.getNroPaginas()
        );
    
    }
    
}
