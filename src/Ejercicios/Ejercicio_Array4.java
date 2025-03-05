package Ejercicios;
import java.util.Scanner;

public class Ejercicio_Array4 {
    public static void main(String[] args) 
    {
       //? Realizar un programa que permita la carga de 15 numeros en un vector, una vez cargados, se necesita que el programa determina cuantas veces se repite el numero 3 en el arreglo

       Scanner input = new Scanner(System.in);
       int[] nums = new int[15];
       int count = 0;

       for(int i = 0; i < 15; i++)
       {
        System.out.println("Ingrese el numero al Indice["+i+"]: ");
        nums[i] = input.nextInt();
       }
       
       System.out.println("");
       System.out.println("Datos de entrada");
       for(int i = 0; i < nums.length; i++)
       {
        System.out.println("Nums["+i+"] = " + nums[i]);
       }

       System.out.println("");
       System.out.println("Resultado: ");
       for(int i = 0; i < nums.length; i++)
       {
        if(nums[i] == 3 || nums[i] == -3)
        {
          System.out.println("Nums["+i+"] = " + nums[i]);
          count = count + 1;
        }
       }
       System.out.println("La cantidad de veces que se repitio 3 fue: " + count);
    }
}
