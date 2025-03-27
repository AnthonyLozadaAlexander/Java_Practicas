package EjerciciosArrays;

import java.util.Scanner;

public class TablasArraysV2 {
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
            System.out.println("Array1["+i+"]");
            System.out.print("-> ");
            A[i] = input.nextInt();
        }

        System.out.println("\nDatos Enteros Del Array A");
        for(int i = 0; i < A.length; i++){
            System.out.println("Array["+i+"] = "+ A[i]);
        }

        // Arreglo B
        System.out.println("\nIngrese Datos Enteros Al Array B");
        for(int j = 0; j < B.length; j++){
            System.out.println("Array2["+j+"]");
            System.out.print("-> ");
            B[j] = input.nextInt();
        }

        System.out.println("\nDatos Enteros Del Array B");
        for(int j = 0; j < B.length; j++){
            System.out.println("Array["+j+"] = "+ B[j]);
        }

       int j = 0;
       for(int i = 0; i < A.length; i++){
           C[j] = A[i]; // Entra el 1ero De A
           j++; // Incrementa J
           C[j] = B[i]; // Entra el 1ero de B
           j++; // Incrementa J
       }

        System.out.println("\nDatos Del Arreglo C");
        int countC = 0;
        for(int datos: C){
            System.out.println("C["+countC+"] = "+ datos);
            countC++;
        }
    }
}
