package Ejercicios;
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;

    System.out.println("Calcular la calificación final de un estudiante");
    System.out.println("-----------------------------------------------");
    System.out.print("Ingrese la nota de participación: ");
    participacion = input.nextFloat();

    System.out.print("Ingrese la nota del primer examen: ");
    primerExamen = input.nextFloat();

    System.out.print("Ingrese la nota del segundo examen: ");
    segundoExamen = input.nextFloat();

    System.out.print("Ingrese la nota del examen Final: ");
    examenFinal = input.nextFloat();

    participacion = participacion * 0.10f;
    primerExamen = primerExamen * 0.25f;
    segundoExamen = segundoExamen * 0.25f;
    examenFinal = examenFinal * 0.40f;

    System.out.println("-----------------------------------------------");
    notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
    System.out.println("\nLa calificación final del estudiante es: " + notaFinal);
  } 
}
