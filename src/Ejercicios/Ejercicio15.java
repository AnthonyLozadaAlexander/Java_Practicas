package Ejercicios;
import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int horasTotales, semanas, dias, horas;
    
    System.out.print("Digite el número de horas: ");
    horasTotales = input.nextInt();

    //* */ 1 dia = 24 horas 
    //* 1 semana = 168 horas 
    //* la semana tiene 7 dias, entonces 24 * 7 = 168

    semanas = horasTotales / 168;
    dias = (horasTotales % 168) / 24;
    horas = (horasTotales % 24);

    System.out.println("\nSemanas: " + semanas);
    System.out.println("Dias: " + dias);
    System.out.println("Horas: " + horas);

  }
}
