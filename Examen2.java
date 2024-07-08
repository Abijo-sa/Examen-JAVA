package examen2;
import java.util.Scanner;

public class Examen2 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre=scanner.nextLine();
        System.out.println("Bienvenido"+nombre);
        scanner.close();
    }
}
