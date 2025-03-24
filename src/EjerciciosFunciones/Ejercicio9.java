package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio9 {

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase(); // la palabra ingresada se volvera minuscula para su proceso de evaluacion
        palabra = palabra.replace(" ", ""); // se remplazan los espacios ingresados en la palabra para eliminarlos y hacer la palabra toda junta
        palabra = palabra.replace("á", "a");
        palabra = palabra.replace("é", "e");
        palabra = palabra.replace("í", "i");
        palabra = palabra.replace("ó", "o");
        palabra = palabra.replace("ú", "u");

        int a = 0; // primer indice de la palabra
        int b = palabra.length() - 1; // ultimo indice de la palabra

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(a) == palabra.charAt(b)) {
                a++;
                b--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean On = false;
        do {
            Scanner input = new Scanner(System.in);
            String palabra = "";
            String respuesta = "";
            System.out.println("----------------------------");
            System.out.println("         BIENVENIDO");
            System.out.println("----------------------------");
            do {
                System.out.println("Ingrese una palabra o frase");
                System.out.print("-> ");
                palabra = input.nextLine();

                if (palabra == "" || palabra == null) {
                    System.out.println("\nError: La Palabra No Puede Estar Vacia\n");
                } else {
                    System.out.println("\nPalabra Ingresada Correctamente\n");

                    if (esPalindromo(palabra)) {
                        System.out.println("La Palabra Ingresada Es Palindromo");
                    } else {
                        System.out.println("La Palabra Ingresada No Es Palindromo");
                    }
                }
            } while (palabra.equalsIgnoreCase("") || palabra == null);

            do {
                input = new Scanner(System.in);
                System.out.println("\nDesea Continuar En El Programa?");
                System.out.println("1. Si");
                System.out.println("2. No");
                System.out.print("-> ");
                respuesta = input.nextLine();

                if (respuesta.equalsIgnoreCase("")) {
                    System.out.println("\nError: La Respuesta No Puede Estar Vacia");
                }
                else if (respuesta.equalsIgnoreCase("1")) {
                    break;
                }
                else if (respuesta.equalsIgnoreCase("2")) {
                    System.out.println("\nGracias Por Usar Nuestro Programa\n");
                    On = true;
                    break;
                }
                else {
                    System.out.println("\nError: Respuesta Incorrecta");
                }
            }while(true);
        }while(On == false);
    }
}
