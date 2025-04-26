package Ejercicios;
import java.util.Scanner;

public class EjercicioMultiplicar_Array {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;
    int [ ] arreglo = new int[10];

    System.out.println("Ingrese el número a multiplicar por los elementos del arreglo");
    num = input.nextInt();
    System.out.println("");
    System.out.println("Ingrese los elementos al arreglo[ ]");

    for(int i = 0; i < arreglo.length; i++)
    {
      input = new Scanner(System.in); // Reset the scanner
      System.out.println("arreglo["+ i + "] ");
      System.out.println("Ingrese el número");
      arreglo[i] = input.nextInt();
    }

    System.out.println("------------------------------------------");
    System.out.println("Resultados: ");
    for(int i = 0; i < arreglo.length; i++){
      System.out.println(num + " * " + arreglo[i] + " = ");
      arreglo[i] = num * arreglo[i];
      System.out.println("arreglo["+i+"] = " + arreglo[i]);
    }
  }
}
