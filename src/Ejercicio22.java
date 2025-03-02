import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int mujeres, hombres, total;
    System.out.println("------ Programa Que Calcula El Porcentaje De Hombres y Mujeres En Un Grupo -----");
    System.out.println("---------------------------------------------------------");
    do {

      System.out.println("Ingrese el numero de mujeres");
      System.out.print("-> ");
      mujeres = input.nextInt();
      System.out.println("Ingrese el numero de hombres");
      System.out.print("-> ");
      hombres = input.nextInt();
      total = (mujeres + hombres);

      if (mujeres < 0 || mujeres == 0 || hombres == 0 || hombres < 0)
      {
        System.out.println("---------------------------------------------------------");
        System.out.println("Error: Los valores no pueden ser menores a 0 o iguales a 0");
        System.out.println("---------------------------------------------------------");
      } else {
        System.out.println("---------------------------------------------------------");
        System.out.println("Datos ingresados correctamente");
        System.out.println("---------------------------------------------------------");
      }

    }while (mujeres < 0 || mujeres == 0 || hombres == 0 || hombres < 0);

    System.out.println("---------------------------------------------------------");
    System.out.println("El porcentaje de mujeres es: " + Mujeres(mujeres) / total + "%");
    System.out.println("El porcentaje de hombres es: " + Hombres(hombres) / total + "%");
    System.out.println("---------------------------------------------------------");

  }

  public static int Mujeres(int m){
    return (m * 100);
  }

  public static int Hombres(int h){
    return (h * 100);
  }
}
