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
            // Creciente = 1-2-3-4-5-6-7

            for(int j = 0; j < array.length; j++){
                if(array[j] < array[j+1]){ // (C[0] = 1 < C[1] = 2) == true
                    esCreciente = true;
                }

                if(array[j] > array[j+1]){ // decreciente = 5-4-3-2-1
                    esCreciente = false; // (C[0] = 5 < C[1] = 4) == false
                }
            }

            if(esCreciente == false){
                System.out.println("\nEl Arreglo No Se Encuentra Ordenado Crecientemente\n");
            }
        }while(!esCreciente); // Mientras(esCreciente == false);
    }
}
