package EjerciciosArrays;
import java.util.Scanner;

public class ArregloCrecienteDecreciente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums[], nElementos;
        System.out.println("\n         BIENVENIDO");
        System.out.println("Ingrese El Tamaño Del Arreglo");
        do{
            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Ingresar Un Numero Entero\n");
                input.next();
                continue;
            }
            else{
                nElementos = input.nextInt();
                if(nElementos <= 0){
                    System.out.println("\nERROR: Debe Ingresar Un Numero Mayor A 0\n");
                    continue;
                }
                else{
                    System.out.println("\nTamaño Ingresado -> " + "nums["+ nElementos+"]\n");
                    break;
                }
            }
        }while(true);
        nums = new int[nElementos];

        System.out.println("Ingrese Los Elementos Del Arreglo");
        for(int i = 0; i < nums.length; i++){
            System.out.print("nums["+i+"]" + " -> ");
            nums[i] = input.nextInt();
        }

        System.out.println("\nDatos Del Arreglo["+nElementos+"]");
        int countIndex = 0;
        for(int datos: nums){
            System.out.println("nums["+countIndex+"] -> " + datos);
            countIndex++;
        }
        
    }
}
