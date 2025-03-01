import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean salir = false;
    float sueldo, venta1, venta2, venta3, comision, total, sueldoTotal;
    System.out.println("-------------BIENVENIDO--------------");
    System.out.println("Ingrese el sueldo base del empleado: ");
    sueldo = input.nextFloat();

    do {
      System.out.println("Ingresa las 3 ventas del mes");
      System.out.print("-> ");
      venta1 = input.nextFloat();
      System.out.print("-> ");
      venta2 = input.nextFloat();
      System.out.print("-> ");
      venta3 = input.nextFloat();

      if (venta1 < 0 || venta2 < 0 || venta3 < 0) {
        System.out.println("Error: Las ventas no pueden ser negativas");
        salir = false;
        System.out.println("-----------------------------------------");
      } else {
        System.out.println("-----------RESULTADOS-----------");
        comision = (venta1 + venta2 + venta3) * 0.10f;
        total = sueldo + comision;
        sueldoTotal = total;

        System.out.println("-----------------------------------");
        System.out.println("El sueldo base es: " + sueldo);
        System.out.println("-----------------------------------");
        System.out.println("La comision total es de: " + comision);
        System.out.println("-----------------------------------");
        System.out.println("El sueldo total es de: " + sueldoTotal);
        System.out.println("-----------------------------------");
        salir = true;
      }
    }while (salir == false);

  }

}
