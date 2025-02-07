import java.util.Scanner;

public class Ejercicio_Array5 {
    public static void main(String[] args) {
      // Un empleado desea almacenar en un vector sus 12 sueldos del año.
      // A partir de esto, necesita un programa que determine y muestre por pantalla la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.

      int sueldos [] = new int[12];
      Scanner input = new Scanner(System.in);

      // Carga de los sueldos
      for(int i = 0; i < sueldos.length; i++)
      {
        System.out.print("Ingrese el sueldo del mes ["+i+"]: ");
        sueldos[i] = input.nextInt();
      }
    }
}
