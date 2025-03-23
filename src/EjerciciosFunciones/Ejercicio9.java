package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palabra;
        System.out.println("----------------------------");
        System.out.println("         BIENVENIDO");
        System.out.println("----------------------------");
        do {
            System.out.println("Ingrese una palabra o frase");
            System.out.print("-> ");
            palabra = input.nextLine();

            if(palabra == "" || palabra == null){
                System.out.println("\nError: La Palabra No Puede Estar Vacia\n");
            }
            else{
                System.out.println("\nPalabra Ingresada Correctamente\n");
            }
        }while(palabra.equalsIgnoreCase("") || palabra == null);

    }
}
