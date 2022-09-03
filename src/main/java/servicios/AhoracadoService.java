/*
Ejercicio extra Nro. 6
 */
package servicios;
import entidades.Ahorcado;
import java.util.Scanner;

public class AhoracadoService {
    
    private String[] letrasEncontradas;
   
    public AhoracadoService(){};
    
    public Ahorcado crearJuego(){
        Scanner leer = new Scanner(System.in);
        Ahorcado ahorcado= new Ahorcado();
        System.out.print("Ingrese una palabra: ");
        ahorcado.setPalabra(leer.next());
        System.out.println("Cantidad de jugadas maximas: ");
        ahorcado.setJugadasMaximas(leer.nextInt());
        String[] letras = new String[ahorcado.getPalabra().length()];
        for(int i=0; i<ahorcado.getPalabra().length();i++){
            letras[i]=ahorcado.getPalabra().substring(i, i+1).toLowerCase();
        }
        ahorcado.setLetras(letras);
        ahorcado.setLetrasEncontradas(0);
        letrasEncontradas= new String[ahorcado.getLetras().length];
        return ahorcado;
    }
    
    public void longitud(Ahorcado objeto){
        System.out.println("Longitud de la palabra: "+ objeto.getPalabra().length());
    }
    
    public void buscar(Ahorcado objeto, String letra){
        for(int i=0; i<objeto.getLetras().length;i++){
            if(objeto.getLetras()[i].equals(letra)){
                System.out.println("Mensaje: La letra pertenece a la palabra");
                break;
            }
            
            if(i==objeto.getLetras().length-1){
                System.out.println("Mensaje: La letra no pertenece a la palabra");
            }
        }
    }

   public void encontradas(Ahorcado objeto , String letra){
       boolean encontrada=false;
       for(int i=0; i<objeto.getLetras().length;i++){
           
                
            if(letra.equals(objeto.getLetras()[i])&& letrasEncontradas[i]==null){
                
                objeto.setLetrasEncontradas(objeto.getLetrasEncontradas()+1);
                letrasEncontradas[i]=letra;
                encontrada=true;
            }
            
            if(i==objeto.getLetras().length-1 && !encontrada){
                objeto.setJugadasMaximas(objeto.getJugadasMaximas()-1);
            }
        }
       
       System.out.println("Número de letras (encontradas, faltantes):("  + objeto.getLetrasEncontradas() + ","+ (objeto.getPalabra().length()- objeto.getLetrasEncontradas())+")");
   }

    public void intentos(Ahorcado objeto){
        System.out.println("Número de oportunidades restantes: " + objeto.getJugadasMaximas());
    }

    public void juego(Ahorcado objeto){
        Scanner leer = new Scanner(System.in);
        String letra;
        while(objeto.getJugadasMaximas()>=0){

            if(objeto.getJugadasMaximas()>0 && objeto.getLetrasEncontradas()<objeto.getLetras().length){
                System.out.println("Ingrese una letra: ");
                 letra=leer.next().toLowerCase();
            
                while(letra.length()>1){
                    System.out.println("ingrese solo una letra: ");
                    letra=leer.next().toLowerCase();
                }   
                longitud(objeto);
                buscar(objeto,letra);
                encontradas(objeto,letra);
                intentos(objeto);
                System.out.println("--------------------------");
            }else if (objeto.getLetrasEncontradas()==objeto.getLetras().length){
                System.out.println("!!! Felicitaciones Palabra encontrada !!!");
                break;
            }else{
                System.out.println("Mensaje: Lo sentimos, no hay más oportunidades.");
                break;
            }
        }
    } 
    
}
