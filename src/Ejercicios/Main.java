package Ejercicios;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner para leer la edad

        int edad;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la edad: ");
        edad = input.nextInt();

        if (edad >= 18)
        {
            System.out.println("Su edad es: " + edad + " años, Eres mayor de edad");
        }
        else
        {
            System.out.println("Su edad es: " + edad + " años, Eres menor de edad");
        }

        System.out.println("Fin del programa");


    }
}