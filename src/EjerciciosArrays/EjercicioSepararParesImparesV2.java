package EjerciciosArrays;

import java.util.Scanner;

public class EjercicioSepararParesImparesV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countPares = 0, countImpares = 0;
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
                    if(array[i] % 2 == 0){
                        countPares++;
                    }
                    else{
                        countImpares++;
                    }
                }
            }
        }

        System.out.println("\nArray Base");
        System.out.println("Datos Ingresados: ");
        for(int i = 0; i < array.length; i++){
            System.out.println("array["+i+"] = " + array[i]);
        }

        int [] pares = new int[countPares];
        int [] impares = new int[countImpares];

        int indexPar = 0;
        int indexImpar = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                pares[indexPar] = array[i];
                indexPar++;
            }
            else{
                impares[indexImpar] = array[i];
                indexImpar++;
            }
        }

        System.out.println("\nElementos Pares");
        for(int i = 0; i < pares.length; i++){
            System.out.println("Pares["+i+"] = " + pares[i]);
        }

        System.out.println("\nElementos Impares");
        for(int i = 0; i < impares.length; i++){
            System.out.println("Impares["+i+"] = " + impares[i]);
        }

    }
}
