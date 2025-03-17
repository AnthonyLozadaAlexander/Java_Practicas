package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio8 {
  public static float IMC(float peso, float estatura) {
    float imc = peso / (float) (Math.pow(estatura, 2));
    if (imc < 18.5) {
      System.out.println("Peso Insuficiente");
      return imc;
    } else if (imc > 18.5 && imc < 24.9) {
      System.out.println("Peso Normal");
      return imc;
    } else if (imc > 25.0 && imc < 29.9) {
      System.out.println("Sobrepeso");
      return imc;
    } else if (imc > 30.0 && imc < 34.9) {
      System.out.println("Obesidad I");
      return imc;
    } else if (imc > 35.0 && imc < 39.9) {
      System.out.println("Obesidad II");
      return imc;
    } else if (imc > 40.0 && imc < 49.9) {
      System.out.println("Obesidad III");
      return imc;
    } else {
      System.out.println("Obesidad IV");
      return imc;
    }
  }

  public static void main(String[] args) {
    float peso = 0, estatura = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("--------------Calculadora de IMC--------------");
    System.out.println("-----------------------------------------------");
    do {
      System.out.println("\nIngrese su peso");
      System.out.print("-> ");
      if (!input.hasNextFloat()) {
        System.out.println("Error: Ingrese un número");
        input.next(); // Limpiar el buffer del teclado
        continue;
      }
      peso = input.nextFloat();
      if (peso <= 0) {
        System.out.println("\nError: Debe Ingresar Numeros Positivos\n");
      } else {
        System.out.println("\n----------------------------");
        System.out.println("Peso Ingresado: " + peso + " Kg");
        System.out.println("------------------------------\n");
        do {
          System.out.println("\nIngrese su estatura");
          System.out.print("-> ");
          if (!input.hasNextFloat()) {
            System.out.println("\nError: Ingrese un número\n");
            input.next(); // Limpiar el buffer del teclado
            continue;
          }
          estatura = input.nextFloat();
          if (estatura <= 0) {
            System.out.println("\nError: Debe Ingresar Numeros Positivos\n");
          }
          else {
            System.out.println("\n----------------------------");
            System.out.println("Estatura Ingresado: " + estatura + " Kg");
            System.out.println("------------------------------\n");
          }
        } while (estatura <= 0);
      }
    } while (peso <= 0);

    System.out.println("Resultados");
    System.out.println("IMC -> "+ IMC(peso, estatura));
  }
}
