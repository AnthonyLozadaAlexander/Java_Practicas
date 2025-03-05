package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio4 {

  public static String multiplicar(int n1, int n2){
    
    return n1 + " x " + n2 + " = " + (n1 * n2);

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = 0;
    System.out.println("Ingrese un número entero para mostrar su tabla de multiplicar");
    System.out.print("-> ");
    n = input.nextInt();

    for(int i = 0; i <= 12; i++){
      System.out.println(multiplicar(n, i));
    }

    input.close();
  }
}
