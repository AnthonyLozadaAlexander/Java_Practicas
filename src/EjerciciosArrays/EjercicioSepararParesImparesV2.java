package EjerciciosArrays;

import java.util.Scanner;

public class EjercicioSepararParesImparesV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("-------------------------");
        System.out.println("        BIENVENIDO");
        System.out.println("-------------------------");
        System.out.println("Ingrese los elementos al arreglo");
        for(int i = 0; i < array.length; i++){
            System.out.println("array["+i+"]");
            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("\nError: Dato Invalido, Ingrese Un Numero Entero\n");
                input.next();
                i = i-1;
            }
            else {
                array[i] = input.nextInt();
                if(array[i] == 0){
                    System.out.println("\nError: Debe Ingresar Numeros Distintos De 0\n");
                    i--;
                }else {
                    System.out.println("\nElemento Ingresado: " + "array[" + i + "] = " + array[i]);
                }
            }
        }

        System.out.println("\nDatos Ingresados: ");
        for(int i = 0; i < array.length; i++){
            System.out.println("array["+i+"] = " + array[i]);
        }
    }
}
