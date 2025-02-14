import java.util.Scanner;

public class Ejemplo_Matriz {
  public static void main(String[] args) {
    int i, j, suma = 0;
    Scanner input = new Scanner(System.in);

    //? Matriz 3x3
    int[][] matriz = new int[3][3]; // 3 filas y 3 columnas
    for(i = 0; i < matriz.length; i++){
      for(j = 0; j < matriz[i].length; j++){
        System.out.print("Ingrese elemento a la Matriz[" + i + "][" + j + "]: ");
        matriz[i][j] = input.nextInt();
      }
    }
    System.out.println("");
    System.out.println("Datos de la Matriz: ");
    for(i = 0; i < matriz.length; i++){
      for(j = 0; j < matriz[i].length; j++){
        System.out.print(matriz[i][j]+ " ");
        suma = suma + matriz[i][j];
      }
      System.out.println();
    }
    System.out.println("La suma de los elementos de la matriz es: " + suma);
  }
  
}
