package EjerciciosArrays;

import java.util.Scanner;

public class ArregloNDesplazamientos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Vector = new int[10];
        int n = 0;
        System.out.println("-----------------------------");
        System.out.println("          BIENVENIDO");
        System.out.println("-----------------------------");
        System.out.println("Ingrese los 10 elementos al arreglo");
        for(int i = 0; i < Vector.length; i++){
            System.out.println("Element["+i+"]");
            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("\nERROR: Debe Ingresar Un Numero Entero\n");
                input.next();
                i--;
                continue;
            }
            else{
            Vector[i] = input.nextInt();
            System.out.println("\nIndice["+i+"] Ingresado: " + Vector[i] + "\n");
            }
        }

        System.out.println("Datos Del Arreglo");
        for(int i = 0; i < Vector.length; i++){

        }
    }
}
