package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio12 {
    public static void factorial(int limit){
        int factorial = 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = 0;

            System.out.println("---------------------------");
            System.out.println("         BIENVENIDO");
            System.out.println("---------------------------");
        do{
            System.out.println("Ingrese el limite de la secuencia");
            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Ingresar Un Numero Positivo");
                input.nextLine();
                continue;
            }
            else {
                limit = input.nextInt();
                if(limit < 0){
                    System.out.println("\nError: Debe Ingresar Un Numero Positivo");
                }
                else{
                    System.out.println("\nDato Ingresado: " + limit + "\n");
                }
            }
        }while(limit < 0);
    }
}
