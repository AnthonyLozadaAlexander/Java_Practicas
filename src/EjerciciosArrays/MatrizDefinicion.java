package EjerciciosArrays;

import java.util.Scanner;

public class MatrizDefinicion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int matriz[][], nFilas = 0, nColumnas = 0;

    System.out.println("--------------------------------------------");
    System.out.println("                 BIENVENIDO                 ");
    System.out.println("--------------------------------------------");
    do {
      System.out.println("Ingrese el numero de filas de la matriz");
      System.out.print("-> ");
      if (!input.hasNextInt()) {
        System.out.println("\nError: Debe ingresar un numero entero");
        System.out.println("Por favor, vuelva a intentarlo.\n");
        input.next(); // Limpiar el buffer
        continue; // Volver a pedir el número de filas
      } else {

        nFilas = input.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz");
        System.out.print("-> ");
        if (!input.hasNextInt()) {
          System.out.println("\nError: Debe ingresar un numero entero");
          System.out.println("Por favor, vuelva a intentarlo.\n");
          input.next(); // Limpiar el buffer
          continue; // Volver a pedir el número de filas
        } else {
          nColumnas = input.nextInt();
          if (nFilas <= 0 || nColumnas <= 0) {
            System.out.println("\nError: El numero de filas y columnas debe ser mayor a 0");
            System.out.println("Por favor, vuelva a intentarlo.\n");
          } else {
            System.out.println("\nDatos De La Matriz");
            System.out.println("Filas[" + nFilas + "]");
            System.out.println("Columnas[" + nColumnas + "]");
          }
        }

      }
    } while (nFilas <= 0 || nColumnas <= 0);
    matriz = new int[nFilas][nColumnas];

    System.out.println("\n---------------------------------");
    System.out.println("Ingrese los valores de la matriz:  ");
    System.out.println("-----------------------------------");
    for (int f = 0; f < matriz.length; f++) {
      System.out.println("-----------------------------------");
      for (int c = 0; c < matriz[f].length; c++) {
        System.out.println("Fila[" + f + "]");
        System.out.println("Columna[" + c + "]");
        System.out.print("-> ");
        if (!input.hasNextInt())
        {
          System.out.println("\nError: Debe ingresar un numero entero");
          System.out.println("Por favor, vuelva a intentarlo.\n");
          input.next(); // Limpiar el buffer
          c--; // Decrementar c para volver a pedir el valor de la columna actual
        } else {
          matriz[f][c] = input.nextInt();
          System.out.println("Valor ingresado: " + matriz[f][c]);
        }
      }
      System.out.println("-----------------------------------");
    }

    System.out.println("\n-----------------------------------");
    for (int f = 0; f < matriz.length; f++) {
      for (int c = 0; c < matriz[f].length; c++) {
        System.out.print(matriz[f][c] + " ");
      }
      System.out.println("");
    }
    System.out.println("-------------------------------------");
    System.out.println("Fin del programa, gracias por usarlo.");
  }
}
