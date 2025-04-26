package Ejercicios;

import java.util.Scanner;

public class nEdades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nEdades=0, edades[], edadMayor=0, edadMenor=0, indiceMayor = 0, indiceMenor = 0, countMayores = 0, countMenores = 0;
        do{
            System.out.println("--------------------------------------");
            System.out.println("              BIENVENIDO");
            System.out.println("--------------------------------------");
            System.out.println("Ingrese cuantas edades quiere ingresar");
            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Ingresar Datos Enteros\n");
                input.next();
                continue;
            }
            else{

                nEdades = input.nextInt();
                if(nEdades <= 0){
                    System.out.println("\nError: No Puede Ser Cero Ni Negativo\n");
                }
                else{
                    System.out.println("nEdades -> " + nEdades);
                }
            }
        }while(nEdades <= 0);
        System.out.println("--------------------------------------");
        edades = new int[nEdades];

        for(int i = 0; i < edades.length; i++){
            System.out.println("Edad["+i+"]");
            System.out.print("Digite: ");
            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Ingresar Datos Enteros\n");
                input.nextInt();
                i--;
            }
            else{
                edades[i] = input.nextInt();
                if(edades[i] <= 0){
                    System.out.println("\nError: Debe ingresar una edad positiva");
                    i--;
                }
                else{
                    System.out.println("Edad["+i+"] = " + edades[i]);
                    System.out.println("------------------------------------------");
                }
            }
        }
        edadMayor = edades[0];
        edadMenor = edades[0];
        for(int i = 0; i < edades.length; i++){
            if(edades[i] > edadMayor){
                edadMayor = edades[i];
                indiceMayor = i;
            }

            if(edades[i] >= 18){
                countMayores = countMayores + 1;
            }
        }

        for(int i = 0; i < edades.length; i++){
            if(edades[i] < edadMenor){
                edadMenor = edades[i];
                indiceMenor = i;
            }

            if(edades[i] < 18){
                countMenores = countMenores + 1;
            }
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("                 TOTAL");
        System.out.println("-----------------------------------------------------");
        System.out.println("Total Edades Ingresadas: " + nEdades);
        System.out.println("Cantidad Mayores De Edad: " + countMayores);
        System.out.println("Cantidad Menores De Edad: " + countMenores);
        System.out.println("La Edad Mayor De Todas Es: " + "edades["+indiceMayor+"] = " + edadMayor);
        System.out.println("La Edad Menor De Todas Es: " + "edades["+indiceMenor+"] = " + edadMenor);
        System.out.println("Porcentaje De Mayores De Edad: " + (((float) ((countMayores / (float) nEdades) * 100.0f) + "%")));
        System.out.println("Porcentaje De Menores De Edad: " + (((float) ((countMenores / (float) nEdades) * 100.0f) + "%")));
        System.out.println("------------------------------------------------------");

    }
}
