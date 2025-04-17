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
      } else {
        nFilas = input.nextInt();
      }
    } while (nFilas <= 0 || nColumnas <= 0);
  }
}
