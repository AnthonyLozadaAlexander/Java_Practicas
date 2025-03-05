package Ejercicios;
import java.util.Scanner;

public class Ejercicio_Array5 {
    public static void main(String[] args) {
      // Un empleado desea almacenar en un vector sus 12 sueldos del año.
      // A partir de esto, necesita un programa que determine y muestre por pantalla la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.

      double sueldos [] = new double[12];
      Scanner input = new Scanner(System.in);

      // Carga de los sueldos
      for(int i = 0; i < sueldos.length; i++)
      {
        System.out.print("Ingrese el sueldo del mes ["+(i+1)+"]: ");
        sueldos[i] = input.nextDouble();
      }

      // Suma de los sueldos
      double suma = 0;
      for(int i = 0; i < sueldos.length; i++)
      {
        suma = suma + sueldos[i];
      }

      // Resultados
      System.out.println("");
      double promedio = suma / sueldos.length;
      System.out.println("La suma total de los sueldos es: " + suma + " $");
      System.out.println("El promedio de los sueldos es: " + promedio + " dolares");
    }
}
