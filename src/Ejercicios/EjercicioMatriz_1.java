package Ejercicios;
import java.util.Scanner;

public class EjercicioMatriz_1 {  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     int matriz[][] = new int[4][5];

     for(int f = 0; f < 4; f++){
      for(int c = 0; c < 5; c++){
        System.out.println("Ingrese el valor de la fila["+f+"], columna["+c+"]: ");
        matriz[f][c] = input.nextInt();
      }
    }
    input.close();

    for(int f = 0; f < 4; f++)
    {
      for(int c = 0; c < 5; c++)
      {
        System.out.print("["+matriz[f][c]+"] ");
      }
      System.out.println();
    }


  }
}
