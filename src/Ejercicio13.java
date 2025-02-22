import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float salario, comision, totalVentas, meses, ventas, count, total;
    salario = 1000;
    comision = 150;
    meses = 12;
    count = 0;

    System.out.println("----------SIMULADOR DE SALARIO----------");
    for(int i = 1; i <= meses; i++)
    {

      System.out.println("Mes["+(i)+"]");
      System.out.println("Ingrese Cuantos Carros Se Han Vendido: ");
      ventas = input.nextFloat();

      System.out.println("-------------------------------------------");
      totalVentas = salario + (ventas * comision);
      System.out.println("El Salario Total Del Mes ["+i+"] Es: $"+totalVentas);
      count = count + totalVentas;
      System.out.println("-------------------------------------------");
      
    }
    System.out.println("---------------------------------------------");
    System.out.println("El Salario Total Del Año Es De: " + count);
  }
}
