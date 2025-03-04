package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio3 {
  
  public static int tablaMultiplicar(int num) {
    for (int i = 0; i <= 12; i++) {
      System.out.println(num + " x " + i + " = " + (num * i));
    }
    return num;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;

    do {
      System.out.println("Ingrese Un Número Para Mostrar Su Tabla De Multiplicar: ");
      num = input.nextInt();

      if (num <= 0) {
        System.out.println("Error: El número debe ser mayor a 0");
      } else {
        tablaMultiplicar(num);
      }
    } while (num <= 0);

  }
}
