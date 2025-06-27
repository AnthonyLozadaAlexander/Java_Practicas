package Ejercicios;

import java.util.Scanner;

public class EjercicioLogica_1 {
  public static int ordenarBubbleSort(int[] array){
    int aux;
    boolean cambios = false;
    int pasadas = 0;

    while(true){
      cambios = false;
      for (int i = 0; i < array.length; i++) {
        if (array[i] < array[i - 1]) {
          aux = array[i];
          array[i] = array[i - 1];
          array[i - 1] = aux;
          cambios = true;
        }
      }
      pasadas++;
      if (!cambios) {
        break;
      }
    }
    return pasadas;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de elementos del array");
    System.out.print("-> ");
    int n = input.nextInt();
    int[] arreglo = new int[n];
    System.out.println("Ingrese los elementos del array");
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print("Elemento["+(i + 1) + "]: ");
      arreglo[i] = input.nextInt();
    }

    ordenarBubbleSort(arreglo);
    
  }
}
