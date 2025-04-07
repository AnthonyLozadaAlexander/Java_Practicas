package EjerciciosArrays;

import java.util.Scanner;

public class OrdenamientoPorInsercion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arreglo[] , nElementos;

    do{
    System.out.println("Ingrese el tamaño del arreglo");
    System.out.print("-> ");
    nElementos = input.nextInt();
    if(nElementos <= 0){
      System.out.println("\nEl tamaño del arreglo debe ser mayor a 0");
      System.out.println("Intente nuevamente\n");
    }else{
      System.out.println("\nTamaño Ingresado: " + nElementos);
    }
    }while(nElementos <= 0);
    arreglo = new int[nElementos];
    
  }
}
