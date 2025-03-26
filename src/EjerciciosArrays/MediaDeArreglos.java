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
            boolean Error = true;
            do {
                input = new Scanner(System.in);
                System.out.println("nums[" + i + "]");
                System.out.print("-> ");
                if (!input.hasNextInt()) {
                    System.out.println("\nError: Debe Ingresar Un Numero Entero\n");
                    input.next();
                    if (i == 0) {
                        i++;
                        i--;
                        Error = true;
                    }
                    else if(i > 0 && i < nums.length){
                        Error = true;
                    }
                }
                else{
                    Error = false;
                }
            }while(Error == true);

            nums[i] = input.nextInt();

            if(nums[i] > 0){
                System.out.println("\nDato["+i+"] Positivo Ingresado -> " + nums[i] + "\n");
                sumP = sumP + nums[i];
                if(sumP > 0) {
                    countP++; // el contador se ira sumando cada que se ingrese numeros positivos
                }
            }
            else if(nums[i] < 0){
                System.out.println("\nDato["+i+"] Negativo Ingresado -> " + nums[i] + "\n");
                sumN = sumN + nums[i];
                    countN++; // contador para los negativos
            }else{
                count0++; // contador para los ceros
            }
        }

        System.out.println("\n--------------------------------------------");
        System.out.println("                RESULTADOS");
        System.out.println("--------------------------------------------");
        System.out.println("                "+sumP + " / " + countP);
        System.out.println("                "+sumN + " / " + countN);
        System.out.println("--------------------------------------------");
        if(countP == 0){
            System.out.println("\nNo se puede sacar el promedio de los numeros positivos\n");
        }
        else {
            System.out.println("La Suma De los Numeros Positivos es: " + sumP);
            System.out.println("El Promedio de los Numeros Positivos es: " + sumP / countP);
        }
        if(countN == 0) {
            System.out.println("\nNo se puede sacar el promedio de los numeros negativos\n");
        }
        else{
            System.out.println("La suma De los Numeros Negativos es: " + sumN);
            System.out.println("El Promedio de los Numeros Negativos es: " + sumN / countN);
        }
        System.out.println("Cantidad de ceros ingresados: " + count0);

    }
}
