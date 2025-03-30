package EjerciciosArrays;

import java.util.Scanner;

public class DesplazarPosicionArreglo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[] Elements = new int[10];
       int last = 0;

       System.out.println("Ingrese los 10 elementos al arreglo");
       for(int i = 0; i < Elements.length; i++)
       {
        System.out.println("Element["+i+"]");
       System.out.print("-> ");
       Elements[i] = input.nextInt();
       }

       System.out.println("Los elementos del arreglo son: ");
       for(int k = 0; k < Elements.length; k++){
        System.out.println("Element["+k+"] = " + Elements[k]);
       }
       
       last = Elements[9]; // guardamos el ultimo elemento del array en una variable
       
       for(int j = 8; j >= 0; j--){ // bajando elementos en el array
        Elements[j+1] = Elements[j]; // Elements[9] = Elements[8], Elements[8] = Elements[7], etc.
       }

       Elements[0] = last; // guardamos el ultimo elemento en el primer elemento del array

       System.out.println("Los elementos del arreglo son: ");
       int count = 0;
       for(int datos: Elements){
        System.out.println("Element["+count+"] = " + datos);
        count++;
       }

    }
}
