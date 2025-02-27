import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double salario, porcentaje, salarioFinal;

    System.out.println("----BIENVENIDO----");
    System.out.println("Ingrese su salario actual: ");
    salario = input.nextDouble();

    if(salario < 18000){
      porcentaje = salario * 0.012;
      salarioFinal = salario + porcentaje;
      System.out.println("Su salario final es: " + salarioFinal);
    }
    else if(salario > 18000 && salario <= 30000){
      porcentaje = salario * 0.08;
      salarioFinal = salario + porcentaje;
      System.out.println("Su salario final es: " + salarioFinal);
    }
    else if(salario > 30000 && salario <= 50000){
      porcentaje = salario * 0.07;
      salarioFinal = salario + porcentaje;
      System.out.println("Su salario final es: " + salarioFinal);
    }
    
  }  
}
