package EjerciciosArrays;

import java.util.Scanner;

public class MatrizDefinicion {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int matriz[][] , nFilas, nColumnas;

      System.out.println("--------------------------------------------");
      System.out.println("                 BIENVENIDO                 ");
      System.out.println("--------------------------------------------");
      do{
      System.out.println("Ingrese el numero de filas de la matriz");
      System.out.print("-> ");
      nFilas = input.nextInt();

      System.out.println("Ingrese el numero de columnas de la matriz");
      System.out.print("-> ");
      nColumnas = input.nextInt();
      }while(nFilas <= 0 || nColumnas <= 0);
    }
}
