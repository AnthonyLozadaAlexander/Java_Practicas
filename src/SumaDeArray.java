public class SumaDeArray {
  public static void main(String[] args) {
    
    int[] numeros = {10, 20, 30, 40, 50, 60, 70};
    int suma = 0;

    for(int i = 0; i < 7; i++)
    {
      System.out.println("numeros["+i+"] = " + numeros[i]);
    }

    System.out.println("");
    for(int i = 0; i < 7; i++)
    {
      suma = suma + numeros[i];
    }
    
    System.out.println("La suma de los elementos del arreglo es: " + suma);
    
  } 
}
