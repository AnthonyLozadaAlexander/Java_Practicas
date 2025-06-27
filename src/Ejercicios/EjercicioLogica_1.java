package Ejercicios;

import java.util.Scanner;

public class EjercicioLogica_1 {
  public static void ordenarBubbleSort(int[] array) {
    int aux;
    boolean cambios = false;
    int pasadas = 0;

    while (true) {
      cambios = false;
      for (int i = 0; i < array.length; i++) {
        if (array[i] < array[i - 1]) {
          aux = array[i];
          array[i] = array[i - 1];
          array[i - 1] = aux;
          cambios = true;
        }
      }
      if (!cambios) {
        break;
      }
    }

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("--------------------------------------------------");
    System.out.println("Ordenamiento de un array con el método Bubble Sort");
    System.out.println("--------------------------------------------------");
    System.out.println("Ingrese la cantidad de elementos del array");
    System.out.print("-> ");
    int n = input.nextInt();
    int[] arreglo = new int[n];
    System.out.println("--------------------------------------------------");
    System.out.println("Ingrese los elementos del array");
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print("Elemento[" + (i + 1) + "]: ");
      arreglo[i] = input.nextInt();
    }
    System.out.println("--------------------------------------------------");
    System.out.println("Array Actual: ");
    for (int i = 0; i < arreglo.length; i++) {
      System.out.println("Elemento[" + (i + 1) + "]: " + arreglo[i]);
    }
    System.out.println("--------------------------------------------------");
    ordenarBubbleSort(arreglo); // función que ordena el array
    System.out.println("Array Ordenado: ");
    for (int i = 0; i < arreglo.length; i++) {
      System.out.println("Elemento[" + (i + 1) + "]: " + arreglo[i]);
    }
    System.out.println("--------------------------------------------------");

  }
}
