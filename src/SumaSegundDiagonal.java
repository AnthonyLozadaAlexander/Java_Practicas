import java.util.Scanner;

public class SumaSegundDiagonal {
  public static void main(String[] args) {
    //? Sumar la diagonal secundaria de una matriz en java
    Scanner input = new Scanner(System.in); 
    int[][] matriz = new int[3][3];
    int F, C, suma = 0;

    for(F = 0; F < matriz.length; F++){
      for(C = 0; C < matriz[F].length; C++){
        System.out.print("Ingrese un número a la Matriz["+F+"]["+C+"] -> ");
        matriz[F][C] = input.nextInt();
      }
    }
    System.out.println("");
    System.out.println("Matriz Ingresada: ");
    
    for(F = 0; F < matriz.length; F++){
      for(C = 0; C < matriz[F].length; C++){
        System.out.print(matriz[F][C]+" ");    
      }
      System.out.println();
    }
    System.out.println("");
    System.out.println("Diagonal Secundaria: ");
    for(F = 0; F < matriz.length; F++){
      for(C = 0; C < matriz[F].length; C++){
        if (F + C == matriz.length - 1) {
          System.out.println("Matriz["+F+"]["+C+"]: " + matriz[F][C]);
          suma = suma + matriz[F][C];
        }   
      }
    }
    System.out.println("");
    System.out.println("Suma de la Diagonal Secundaria: " + suma);
  }
}
