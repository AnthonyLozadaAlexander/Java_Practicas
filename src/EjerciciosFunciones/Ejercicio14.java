package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio14 {
    public static float absoluto(float num) {
        float R = 0.0f;

        if (num < 0) {
            R = -num;
        } else {
            R = num;
        }

        return R;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = 0.0f;
        do {
            System.out.println("Digite un numero");
            System.out.print("-> ");
            if(!input.hasNextFloat()) {
                System.out.println("\nError: Debe Ingresar Un Numero\n");
                input.next(); // reset scanner
                continue;
            }
            else{
                num = input.nextFloat();
                System.out.println("\nNumero Ingresado: " + num);
                System.out.println("Valor Absoluto De "+num+" = " + absoluto(num));
                break;
            }
        } while (true);
    }
}
