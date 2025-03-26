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

        resetLoop:
        for(int i = 0; i < nums.length; i++) {
            System.out.println("nums["+i+"]");
            System.out.print("-> ");

            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Ingresar Un Numero Entero\n");
                input.next();
                if(i > 0 || i < nums.length){
                    i = i - 1;
                }
                else{
                    continue resetLoop;
                }
            }
            nums[i] = input.nextInt();

            if(nums[i] > 0){
                System.out.println("Dato Positivo Ingresado -> " + nums[i]);
                sumP = sumP + nums[i];
                countP++; // el contador se ira sumando cada que se ingrese numeros positivos
            }
            else if(nums[i] < 0){
                System.out.println("Dato Negativo Ingresado -> " + nums[i]);
                sumN = sumN + nums[i];
                countN++; // contador para los negativos
            }else{
                count0++; // contador para los ceros
            }
        }
    }
}
