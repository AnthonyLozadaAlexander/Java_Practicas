package EjerciciosArrays;

import java.util.Scanner;

public class ArregloNDesplazamientos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Elements = new int[10];
        int n = 0;
        System.out.println("-----------------------------");
        System.out.println("          BIENVENIDO");
        System.out.println("-----------------------------");
        System.out.println("Ingrese los 10 elementos al arreglo");
        for(int i = 0; i < Elements.length; i++){
            System.out.println("Element["+i+"]");
            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("ERROR: Debe Ingresar Un Numero Entero");
                input.next();
                i--;
                continue;
            }
            else{
            Elements[i] = input.nextInt();
            System.out.println("Elemento["+i+"] Ingresado: " + Elements[i]);
            }
        }
    }
}
