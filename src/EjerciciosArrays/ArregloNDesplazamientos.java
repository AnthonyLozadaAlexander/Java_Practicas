package EjerciciosArrays;

import java.util.Scanner;

public class ArregloNDesplazamientos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Vector = new int[10];
        int n = 0;
        System.out.println("-----------------------------");
        System.out.println("          BIENVENIDO");
        System.out.println("-----------------------------");
        System.out.println("Ingrese los 10 elementos al arreglo");
        for (int i = 0; i < Vector.length; i++) {
            System.out.println("Element[" + i + "]");
            System.out.print("-> ");
            if (!input.hasNextInt()) {
                System.out.println("\nERROR: Debe Ingresar Un Numero Entero\n");
                input.next();
                i--;
                continue;
            } else {
                Vector[i] = input.nextInt();
                System.out.println("\nIndice[" + i + "] Ingresado: " + Vector[i] + "\n");
            }
        }

        System.out.println("Datos Del Arreglo");
        for (int i = 0; i < Vector.length; i++) {
            System.out.println("Vector[" + i + "] -> " + Vector[i]);
        }

        boolean validInput = false;
        while (!validInput) { // !validInput = true
            System.out.println("\nCuantos Desplazamientos Desea Realizar?");
            System.out.print("-> ");
            if (!input.hasNextInt()) {
                System.out.println("\nERROR: Debe Ingresar Un Numero Entero\n");
                input.next();
                continue;
            }
            n = input.nextInt();
            if (n < 0) {
                System.out.println("\nERROR: Debe Ingresar Un Numero Mayor A 0\n");
                continue;
            }
            validInput = true;
        }

        int[] temp = new int[Vector.length]; // Se guarda todo el vector en un arreglo temporal
        for (int i = 0; i < Vector.length; i++) {
            temp[i] = Vector[i];
        }

        for(int j = 0; j < Vector.length; j++){
            int newPosition = (j + n) % Vector.length; // Se calcula la posicion
            Vector[newPosition] = temp[j]; // Se asigna el valor del arreglo temporal a la nueva posicion
        }

        System.out.println("\nArreglo Desplazado:"); // nuevos elementos del arreglo
        int countIndex = 0;
        for(int datos: Vector){
            System.out.println("Vector["+countIndex+"] -> " + datos);
            countIndex++;
        }
    }
}
