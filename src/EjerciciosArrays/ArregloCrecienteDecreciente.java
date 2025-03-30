package EjerciciosArrays;

import java.util.Scanner;

public class ArregloCrecienteDecreciente {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            boolean creciente = false, decreciente = false;
            int nums[], nElementos;
            System.out.println("-----------------------------");
            System.out.println("          BIENVENIDO");
            System.out.println("-----------------------------");
            do {
            System.out.println("Ingrese El Tamaño Del Arreglo");
                System.out.print("-> ");
                if (!input.hasNextInt()) {
                    System.out.println("\nERROR: Debe Ingresar Un Numero Entero\n");
                    input.next();
                    continue;
                }
                else{
                    nElementos = input.nextInt();
                    if (nElementos <= 0) {
                        System.out.println("\nERROR: Debe Ingresar Un Numero Mayor A 0\n");
                        continue;
                    } else {
                        System.out.println("\nTamaño Ingresado -> " + "nums[" + nElementos + "]\n");
                        break;
                    }
                }
            } while (true);
            input.nextLine(); // Clear scanner buffer
            nums = new int[nElementos];

            System.out.println("Ingrese Los Elementos Del Arreglo");
            for (int i = 0; i < nums.length; i++) {
                System.out.print("nums[" + i + "]" + " -> ");
                nums[i] = input.nextInt();
            }

            System.out.println("\nDatos Del Arreglo[" + nElementos + "]");
            int countIndex = 0;
            for (int datos : nums) {
                System.out.println("nums[" + countIndex + "] -> " + datos);
                countIndex++;
            }

            // recorrer los elementos del arreglo
            for (int j = 0; j < (nums.length) - 1; j++) {
                if (nums[j] < nums[j + 1]) { // Creciente: 1-2-3-4-5-6-7-8-9-10
                    creciente = true;
                }
                if (nums[j] > nums[j + 1]) { // Decreciente: 10-9-8-7-6-5-4-3-2-1
                    decreciente = true;
                }
                if (nums[j] == nums[j + 1]) { // Iguales: 1-1-1-1-1-1-1-1-1-1
                    creciente = false;
                    decreciente = false;
                }
            }

            if (creciente == true && decreciente == false) {
                System.out.println("\nEl Arreglo Es Creciente");
                for (int j = 0; j < nums.length; j++) {
                    System.out.print(nums[j] + ", ");
                }
            } else if (creciente == false && decreciente == true) {
                System.out.println("\nEl Arreglo Es Decreciente");
                for (int j = 0; j < nums.length; j++) {
                    System.out.print(nums[j] + ", ");
                }
            } else if (creciente == true && decreciente == true) {
                System.out.println("\nEl Arreglo Esta Desordenado");
                for (int j = 0; j < nums.length; j++) {
                    System.out.print(nums[j] + ", ");
                }
            } else if (creciente == false && decreciente == false) {
                System.out.println("\nEl Arreglo Tiene Sus Elementos Iguales");
                for (int j = 0; j < nums.length; j++) {

                    System.out.print(nums[j] + ", ");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

    }
}
