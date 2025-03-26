package EjerciciosArrays;

import java.util.Scanner;

public class TablasArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Tabla1 = new int[10];
        int[] Tabla2 = new int[10];
        int[] array3 = new int[20];

        System.out.println("-----------------------------");
        System.out.println("         BIENVENIDO");
        System.out.println("-----------------------------");

        System.out.println("Ingrese Datos Enteros Al Array1");
        for(int i = 0; i < Tabla1.length; i++){
            System.out.println("Array1["+i+"]");
            System.out.print("-> ");
            Tabla1[i] = input.nextInt();
        }

        System.out.println("\nDatos Enteros Del Array1");
        for(int i = 0; i < Tabla1.length; i++){
            System.out.println("Array["+i+"] = "+ Tabla1[i]);
        }

        System.out.println("\nIngrese Datos Enteros Al Array2");
        for(int j = 0; j < Tabla2.length; j++){
            System.out.println("Array2["+j+"]");
            System.out.print("-> ");
            Tabla2[j] = input.nextInt();
        }

        System.out.println("\nDatos Enteros Del Array2");
        for(int j = 0; j < Tabla2.length; j++){
            System.out.println("Array["+j+"] = "+ Tabla1[j]);
        }

        for(int k = 0; k < array3.length; k++){

        }
    }
}
