package EjerciciosArrays;

import java.util.Scanner;

public class InsertarNumEnArreglo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        boolean esCreciente = true;

        System.out.println("\n-----------------------------------");
        System.out.println("              BIENVENIDO");
        System.out.println("-------------------------------------");
        System.out.println("Ingrese Los Elementos Al Arreglo: ");
        do {
            for(int i = 0; i < array.length; i++) {
                System.out.println("\nArray["+i+"]");
                System.out.println("Digite un elemento entero");
                System.out.print("-> ");
                array[i] = input.nextInt();
            }
            // Comprobar si el arreglo se encuentra ordenado en forma creciente
            for(int c = 0; c < array.length; c++){
                if(array[c] < array[c+1]){ // (C[0] = 1 < C[1] = 2) == true
                    esCreciente = true;
                }
                else{
                    esCreciente = false; // (C[0] = 5 < C[1] = 4) == false
                }
            }
        }while(!esCreciente);
    }
}
