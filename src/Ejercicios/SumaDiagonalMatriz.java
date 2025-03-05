package Ejercicios;
import java.util.Scanner;

public class SumaDiagonalMatriz {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i, j, suma = 0;
    int[][] matriz = new int[3][3];
    
    for(i = 0; i < matriz.length; i++){
      for(j = 0; j < matriz[i].length; j++){
        System.out.print("Ingrese el valor de la matriz en la posición [" + i + "][" + j + "]: ");
        matriz[i][j] = input.nextInt();
      }
    }
    System.out.println("Matriz ingresada: \n");

    for(i = 0; i < matriz.length; i++){
      for(j = 0; j < matriz[i].length; j++){
        System.out.print(matriz[i][j] + "");
      }
      System.out.println("");
    }
      System.out.println("");
    for(i = 0; i < matriz.length; i++){
      for(j = 0; j < matriz[i].length; j++){
        if(i == j){
          suma = suma + matriz[i][j];
        }
      }
    }
    System.out.println("La suma de la diagonal de la matriz es: " + suma);
  }
}
