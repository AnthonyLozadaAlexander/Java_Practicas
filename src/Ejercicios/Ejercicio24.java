package Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float cantLitros = 0.0f, precioLitros = 0.0f, montoTotal=0.0f, facturacionTotal=0.0f, countLitros = 0.0f, countFacturas=0.0f;

        for(int i = 1; i <= 5; i++)
        {
            input = new Scanner(System.in);
            facturacionTotal = 0.0f;
            System.out.println("\nIteracion("+i+")");
            System.out.println("Ingrese La Cantidad De Litros");
            System.out.print("-> ");
            cantLitros = input.nextFloat();

            if(cantLitros <= 0){
                System.out.println("Error: Ingrese un valor mayor que 0");
                i = i - 1;
            }
            else{
                System.out.println("\nCantidad de Litros Ingresada: "+ cantLitros+"\n");

                for(int j = 1; j <= 5; j++) {
                    System.out.println("Ingrese El Precio Por Litro");
                    System.out.print("-> ");
                    precioLitros = input.nextFloat();

                    if (precioLitros <= 0) {
                        System.out.println("Error: Ingrese un valor mayor que 0");
                        j = j - 1;
                    } else {
                        facturacionTotal = (cantLitros * precioLitros);
                        montoTotal = montoTotal + facturacionTotal;
                        countLitros = countLitros + cantLitros;

                        if(facturacionTotal > 600){
                            countFacturas = countFacturas + 1;
                        }

                        break;
                    }
                }
            }
        }

        System.out.println("\n------------------------------");
        System.out.println("          RESUMEN");
        System.out.println("------------------------------");
        System.out.println("Facturas Mayores a $600: " + countFacturas);
        System.out.println("Litros Ingresados: " + countLitros);
        System.out.println("Monto Total A Pagar: " + montoTotal);
        System.out.println("------------------------------");
    }
}
