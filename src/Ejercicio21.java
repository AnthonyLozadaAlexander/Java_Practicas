import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean salir = false;
    float compra, descuento, total;
    System.out.println("-------------BIENVENIDO--------------");
    while(salir == false){
    System.out.println("Ingrese el monto de su compra: ");
    compra = input.nextFloat();

    if(compra < 0){
      System.out.println("--------------------------------------------------");
      System.out.println("Error: El monto de la compra no puede ser negativo");
      System.out.println("--------------------------------------------------");
    }
    else{
      descuento = compra * 0.15f; // 15% de descuento
      total = compra - descuento;
      System.out.println("---------------------------------");
      System.out.println("Dato Ingresado Correctamente");
      System.out.println("---------------------------------");
      System.out.println("-------------FACTURA-------------");
      System.out.println("El monto de la compra es de: " + compra);
      System.out.println("---------------------------------");
      System.out.println("El descuento es de: " + descuento);
      System.out.println("---------------------------------");
      System.out.println("El total a pagar es de: " + total);
      System.out.println("---------------------------------");
      System.out.println("Gracias por su compra");
      System.out.println("---------------------------------");
    }
   }    
  }
}
