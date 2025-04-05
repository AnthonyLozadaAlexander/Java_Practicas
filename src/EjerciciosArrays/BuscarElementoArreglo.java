package EjerciciosArrays;

import java.util.Scanner;

public class BuscarElementoArreglo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arreglo = new int[10];
        int num;
        boolean creciente = false;
        System.out.println("Ingrese Datos Al Arreglo");
        do{
        // Pedimos el arreglo
            for(int i = 0; i < arreglo.length; i++) {
                System.out.println("Arreglo[" + i + "]");
                System.out.print("-> ");
                if(!input.hasNextInt()){
                    System.out.println("\nError: Ingrese un numero entero valido\n");
                    input.next();
                    i--;
                }
                else {
                    arreglo[i] = input.nextInt();
                }
            }

            int index = 0;
            if(arreglo[index] < arreglo[index+1]){
                index++;
                System.out.println("\nEl Arreglo Es Creciente");
                creciente = true;
            }
            else {

                System.out.println("\nError: El Arreglo Esta Decreciente\n");
                creciente = false;
            }

        }while(creciente == false);
    }
}
