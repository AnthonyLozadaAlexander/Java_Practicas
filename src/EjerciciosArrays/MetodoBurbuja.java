package EjerciciosArrays;

import java.util.Scanner;

public class MetodoBurbuja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[], nElementos;
        System.out.println("------------------------");
        System.out.println("        WELCOME");
        System.out.println("------------------------");
        do {
            System.out.println("Ingrese el tamaño del array");
            System.out.print("-> ");

            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Ingresar Un Numero\n");
                input.next();
                continue;
            }

            nElementos = input.nextInt();
            if(nElementos < 0){
                System.out.println("\nError: Debe Ingresar Numeros Positivos\n");
                continue;
            }
            else{
                System.out.println("\nDato Ingresado Correctamente\n");
                break;
            }
        }while(true);
    }
}
