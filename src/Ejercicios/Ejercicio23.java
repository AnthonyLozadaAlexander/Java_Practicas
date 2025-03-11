package Ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    float num1 = 0, num2 = 0;
    int opc;
    System.out.println("----OPERACIONES ARITMETICAS----");
    System.out.print("-------------------------------");

    System.out.println("Introduce el primer numero");
    System.out.print("-> ");
    num1 = input.nextFloat();

    System.out.println("Introduce el segundo numero");
    System.out.print("-> ");
    num2 = input.nextFloat();
    
    System.out.println("--------------------------------");
    System.out.println("----------OPCIONES--------------");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicacion");
    System.out.println("4. Division");
    System.out.println("5. Exponenciacion");
    System.out.println("6. Radicacion");
    System.out.println("--------------------------------");
    System.out.println("Elige una opcion");
    System.out.print("-> ");
    opc = input.nextInt();

    if(opc == 1){

    }
    else if(opc == 2){

    }
    else if(opc == 3){

    }
    else if(opc == 5){

    }
    else if(opc == 6){

    }
    else{
      System.out.println("Error: Opcion Invalida");
    }
  } 
}
