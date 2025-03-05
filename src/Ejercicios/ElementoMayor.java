package Ejercicios;
public class ElementoMayor {
  public static void main(String[] args){
         
    int[] numeros = {3, 5, 7, 2};
    int Mayor = numeros[0];

    System.out.println("Los elementos del arreglo son: ");
    for(int i = 0; i < 4; i++){
      System.out.println("Numeros["+i+"] = " + numeros[i]);
    }
    System.out.println("");

    for(int i = 1; i < 4; i++){
      if(numeros[i] > Mayor)
      {
        Mayor = numeros[i];
      }
    }

    System.out.println("El elemento mayor del arreglo es: " + Mayor);
  }
}
