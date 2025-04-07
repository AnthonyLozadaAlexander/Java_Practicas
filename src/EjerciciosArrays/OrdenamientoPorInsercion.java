package EjerciciosArrays;

import java.util.Scanner;

public class OrdenamientoPorInsercion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arreglo[], nElementos = 0 , i = 0, posicion, aux;

    System.out.println("---------------------------------------------");
    System.out.println("           ORDENAMIENTO POR INSERCION          ");
    System.out.println("---------------------------------------------");
    do {
      System.out.println("Ingrese el tamaño del arreglo");
      System.out.print("-> ");
      if (!input.hasNextInt()) {
        System.out.println("\nEl tamaño del arreglo debe ser un numero Entero\n");
        input.next();
        continue;
      }
      nElementos = input.nextInt();
      if (nElementos <= 0) {
        System.out.println("\nEl tamaño del arreglo debe ser mayor a 0");
        System.out.println("Intente nuevamente\n");
      } else {
        System.out.println("\nTamaño Ingresado: " + nElementos + "\n");
      }
    } while (nElementos <= 0);

    arreglo = new int[nElementos];

    do{
    input = new Scanner(System.in);
    System.out.println("Digite los elementos enteros al arreglo");
    for(i = 0; i < arreglo.length; i++){
      System.out.println("Arreglo["+i+"]");
      System.out.print("-> ");
      if(!input.hasNextInt()){
        System.out.println("\nEl elemento del arreglo debe ser un numero Entero\n");
        input.next();
        i--;
        continue;
      }
      else{
        arreglo[i] = input.nextInt();
        if(arreglo[i] <= 0){
          System.out.println("\nError: El Elemento Debe Ser Mayor a 0\n");
          i--;
        }
        else{
          System.out.println("\nElemento Ingresado: " + "Arreglo["+i+"] = " + arreglo[i] + "\n");
        }
      }
    }
    }while(arreglo[i] <= 0);

    //Ordenamiento por insercion
    for(int j = 0; j < nElementos; j++){
      posicion = j;
      aux = arreglo[j]; // aux guarda el valor del elemento a insertar
      while((posicion > 0) && (arreglo[posicion-1] > aux))
      {
        arreglo[posicion] = arreglo[posicion-1]; 
        posicion--;
      }

      arreglo[posicion] = aux; // refresh del numero actual
    }

  }
}
