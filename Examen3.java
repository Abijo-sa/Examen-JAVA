
package examen3;
import java.util.Scanner;
        
public class Examen3 {

    public static void main(String[] args) {
        Scanner scanner=new
            Scanner(System.in);
        int contador=0;
        int numero ;
        do{
            System.out.print("introduce un número(-1 para terminar):");
            numero=scanner.nextInt();
            if (numero!=-1){
                contador++;
            }
    
            }while (numero!=1);
        System.out.println("Haz introducido"+contador+"números");
        scanner.close();
        }
        
    }
