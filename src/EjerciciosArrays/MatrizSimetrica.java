package EjerciciosArrays;

import java.util.Scanner;

public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Matrix[][], nFilas = 0, nColumnas = 0;
        boolean simetrica = true;

        System.out.println("----------------------------");
        System.out.println("         BIENVENIDO         ");
        System.out.println("----------------------------");
        do {
            System.out.println("Ingrese el numero de filas");
            System.out.print("-> ");
            if (!input.hasNextInt()) {
                System.out.println("\nError: Debe Ingresar un numero entero\n");
                input.next();
                continue;
            } else {
                nFilas = input.nextInt();
                if (nFilas <= 0) {
                    System.out.println("\nError: Debe Ingresar un numero entero mayor a 0\n");
                } else {
                    System.out.println("Filas Ingresadas = [" + nFilas + "]");
                    System.out.println("----------------------------");
                    System.out.println("Ingrese el numero de Columnas");
                    System.out.print("-> ");
                    if (!input.hasNextInt()) {
                        System.out.println("\nError: Debe Ingresar un numero entero\n");
                        input.next();
                        continue;
                    } else {
                        nColumnas = input.nextInt();
                        if (nColumnas <= 0) {
                            System.out.println("Error: Debe Ingresar un numero entero mayor a 0\n");
                        } else {
                            System.out.println("Columnas Ingresadas = [" + nColumnas + "]");
                            System.out.println("-----------------------------------------------");
                        }
                    }
                }
            }
        } while (nFilas <= 0 || nColumnas <= 0);
        Matrix = new int[nFilas][nColumnas];
        System.out.println("\nIngrese Los Elementos En La Matriz[" + nFilas + "][" + nColumnas + "]");
        System.out.println("---------------------------------------------------------");
        for (int F = 0; F < nFilas; F++) {
            for (int C = 0; C < nColumnas; C++) {
                System.out.println("Fila[" + F + "]");
                System.out.println("Columna[" + C + "]");
                System.out.print("-> ");
                Matrix[F][C] = input.nextInt();
            }
        }

        if (nFilas == nColumnas) { // si el numero de filas es igual al numero de columnas
            int i = 0, j;
            while (i < nFilas && simetrica == true) {
                j = 0;
                while (j < nColumnas && simetrica == true) {
                    if (Matrix[i][j] != Matrix[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
        } else {
            System.out.println("\nLa Matriz No Es Simetrica\n");
        }
    }
}
