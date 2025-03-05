package Ejercicios;
import java.util.Scanner;

public class EjercicioArreglo_for {
  public static void main(String[] args) {
    int nums[] = new int[6];
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese 6 numero al arreglo");
    System.out.println("----------------------------");
    for(int i = 0; i < nums.length; i++){
      System.out.println("Ingrese el numero["+i+"]");
      nums[i] = input.nextInt();
    }
    input.close();
    System.out.println("----------------------------");
    System.out.println("Datos del arreglo: ");
    for(int i = 0; i < nums.length; i++){
      System.out.print("nums["+i+"] = ");
      System.out.println(nums[i]);
    }
    System.out.println("----------------------------");
    System.out.println("Datos de numeros pares del arreglo: ");
    for(int i = 0; i < nums.length; i++){
      
      if(nums[i] % 2 == 0)
      {
        System.out.print("nums["+i+"] = ");
        System.out.println(nums[i]);
      }
    }
    System.out.println("----------------------------");
  }
}
