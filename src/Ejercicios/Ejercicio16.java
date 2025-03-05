package Ejercicios;
import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    float ComidaP[] = { 3.50f, 4.00f, 5.00f };
    String Comida[] = { "Arroz Francesa", "Arroz Marinero", "Sopa Marinera" };
    float cedula, total = 0;
    int opcion, opcionC;
    String nombre;
    Boolean On = true;

    do {
      input = new Scanner(System.in); // reset scanner
      System.out.println("------SISTEMA-------");
      System.out.println("1. Ver Menu");
      System.out.println("2. Facturacion");
      System.out.println("3. Salir");
      System.out.println("--------------------");
      System.out.println("Digite la opcion: ");
      opcion = input.nextInt();

      if (opcion == 1) {

        input = new Scanner(System.in); // reset Scanner
        System.out.println("------------------------");
        System.out.println("1.- Arroz Francesa $3.50");
        System.out.println("2.- Arroz Marinero $4.00");
        System.out.println("3.- Sopa Marinera $5.00");
        System.out.println("4.- Salir");
        System.out.println("------------------------");
        System.out.print("Digite la opcion: ");
        opcionC = input.nextInt();
        System.out.println("------------------------");

        if (opcionC > 0 && opcionC < 4) {
          for (int i = 0; i < 3; i++) {
            if (i == opcionC - 1) {
              System.out.println(Comida[i]);
              System.out.println("Precio: " + ComidaP[i]);
            }
          }
        } else if (opcionC == 4) {

          System.out.println("---------------------------");
          System.out.println("Gracias Por Usar El Sistema");
          System.out.println("---------------------------");
          System.exit(0);
        } else if (opcionC <= 0) {
          System.out.println("Error: Opcion No Puede Estar Vacia Ni Ser Un Digito Negativo");
        } else if (opcionC >= 5) {
          System.out.println("Error: Opcion No Valida");
        }
      }

      else if (opcion == 2) {

        input = new Scanner(System.in);

        do {
          System.out.println("-------------FACTURACION----------------");
          System.out.print("Ingrese su nombre: ");
          nombre = input.nextLine();
          System.out.println("----------------------------------------");
          System.out.print("Ingrese su cedula: ");
          cedula = input.nextFloat();

          if (nombre == null) {
            System.out.println("Error: El nombre no puede estar vacio");
            System.out.println("--------------------------------------");
          } else if (cedula < 0 || cedula > 999999999) {
            System.out.println("Error: La Cedula no puede estar vacio ni sobrepasar los 9 Digitos");
            System.out.println("---------------------------------------------------------");
          } else {
            System.out.println("Datos Ingresados Correctamente");
            System.out.println("----------------------------------------");
            On = false;
          }

        } while (On == true);

        do {
          System.out.println("-------------------------------------------");
          System.out.println("Ingrese su Pedido");
          System.out.print("-> ");
          opcionC = input.nextInt();
          System.out.println("-------------------------------------------");

          if (opcionC > 0 && opcionC < 4) {
            for (int i = 0; i < 3; i++) {
              if (i == opcionC - 1) {
                System.out.println(Comida[i]);
                System.out.println("Precio: " + ComidaP[i]);
                total = ComidaP[i];
              }
            }
          } else if (opcionC == 4) {
            System.out.println("---------------------------------------");
            System.out.println("Gracias Por Usar El Sistema");
            System.out.println("---------------------------------------");
            opcionC = 5;

          } else if (opcionC <= 0) {
            System.out.println("Error: Opcion No Puede Estar Vacia Ni Ser Un Digito Negativo");

          } else if (opcionC >= 5) {
            System.out.println("Error: Opcion No Valida");
          }

        } while (opcionC <= 0 || opcionC >= 5);

        System.out.println("-------------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Total: " + total);
        System.out.println("------------------------------------------");
      }

      else if (opcion == 3) {

        System.out.println("---------------------------");
        System.out.println("Gracias Por Usar El Sistema");
        System.out.println("---------------------------");
        System.exit(0);

      } else {
        System.out.println("Error: Opcion No Valida");
      }

    } while (opcion != 3);
  }

}
