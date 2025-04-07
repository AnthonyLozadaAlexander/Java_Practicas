package EjerciciosArrays;

import java.util.Scanner;

public class OrdenamientoPorInsercion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arreglo[], nElementos = 0;

    System.out.println("---------------------------------------------");
    System.out.println("            ORDENAMIENTO POR INSERCION          ");
    System.out.println("---------------------------------------------\n");
    do {
      System.out.println("Ingrese el tamaño del arreglo");
      System.out.print("-> ");
      if (!input.hasNextInt()) {
        System.out.println("\nEl tamaño del arreglo debe ser un numero Entero\n");
        input.next();
        continue;
      }
      nElementos = input.nextInt();
      if (nElementos <= 0) {
        System.out.println("\nEl tamaño del arreglo debe ser mayor a 0");
        System.out.println("Intente nuevamente\n");
      } else {
        System.out.println("\nTamaño Ingresado: " + nElementos + "\n");
      }
    } while (nElementos <= 0);

    arreglo = new int[nElementos];

  }
}
