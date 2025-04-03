package EjerciciosArrays;

import java.util.Scanner;

public class InsertarNumEnArreglo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        boolean esCreciente = true;
        int num = 0, pos_num=0, k = 0;

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

        System.out.println("\nDigite un elemento entero a insertar");
        System.out.println("-> ");
        num = input.nextInt();

        //Esto es para darnos cuenta en que posicion va el numero
        while(array[k]< num && k < 5){
            pos_num++;
            k++;
        }

        //Trasladamos, una posicion en el arreglo a los elementos que van detras de numeros
        for(int i = 4; i >= pos_num; i--){
            array[i+1] = array[i];
        }

        array[pos_num] = num;
    }
}
