package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio7 {
  public static int calcularSegundos(int dias, int horas, int minutos, int segundos) {
    int totalSegundos = 0;
    totalSegundos = (dias * 86400) + (horas * 3600) + (minutos * 60) + segundos;
    return totalSegundos;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int dias = 0, horas = 0, minutos = 0, segundos = 0, totalSegundos = 0;

    System.out.println("-----------BIENVENIDO-----------");
    do {
      System.out.println("Ingrese la cantidad de dias");
      System.out.print("-> ");
      if (!input.hasNextInt()) {
        System.out.println("\nError: Debe Ingresar Un Numero Entero\n");
        input.next();
        continue;
      }
      dias = input.nextInt();
    } while (dias < 0);

    do {
      System.out.println("\nIngrese la cantidad de horas");
      System.out.print("-> ");
      if (!input.hasNextInt()) {
        System.out.println("\nError: Debe Ingresar Un Numero Entero\n");
        input.next();
        continue;
      }
      horas = input.nextInt();
    } while (horas < 0);

    do {
      System.out.println("\nIngrese la cantidad de minutos");
      System.out.print("-> ");
      if (!input.hasNextInt()) {
        System.out.println("\nError: Debe Ingresar Un Numero Entero\n");
        input.next();
        continue;
      }
      minutos = input.nextInt();
    } while (minutos < 0);

    do {
      System.out.println("\nIngrese la cantidad de segundos");
      System.out.print("-> ");
      if (!input.hasNextInt()) {
        System.out.println("\nError: Debe Ingresar Un Numero Entero\n");
        input.next();
        continue;
      }
      segundos = input.nextInt();
    } while (segundos < 0);
    
    System.out.println("\n---------------------------------");
    System.out.println("        Dias: " + dias);
    System.out.println("        Minutos: " + minutos);
    System.out.println("        Horas: " + horas);
    System.out.println("        Segundos: " + segundos);
    System.out.println("---------------------------------\n");

    System.out.println("---------------------------------");
    System.out.println("La conversion total a segundos es");
    System.out.println("-> " + calcularSegundos(dias, horas, minutos, segundos) + " Segundos");
    System.out.println("---------------------------------");
  }
}
