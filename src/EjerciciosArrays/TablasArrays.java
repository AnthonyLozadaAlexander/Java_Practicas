package EjerciciosArrays;

import java.util.Scanner;

public class TablasArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        System.out.println("-----------------------------");
        System.out.println("         BIENVENIDO");
        System.out.println("-----------------------------");

        // Arreglo A
        System.out.println("Ingrese Datos Enteros Al Array A");
        for(int i = 0; i < A.length; i++){
            System.out.println("ArrayA["+i+"]");
            System.out.print("-> ");
            A[i] = input.nextInt();
        }

        System.out.println("\nDatos Enteros Del Array A");
        for(int i = 0; i < A.length; i++){
            System.out.println("ArrayA["+i+"] = "+ A[i]);
        }

        // Arreglo B
        System.out.println("\nIngrese Datos Enteros Al Array B");
        for(int j = 0; j < B.length; j++){
            System.out.println("ArrayB["+j+"]");
            System.out.print("-> ");
            B[j] = input.nextInt();
        }

        System.out.println("\nDatos Enteros Del Array B");
        for(int j = 0; j < B.length; j++){
            System.out.println("ArrayB["+j+"] = "+ B[j]);
        }

        int index1 = 0, index2 = 0; // para evitar desbordamiento de memoria
        for(int k = 0; k < C.length; k++){
            if(k % 2 == 0){
                if(index1 < A.length){
                    C[k] = A[index1++]; // incrementador del index1 hasta A.length
                }
            }
            else{
                if(index2 < B.length) {
                    C[k] = B[index2++]; // incrementador del index2 hasta B.length
                }
            }
        }

        System.out.println("\nDatos Del Arreglo C");
        int countC = 0;
        for(int datos: C){
            System.out.println("C["+countC+"] = "+ datos);
            countC++;
        }
    }
}
