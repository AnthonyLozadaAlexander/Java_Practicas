package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio5 {

  public static boolean esPrimo(int n) {
    if (n <= 1) {
      return false;
    } else if (n == 2) {
      return true;
    } else {
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          return false;
        }
      }

      return true;

    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = 0;
    System.out.println("Ejercicio 5: Determinar si un número es primo o no");
    System.out.println("--------------------------------------------------");

    do {
      System.out.println("\nIngrese hasta que numero desde el 1 hasta n saber si es primo o no:");
      System.out.print("-> ");

      if (!input.hasNextInt()) {
        System.out.println("\nError: Debe Ingresar Un Numero Entero\n");
        input.next(); // discard invalid input
        continue;
      }
      num = input.nextInt();

      if (num <= 1) {
        System.out.println("\nError: Debe Ingresar Un Numero Mayor A 0\n");
        continue;
      } else {
        System.out.println("--------------------------------------------------");
        for (int i = 1; i <= num; i++) {
          System.out.println("i = " + i + " es primo? -> " + esPrimo(i));
        }
        System.out.println("--------------------------------------------------");
        break;
      }

    } while (num <= 1 || !input.hasNextInt());

    System.out.println("\nFin del programa. Gracias por participar.");

  }
}
