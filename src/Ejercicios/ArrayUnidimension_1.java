package Ejercicios;
import java.util.Scanner;

public class ArrayUnidimension_1 {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);    
    int[] numeros = new int[5];

    for(int i = 0; i < 5; i++){
      System.out.println("Introduce un numero: ");
      numeros[i] = leer.nextInt();
    }

    for(int i = 0; i < 5; i++){
      System.out.println("El numero en la posicion del arreglo["+i+"] es: "+ numeros[i]);
    }

  }
}
