package Ejercicios;
import java.util.Scanner;

public class EjercicioJava_Aerolineas {
  public static void main(String[] args) {
    // matriz vuelos
    int vuelos[][] = new int[6][3]; // 6 filas y 3 columnas
    Scanner input = new Scanner(System.in);

    for (int f = 0; f < 6; f++) {
      for (int c = 0; c < 3; c++) {
        System.out.println("Ingrese la cantidad de asientos para el destino: " + f + " Horario: " + c + ":");
        vuelos[f][c] = input.nextInt();
      }
    }
    Scanner input2 = new Scanner(System.in);
    String bandera = "";
    int destino, horario, asientos;

    while (!bandera.equalsIgnoreCase("Finish")) { // Mientras(bandera no sea igual a "finish")

      System.out.println("Ingrese el N° de destino");
      destino = input.nextInt();
      System.out.println("Ingrese el N° de horario");
      horario = input.nextInt();
      System.out.println("Ingrese la cantidad de asientos disponible");
      asientos = input.nextInt();

      if (destino >= 0 && destino <= 5) {
        if (horario >= 0 && horario <= 2) {

          if (vuelos[destino][horario] >= asientos) {
            System.out.println("Su reserva fue realizada con exito");
            vuelos[destino][horario] = vuelos[destino][horario] - asientos;
          } else {
            System.out.println("No hay asientos disponibles para el destino y horario seleccionado");
          }
        } else {
          System.out.println("Horario No Existente. Ingrese entre 0 y 2");
        }
      } else {
        System.out.println("Destino No Existente. Ingrese entre 0 y 5");
      }

      System.out.println("¿Desea continuar reservando?. Ingrese \"Finish\" para salir");
      bandera = input2.nextLine();
      if (bandera.equalsIgnoreCase("Finish")) {
        System.out.println("Gracias por utilizar nuestro servicio");
        bandera = "Finish";
      } else {
        System.out.println("Continuando con la reserva");
        bandera = "" + "\n";
      }

    }
  }
}
