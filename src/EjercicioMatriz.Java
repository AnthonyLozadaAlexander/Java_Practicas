import java.util.Scanner;

public class EjercicioMatriz {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] matriz = new int[3][3];

    // primero entra al indice de la fila y luego recorre los 3 indices de la columna pidiendo los datos por entrada (input)
    // y luego entra a la siguiente fila, recorriendo los 3 indices de la columna, repitiendo el proceso hasta completar la matriz
    for(int f = 0; f < matriz.length; f++)
    {
      for(int c = 0; c < matriz.length; c++)
      {
       System.out.println("Ingrese el valor de la matriz["+f+"]["+c+"]");
       System.out.print("-> "); matriz[f][c] = input.nextInt();
      }
    }

    //? Imprime la matriz 
    System.out.println("------------------------------------------");
    System.out.println("Matriz Ingresada: \n");
    for(int f = 0; f < matriz.length; f++)
    {
      for(int c = 0; c < matriz.length; c++)
      {
        System.out.print("[ " + matriz[f][c] + " ] ");
      }
      System.out.println(); // Salto de linea para fila ----> de la matriz 
    }  
  }
}
