package Ejercicios;
import java.util.Scanner;

public class VariablesEstatica {
  static int n; // se podra acceder a esta variable desde cualquier parte del programa
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa un numero: ");
    n = input.nextInt();
    CalcularCuadrado();
    CalcularCubo();

  }    
  public static void CalcularCuadrado(){
    System.out.println("El cuadrado de " + n + " es: " + (n * n));
  }

  public static void CalcularCubo(){
    System.out.println("El cubo de " + n + " es: " + (n * n * n));
  }
} 

