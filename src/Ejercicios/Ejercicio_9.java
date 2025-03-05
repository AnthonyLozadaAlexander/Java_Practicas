package Ejercicios;
import java.util.Scanner;

public class Ejercicio_9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numLimit, count;

    System.out.println("Ingrese el limite de numeros a mostrar: ");
    numLimit = input.nextInt();
    count = 1;
    
    while(count <= numLimit){
      System.out.println("num = " + count);
      count = count + 1; // contador para que no sea un bucle infinito y llegue al numLimit
    }
    input.close(); // Cerramos el Scanner
  } 
}
