package EjerciciosArrays;

import java.util.Scanner;
public class OrdenSecuencial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arreglo = {4,1,5,2,3};
        int guardar = 0;
        int dato=0;
        boolean flag = false;

        System.out.println("|----------------------------|");
        System.out.println("|          BIENVENIDO        |");
        System.out.println("|----------------------------|");
        System.out.println("Elementos Del Arreglo");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Arreglo["+i+"] = " + arreglo[i]);
        }
        do {
            System.out.println("\nIngrese el numero a buscar");
            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Ingresar Un Numero\n");
                input.next();
            }
            else {
                dato = input.nextInt();
                if(dato < 0){
                    System.out.println("\nError: El Dato Ingresado No Puede Ser Negativo\n");
                }
                else{
                    System.out.println("\nDato Ingresado: " + dato);
                }
            }
        }while(dato < 0);

        // Busqueda Secuencial
        int i = 0;
        // Mientras se recorra todo el array y no se haya encontrado el numero
        while(i < 5 && flag == false){
            if(arreglo[i] == dato){
                flag = true;
                guardar = i;
            }
            i++;
        }

        if(flag == false){
            System.out.println("\nNo se encontro el numero en el Arreglo\n");
        }
        else{
            System.out.println("El Numero Encontrado es: " + arreglo[guardar]);
            System.out.println("Ubicacion: " + "arreglo["+(i-1+"]"));
        }
    }
}
