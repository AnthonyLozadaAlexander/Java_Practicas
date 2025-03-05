package Ejercicios;
import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Ejercicio_Array3 {
  public static void main(String[] args) {
    // Realizar un programa que me permita la carga de 15 numeros en un vector, una vez cargados, se necesita que el programa determine cual es el mayor y cual es menor de ellos
    
    int count = 0; // contador para determinar cuantas veces se repite el numero 3
    int[] nums = new int[15];
    Scanner input = new Scanner(System.in);
    
    for(int i = 0; i < 15; i++)
    {
      System.out.print("Ingrese un número al Indice["+i+"]: ");
      nums[i] = input.nextInt();
    }

    System.out.println("");
    System.out.println("Datos de entrada");
    for(int i = 0; i < 15; i++)
    {
      System.out.println("nums["+i+"] = " + nums[i]);
    }
    System.out.println("");
    System.out.println("Resultado: ");
    for(int i = 0; i < nums.length; i++){
      if(nums[i] == 3)
      {
        System.out.println("Nums["+i+"] = " + nums[i]);
        count = count + 1;
      }
    }
    System.out.println("Hay " + count + " numeros 3 en el arreglo");
  } 
}  
