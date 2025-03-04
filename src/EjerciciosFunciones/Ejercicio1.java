package EjerciciosFunciones;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float n1=0, n2=0, n3=0;
    do{
    System.out.println("-------BIENVENIDO-------");
    System.out.println("------------------------");
    System.out.println("Ingrese la primer nota: ");
    n1 = input.nextFloat();

    System.out.println("Ingrese la segunda nota: ");
    n2 = input.nextFloat();

    System.out.println("Ingrese la tercera nota: ");
    n3 = input.nextFloat();
    
    if(n1 <= 0 || n1 > 100 || n2 <= 0 || n2 > 100 || n3 <= 0 || n3 > 100){

      System.out.println("\nError: Las notas no pueden ser menores a 0 o mayores a 100\n");
    }
    else{

      System.out.println("\nNota Final: " + calcularNotaFinal(n1, n2, n3));
      System.out.println("Promedio: " + Promedio(calcularNotaFinal(n1, n2, n3)) + "\n");
    }

  }while(n1 <= 0 || n1 > 100 || n2 <= 0 || n2 > 100 || n3 <= 0 || n3 > 100);
    
  }
  
  //? total(n1, n2, n3); // Llamando a la funcion total que permite sumar las notas con sus respectivas ponderaciones y retornar el total
  
  //? notaFinal(total(n1, n2, n3)); // Llamando a la funcion notaFinal que permite calcular la nota final y retornarla

  public static float calcularNotaFinal(float n1, float n2, float n3){
    return (n1 * 0.30f) + (n2 * 0.30f) + (n3 * 0.40f);
  }
  public static float Promedio(float total){

    return total / 3;

  }
}
