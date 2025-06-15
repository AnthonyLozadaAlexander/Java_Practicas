package Ejercicios;

import java.util.Scanner;

public class EjercicioLogica {
  public static double calcularIncremento(double salario, double x){
    double nuevoSalario;
    nuevoSalario = salario + (salario * x / 100);
    return nuevoSalario;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double salario = 0, x = 0, nuevoSalario = 0;
    System.out.println("---------------------------------------------------------");
    System.out.println("----------------BIENVENIDO AL PROGRAMA-------------------");
    do{
    System.out.println("Ingrese el salario actual del trabajador");
    System.out.print("-> ");
    salario = input.nextDouble();
    if(salario < 0){
      System.out.println("----------------------------------------------------------");
      System.out.println("El salario no puede ser negativo. Por favor, ingrese un valor positivo.");
      System.out.println("----------------------------------------------------------\n");
    }
    else{
      System.out.println("----------------------------------------------------------");
      System.out.println("El salario ingresado es: " + salario + "$");
      System.out.println("----------------------------------------------------------\n");
    }
    System.out.println("Ingrese el porcentaje de aumento que tendra el salario del trabajador: ");
    System.out.print("-> ");
    x = input.nextDouble();
    if(x < 0){
      System.out.println("----------------------------------------------------------");
      System.out.println("El porcentaje de aumento no puede ser negativo. Por favor, ingrese un valor positivo.");    
    }
    else{
      System.out.println("----------------------------------------------------------");
      System.out.println("El porcentaje de aumento ingresado es: " + x + "%");
    }
    }while(salario < 0 || x < 0);
  
    System.out.println("---------------------------------------------------------");
    nuevoSalario = calcularIncremento(salario, x);
    System.out.println("El nuevo salario del trabajador es: " + nuevoSalario);
    System.out.println("---------------------------------------------------------");
  }
}
