package Ejercicios;
import java.util.Scanner;

public class Operaciones_Equivalentes {
    public static void main(String[]args){
        int a, b, c, resultado, resultado1;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        a = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        b = input.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        c = input.nextInt();

        resultado = (a + b) * c;
        resultado1 = (a * c) + (b * c);

        System.out.println("El resultado de "+ a + " + " + b + " * " + c + " es: " + resultado);

        System.out.println("El resultado de "+ a + " * " + b + " + " + b + " * " + c + " es: " + resultado1);
    }
}
