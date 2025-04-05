package EjerciciosArrays;

import java.util.Scanner;

public class BuscarElementoArreglo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arreglo = new int[10];
        int num;
        boolean creciente = false;
        System.out.println("Ingrese Datos Al Arreglo");
        do {
            // Pedimos el arreglo
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("Arreglo[" + i + "]");
                System.out.print("-> ");
                if (!input.hasNextInt()) {
                    System.out.println("\nError: Ingrese un numero entero valido\n");
                    input.next();
                    i--;
                } else {
                    arreglo[i] = input.nextInt();
                }
            }

            for (int j = 0; j < (arreglo.length) - 1; j++) { // j < 9

                if (arreglo[j] < arreglo[j + 1]) {
                    creciente = true;
                } else {
                    creciente = false;
                }
            }

            System.out.println("El Arreglo es Creciente? = " + creciente);

        } while (creciente == false);
    }
}
