package EjerciciosArrays;

import java.util.Scanner;

public class MetodoBurbuja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[], nElementos, aux;
        System.out.println("---------------------------");
        System.out.println("          WELCOME");
        System.out.println("---------------------------");
        do {
            System.out.println("Ingrese el tamaño del array");
            System.out.print("-> ");

            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Ingresar Un Numero\n");
                input.next();
                continue;
            }

            nElementos = input.nextInt();
            if(nElementos < 0){
                System.out.println("\nError: Debe Ingresar Numeros Positivos\n");
                continue;
            }
            else{
                System.out.println("\nDato Ingresado Correctamente\n");
                break;
            }
        }while(true);
        array = new int[nElementos]; // agregamos el tamaño del array
        System.out.println("Ingrese Los Elementos Enteros Al Array");
        for(int i = 0; i < nElementos; i++){
            System.out.println("array["+i+"]");
            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Ingresar Un Numero\n");
                input.next();
                i--; // repite la iteracion desde el mismo indice
            }
            else{
                array[i] = input.nextInt(); // se guarda el valor ingresado en dado caso que sea un numero entero
                System.out.println("\nDato Ingresado -> Array["+i+"] = " + array[i] + "\n");
            }
        }

        System.out.println("\nDatos del Array Ingresado");
        int countIndex = 0;
        for(int dato: array){ // foreach para mostrar los datos ingresados
            System.out.println("array["+countIndex+"] = " + dato);
            countIndex++;
        }

        for(int i = 0; i < (nElementos-1); i++){
            for(int j = 0; j <(nElementos - 1); j++){
                if(array[j] > array[j+1]) // si num_Actual > num_Siguiente, arr[0] > arr[1]
                {
                    // Se procedera al intercambio utilizando un auxiliar que guardara temporalmente el num_Actual
                    aux = array[j]; // aux guardara temporalmente el num_Actual, si se cumple la condicion de actual > siguiente
                    array[j] = array[j+1]; // el num_Actual sera ahora en la posicion del num_Siguiente
                    array[j+1] = aux; // el num_Siguiente sera ahora el num_Actual que fue guardado en aux
                }
            }
        }

        System.out.println("\nDatos Del Array Ordenados");
        // verticalmente
        for(int i = 0; i < nElementos; i++){
            System.out.println("Array["+i+"] = " + array[i]);
        }
        // horizontalmente
        System.out.println("---------------------------");
        for(int i = 0; i < nElementos; i++){
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n---------------------------------------");
        System.out.println("Datos Del Array Ordenados Crecientemente");
        for(int i = 0; i < nElementos; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println("\nDatos Del Array Ordenados Decrecientemente");
        for(int j = (nElementos-1); j >= 0; j--){ // nElementos - 1 == ultima posicion
            System.out.print(array[j] + ", ");
        }
        System.out.println("\n-----------------------------------------");
    }
}
