package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio2 {

  public static float IVA(float precioDeCompra){
    float IVA = precioDeCompra + (precioDeCompra * 0.19f);
    return IVA;
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float precioDeCompra, IVA;

      do{
      System.out.println("Ingrese el precio total de la compra");
      System.out.print("-> ");
      precioDeCompra = input.nextFloat();

      if(precioDeCompra <= 0){
        System.out.println("Error: El precio de compra no puede ser menor o igual a 0");
      }
      else{    
        
      System.out.println("-------------------------------------");
      System.out.println("Total:" + precioDeCompra);
      System.out.println("Total Con IVA del 19%: " + IVA(precioDeCompra));
      System.out.println("-------------------------------------");

      }
    }while(precioDeCompra <= 0);
  }
}
