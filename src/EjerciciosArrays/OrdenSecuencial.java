package EjerciciosArrays;

import java.util.Scanner;
public class OrdenSecuencial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arreglo = {4,1,5,2,3};
        int dato;
        boolean flag = false;

        System.out.println("|----------------------------|");
        System.out.println("|          BIENVENIDO        |");
        System.out.println("|----------------------------|");
        System.out.println("Ingrese el numero a buscar");
        System.out.print("-> ");
        dato = input.nextInt();

        // Busqueda Secuencial
        int i = 0;
        // Mientras se recorra todo el array y no se haya encontrado el numero
        while(i < 5 && flag == false){
            if(arreglo[i] == dato){
                flag = true;
            }
            i++;
        }

    }
}
