package Ejercicios;

import java.util.Scanner;

public class Ejercicio_Array8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        System.out.print("-> "); //ABCD
        String frase = input.nextLine();
        char[] array = new char[frase.length()];
        for (int i = 0; i < array.length ; i++) {
            array[i] = frase.charAt(i); // A = [0], B = [1], C = [2], D = [3]
        }
        System.out.println("Elementos de la frase");
        String coma = ", ";
        for (int i = 0; i < array.length; i++) {

            if(i == array.length - 1){
                System.out.print(array[i]); // No imprimir coma al final
            }else{
                System.out.print(array[i] + coma); // Imprimir coma entre elementos
            }
        }
        input.close();
    }
}
