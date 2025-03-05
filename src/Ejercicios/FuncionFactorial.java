package Ejercicios;
import java.util.Scanner;

public class FuncionFactorial {
  static int n;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingresa un numero: ");
    n = input.nextInt();

    if(n < 0){
      System.out.println("No se puede calcular el factorial de un numero negativo");
    }
    else{
      CalcularFactorial();
    }
    
  }
  
  public static void CalcularFactorial(){
    int i, f = 1;
    for(i = 1; i <= n; i++){
      f = f * 1;
    }

    System.out.println("El factorial de " + n + " es: " + f);
  }
}
