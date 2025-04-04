package EjerciciosArrays;

import java.util.Scanner;

public class SepararParesEImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countPares = 0, countImpares = 0;
        int[] nums = new int[10];

        System.out.println("Ingrese Elementos Enteros al Array["+nums.length+"]");
        for(int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "]");
            System.out.print("-> ");
            if (!input.hasNextInt()) {
                System.out.println("\nError: Ingrese Un Numero Entero\n");
                i = i - 1;
            } else {
                nums[i] = input.nextInt();
                System.out.println("\nNumero Ingresado: " + nums[i] + "\n");

                if (nums[i] % 2 == 0) {
                    countPares++;
                }
                if (nums[i] % 2 != 0) {
                    countImpares++;
                }
            }
        }

            int P = 0, Imp = 0;
            int[] pares = new int[countPares];
            int[] impares = new int[countImpares];

            for(int j = 0; j < nums.length; j++){

                    if(nums[j] % 2 == 0){
                       pares[P] = nums[j];
                       P++;
                    }
                    if(nums[j] % 2 != 0){
                        impares[Imp] = nums[j];
                        Imp++;
                    }
            }

            int IndexP = 0;
            int IndexImp = 0;

            System.out.println("Array Pares["+countPares+"]");
            for(int datos: pares){
                System.out.println("Pares["+ IndexP+"] = " + datos );
                IndexP++;
            }

            System.out.println("\nArray Impares["+countImpares+"]");
            for(int datos: impares){
                System.out.println("Impares["+ IndexImp+"] = " + datos);
                IndexImp++;
            }

    }
}
