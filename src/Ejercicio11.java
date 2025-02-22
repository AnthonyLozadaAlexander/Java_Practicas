import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = 0;
    float suma = 0;
    float[] calificaciones = new float[3];

    System.out.println("Digite las 3 Calificaciones");
    while (count < 3) {

      System.out.print("Calificacion [" + (count + 1)+ "] -> ");
      calificaciones[count] = input.nextFloat();
      count = count + 1;

      if(calificaciones[count-1] < 0 || calificaciones[count-1] > 10){
        System.out.println("Las calificaciones deben estar entre 0 y 10. Intente de nuevo.");
        count--; // Repetimos el ingreso de esta posición
      } else {
        System.out.println("La Calificación Ha Sido Guardada Correctamente");
      }
    }

    System.out.println("");

    System.out.println("---------------------------------------");
    System.out.println("Las Calificaciones Ingresadas Son: ");
    
    for(int i = 0; i < calificaciones.length; i++){
      System.out.println("Calificaciones["+i+"]: " + calificaciones[i]);
    }

    for(int i = 0; i < calificaciones.length; i++){
      suma = suma + calificaciones[i];
    }

    System.out.println("---------------------------------------");
    System.out.println("La Suma De Las 3 Calificaciones Es: " + suma);
    System.out.println("El Promedio De Las 3 calificaciones Es: " + (suma / calificaciones.length));
  }  
}
