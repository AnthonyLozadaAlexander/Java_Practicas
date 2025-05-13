package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio15 {
   public static boolean esMayorQueCero(int a) {
    if (a > 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = 0;
    System.out.println("----------------------------");
    System.out.println("         BIENVENIDO         ");
    System.out.println("----------------------------");
    do {
      System.out.println("Ingrese un numero");
      System.out.print("-> ");
      if (!input.hasNextInt()) {
        System.out.println("El valor ingresado no es un numero entero");
        input.next();
        continue;
      }
      else {
        num = input.nextInt();
        if (num < 0) {
          System.out.println("El valor ingresado no es un numero entero positivo");
          System.out.println("Es mayor que cero? = " + esMayorQueCero(num));
        } 
        else {
          System.out.println("El valor ingresado es: " + num);
        }
      }
      System.out.println("----------------------------");
    } while (num < 0);
    input.close();
    System.out.println("-------------------------------");
    System.out.println("Es mayor que cero? = " + esMayorQueCero(num));
  }
}
