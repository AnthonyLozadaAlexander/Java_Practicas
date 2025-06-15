package EjerciciosArrays;

import java.util.Scanner;

public class NumeroRepetido {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una serie de números separados por espacios: ");
        String serie = input.nextLine();
        String[] array = serie.split(""); // split divide serie en caracteres strings individuales
        boolean continuar = true;

        for (int i = 0; continuar && i < array.length; i++) {
            for (int j = 0; continuar && j < array.length; j++) {
                if(i!= j && array[i].equals(array[j])) {
                    System.out.println("El número " + array[i] + " se repite en la posición " + i + " y " + j);
                    continuar = false; // Si se encuentra un número repetido, se detiene el bucle
                }
            }
        }

    }
}
