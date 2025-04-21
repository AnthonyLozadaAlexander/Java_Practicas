package EjerciciosArrays;
import java.util.Scanner;

public class MatrizSumarFilaColumna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Matriz[][], nFilas = 0, nColumnas = 0, sumaF, sumaC;

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
                    System.out.println("---------------------------------------------------------");
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
                            System.out.println("---------------------------------------------------------");
                        }
                    }
                }
            }
        } while (nFilas <= 0 || nColumnas <= 0);

        Matriz = new int[nFilas][nColumnas];

        System.out.println("\nIngrese Los Elementos En La Matriz[" + nFilas + "][" + nColumnas + "]");
        System.out.println("---------------------------------------------------------");
        for (int F = 0; F < nFilas; F++) {
            for (int C = 0; C < nColumnas; C++) {
                System.out.println("Fila[" + F + "]");
                System.out.println("Columna[" + C + "]");
                System.out.print("-> ");
                Matriz[F][C] = input.nextInt();
            }
        }

        System.out.println("\nLa Matriz es: ");
        for(int i = 0; i < nFilas; i++){
            for(int j = 0; j < nColumnas; j++){
                System.out.print(Matriz[i][j] + "");
            }
            System.out.println("");
        }
        System.out.println("---------------------------------------------------------");
        for(int i = 0; i < nFilas; i++){
            sumaF = 0;
            for(int j = 0; j < nColumnas; j++){
                sumaF = sumaF + Matriz[i][j];
            }
            System.out.println("\nLa Suma De La Fila["+i+"] es: "+ sumaF);
        }
        System.out.println("---------------------------------------------------------");
        for(int j = 0; j < nColumnas; j++){
            sumaC = 0;
            for(int i = 0; i < nFilas; i++){
                sumaC = sumaC + Matriz[i][j];
            }
            System.out.println("\nLa Suma De Columna Es: " + sumaC);
        }
    }
}
