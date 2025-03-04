package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio3 {

  public static int tablaMultiplicar(int num) {
    for (int i = 0; i <= 12; i++) {
      System.out.println("\n" + num + " x " + i + " = " + (num * i));
    }
    return num;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = 0;

    do {
      System.out.println("Ingrese un número para mostrar su tabla de multiplicar:");

      if (!input.hasNextInt()) {
        String invalidInput = input.next(); // consumimos la entrada no válida
        System.out.println("\nError: '" + invalidInput + "' no es un número entero. Inténtelo de nuevo.\n");
        continue;
      }

      num = input.nextInt();
    
      if (num <= 0) {
        System.out.println("\nError: El número debe ser mayor a 0\n");
      } else {
        tablaMultiplicar(num);
      }
    } while (num <= 0);

  }
}
