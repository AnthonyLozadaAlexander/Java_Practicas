package Ejercicios;
import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float salario = 1000, comision = 150, meses = 12;
    float ventas, valorCarro, totalVentas;
    float count = 0;

    System.out.println("----------SIMULADOR DE SALARIO----------");
    for (int i = 1; i <= meses; i++) {
      System.out.println("Mes[" + i + "]");
      System.out.print("Ingrese cuántos carros se han vendido: ");
      ventas = input.nextFloat();
      
      System.out.print("Ingrese el valor de cada carro vendido: ");
      valorCarro = input.nextFloat();

      // Se suma el salario base, la comisión fija por carro y el 5% extra del valor de cada venta
      totalVentas = salario + (ventas * comision) + (ventas * valorCarro * 0.05f);
      System.out.println("-------------------------------------------");
      System.out.println("El salario total del mes [" + i + "] es: $" + totalVentas);
      count += totalVentas;
      System.out.println("-------------------------------------------");
    }
    
    System.out.println("---------------------------------------------");
    System.out.println("El salario total del año es de: $" + count);
  }
}
