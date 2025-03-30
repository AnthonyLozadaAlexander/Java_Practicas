package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio10 {
    public static int countDigits(int num) {
        int res;
        if (num < 10) { // base
            res = 1;
        }
        else { // recursividad
            num = num / 10;
            res = 1 + countDigits(num);
        }
        return res;
    }

    public static void main(String[] args) {
        boolean continuar = false;
        do {
            Scanner input = new Scanner(System.in);
            int num = 0;
            String respuesta = "";

            System.out.println("----------------------------------------");
            System.out.println("              BIENVENIDO");
            System.out.println("----------------------------------------");
            do {
                System.out.println("Ingrese un numero entero positivo");
                System.out.print("-> ");
                if (!input.hasNextInt()) {
                    System.out.println("\nError: Debe Ingresar Un Numero Entero\n");
                    input.next();
                    continue;
                } else {
                    num = input.nextInt();
                    if (num == 0) {
                        System.out.println("\nError: Debe Ingresar Un Numero Entero\n");
                    } else {
                        System.out.println("\nDato Ingresado: " + num);
                    }
                }
            } while (num == 0);

            System.out.println("\nEl Numero Contiene: " + countDigits(num) + " Digitos\n");
            boolean On = false;
            do {
                input = new Scanner(System.in);
                System.out.println("------------------------------------");
                System.out.println("Desea Continuar En El Programa?");
                System.out.println("Digite: \"Si\" para continuar");
                System.out.println("Digite: \"No\" para continuar");
                System.out.print("-> ");
                respuesta = input.nextLine();
                if (respuesta.equalsIgnoreCase("si")) {
                    On = true;
                    continuar = false;
                } else if (respuesta.equalsIgnoreCase("no")) {
                    System.out.println("\nGracias Por Utilizar El Programa");
                    On = true;
                    continuar = true;
                } else {
                    System.out.println("\nERROR: Dato Invalido\n");
                    On = false;
                }
            } while (On == false);

        }while(continuar == false);
    }
}
