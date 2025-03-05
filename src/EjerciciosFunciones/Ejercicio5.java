package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio5 {

  public static boolean esPrimo(int n){
    if(n <= 1){
      return false;
    }
    else if(n == 2){
      return true;
    }
    else
    {
      for(int i = 2; i < n; i++)
      {
        if(n % i == 0)
        {
          return false;
        }
      }

      return true;

    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    System.out.println("Ejercicio 5: Determinar si un número es primo o no");
    System.out.println("--------------------------------------------------");
    
    do{
    System.out.println("Ingrese hasta que numero desde el 1 hasta n saber si es primo o no:");
    System.out.println("-> ");
    if(!input.hasNextInt()){
      System.out.println("Error: Debe Ingresar Un Numero Entero");
      return;
    }
    num = input.nextInt();

    System.out.println("--------------------------------------------------");
    if(num <= 1){
      System.out.println("Error: Debe Ingresar Un Numero Mayor A 0");
      return;
    }
    else{

      for(int i = 1; i <= num; i++){
        System.out.println("i = " + i + " es primo? -> " + esPrimo(i));
      }
      
    }
  }while(num <= 1  || !input.hasNextInt());
    input.close();
    System.out.println("--------------------------------------------------");
    
  }
}
