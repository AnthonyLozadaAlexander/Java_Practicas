package EjerciciosArrays;

import java.util.Scanner;

public class MatrizSimetrica {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int matriz[][], nFilas = 0, nColumnas = 0;
    System.out.println("----------------------------");
    System.out.println("         BIENVENIDO         ");
    System.out.println("----------------------------");
    do {
      System.out.println("Ingrese el numero de filas");
      System.out.print("-> ");
      if (!input.hasNextInt()) {
        System.out.println("\nError: Debe Ingresar un numero entero\n");
        input.next();
        continue;
      } else {
        nFilas = input.nextInt();
        if (nFilas <= 0) {
          System.out.println("\nError: Debe Ingresar un numero entero mayor a 0\n");
          continue;
        } else {
          System.out.println("Filas Ingresadas = [" + nFilas + "]");
          System.out.println("----------------------------");
          System.out.println("Ingrese el numero de Columnas");
          System.out.print("-> ");
          if (!input.hasNextInt()) {
            System.out.println("\nError: Debe Ingresar un numero entero\n");
            input.next();
            continue;
          } else {
            nColumnas = input.nextInt();
            if (nColumnas <= 0) {
              System.out.println("Error: Debe Ingresar un numero entero mayor a 0\n");
              continue;
            } else {
              System.out.println("Columnas Ingresadas = [" + nColumnas + "]");
              System.out.println("----------------------------");
            }
          }
        }
      }
    } while (nFilas <= 0 || nColumnas <= 0);
    matriz = new int[nFilas][nColumnas];

  }
}
