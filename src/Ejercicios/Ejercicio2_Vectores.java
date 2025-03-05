package Ejercicios;
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

       System.out.println("");
       
       //? Busqueda del mayor
       int mayor = Integer.MIN_VALUE; // valor mas bajo de un entero -999999999
       for(int i = 0; i < 10; i++)
       {
        if(numeros[i] > mayor)
        {
          mayor = numeros[i]; // guarda el numero mayor
        }
      }
    System.out.println("El mayor numero es: " + mayor);

      //? Busqueda del menor
      int menor = Integer.MAX_VALUE; // valor mas alto de un entero 999999999
      for(int i = 0; i < 10; i++)
      {
       if(numeros[i] < menor)
       {
         menor = numeros[i]; // guarda el numero menor
       }
     }
   System.out.println("El menor numero es: " + menor);
  }
}
