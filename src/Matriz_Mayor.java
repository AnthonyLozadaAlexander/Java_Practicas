import java.util.Scanner;

public class Matriz_Mayor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    int f = 0, c = 0;
    
    System.out.println("Ingrese los 9 valores de la matriz: ");
    System.out.println("-------------------------------------");
    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        System.out.println("Ingrese el valor de la Matriz["+i+"]["+j+"]: ");
        matriz[i][j] = input.nextInt();
      }
    }
    input.close();
    System.out.println("-------------------------------------");
    System.out.println("Datos de la matriz: ");
    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("-------------------------------------");
    int mayor = matriz[0][0];
    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        if(matriz[i][j] > mayor){
          mayor = matriz[i][j];
          f = i;
          c = j;
        }
      }
    }
    System.out.println("El elemento/numero mayor de la matriz es: " + mayor);
    System.out.println("Ubicado en la F["+f+"]"+" C["+c+"]"); 
  }
  
}
