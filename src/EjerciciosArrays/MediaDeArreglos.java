package EjerciciosArrays;

import java.util.Scanner;

public class MediaDeArreglos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] nums = new int[5];
        int countP = 0, countN = 0, count0 = 0, sumP = 0, sumN = 0;
        System.out.println("\n--------------------");
        System.out.println("     BIENVENIDO");
        System.out.println("--------------------");
        System.out.println("Ingrese Los Datos Enteros Al Array");
        for(int i = 0; i < nums.length; i++) {
            System.out.println("nums["+i+"]");
            System.out.print("-> ");

            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Ingresar Un Numero Entero\n");
                input.next();
            }
        }
    }
}
