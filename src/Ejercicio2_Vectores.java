import java.util.Scanner;

public class Ejercicio2_Vectores {
  public static void main(String[] args)
  {
       // Realizar un programa que me permite la carga de 10 numeros en un vector, una vez cargados, se necesita que el programa determine cual es el mayor y cual es el menor de ellos.
       Scanner input = new Scanner(System.in);
       int numeros[] = new int[10];
       for(int i = 0; i < numeros.length; i++)
       {
        System.out.println("Ingrese un numero en el Indice["+i+"]");
        numeros[i] = input.nextInt();
       }
  }
}
