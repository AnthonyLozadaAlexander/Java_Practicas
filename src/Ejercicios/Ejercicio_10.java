package Ejercicios;
import java.util.Scanner;

public class Ejercicio_10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] nums = new int[15];
    System.out.println("Ingrese 15 numeros enteros al Array");
    // Carga del array
    for(int i = 0; i < nums.length; i++){
      System.out.println("Numero[" + (i) + "]");
      nums[i] = input.nextInt();
    }
    // Mostrar los numeros ingresados
    int count = 0;
    System.out.println("-------------------------------------");
    System.out.println("Los numeros ingresados son: ");
    for(int i = 0; i < nums.length; i++){
      System.out.println("Numero["+i+"] = " + nums[i]);
    }
    // Mostrar los numeros 3 repetidos
    System.out.println("-------------------------------------");
    System.out.println("Los numeros 3 repetidos son: ");
    for(int i = 0; i < nums.length; i++){
      if(nums[i] == 3){
        System.out.println("Numero[" + i + "] = " + nums[i]);
        count = count + 1;
      }
    }
    System.out.println("-------------------------------------");
    System.out.println("La cantidad de numeros 3 repetidos son: " + count);
    // fin del programa
    System.out.println("-------------------------------------");
    System.out.println("Fin del programa.");
    input.close();
  }
}
