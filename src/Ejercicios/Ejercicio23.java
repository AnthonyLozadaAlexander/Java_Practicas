package Ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
  public static float suma(float num1, float num2){
    return num1 + num2;
  }

  public static float resta(float num1, float num2){
    return num1 - num2;
  }

  public static float multiplicacion(float num1, float num2){
    return num1 * num2;
  }

  public static float division(float num1, float num2){
    return num1 / num2;
  }

  public static float exponenciacion(float num1, float num2){
    return (float) Math.pow(num1, num2);
  }

  public static float radicacion(float num1, float num2){
    return (float) Math.pow(num1, (1/num2));
  }
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    float num1 = 0, num2 = 0;
    int opc;
    System.out.println("----OPERACIONES ARITMETICAS----");
    System.out.println("-------------------------------");

    System.out.println("Introduce el primer numero");
    System.out.print("-> ");
    num1 = input.nextFloat();

    System.out.println("Introduce el segundo numero");
    System.out.print("-> ");
    num2 = input.nextFloat();
    System.out.println("-------------------------------");
    
    System.out.println("\n--------------------------------");
    System.out.println("------------OPCIONES--------------");
    System.out.println("        1. Sumar");
    System.out.println("        2. Restar");
    System.out.println("        3. Multiplicacion");
    System.out.println("        4. Division");
    System.out.println("        5. Exponenciacion");
    System.out.println("        6. Radicacion");
    System.out.println("--------------------------------");

    System.out.println("Elige una opcion");
    System.out.print("-> ");
    opc = input.nextInt();

    System.out.println("\n----------------------------------");
    System.out.println("        Opcion Eliga: " + opc);
    System.out.println("----------------------------------\n");

    System.out.println("------------------------------------");
    
    if(opc == 1){
      System.out.println("\nLa suma de " + num1 + " + " + num2 + " es -> " + suma(num1, num2));
    }
    else if(opc == 2){
      if(num1 == 0){
        System.out.println("Error: No se puede restar 0 a otro numero");
      }
      else if(num1 < num2){
        System.out.println("Error: El minuendo no puede ser menor que el sustraendo");
      }
      else{
        System.out.println("\nLa resta de " + num1 + " - " + num2 + " es -> " + resta(num1, num2));
      }
    }
    else if(opc == 3){
      System.out.println("\nLa multiplicacion de " + num1 + " * " + num2 + " es -> " + multiplicacion(num1, num2));
      
    }
    else if(opc == 5){
      
    }
    else if(opc == 6){
      
    }
    else{
      System.out.println("Error: Opcion Invalida");
    }
    System.out.println("------------------------------------");
    
    
  } 
}
