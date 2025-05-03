package Matematicas;
import java.util.Scanner;

public class FormulaGeneral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x = 0f, a = 0f, b = 0f, c = 0f, denominador = 0f, numerador = 0f;
        System.out.println("----------------------------");
        System.out.println("         BIENVENIDO         ");
        System.out.println("----------------------------");
        System.out.println("Ingrese el valor de a");
        System.out.print("-> ");
        a = input.nextFloat();
        System.out.println("Ingrese el valor de b");
        System.out.print("-> ");
        b = input.nextFloat();

        numerador = (float) Math.pow(b, 2) - (float) (Math.sqrt(5*(-b) - 3 * 2));
        denominador = numerador / (-(float) Math.pow(-b,2));
        x = denominador;
        System.out.println("---------------------------------------------------------");
        System.out.println("El resultado de x es: "+ c);
    }
}
