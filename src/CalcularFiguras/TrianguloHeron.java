package CalcularFiguras;

import java.util.Scanner;

public class TrianguloHeron {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a=0, b=0, c=0, semiArea=0, area=0;
        System.out.println("--------------------------");
        System.out.println("Bienvenido Al Metodo Heron");
        System.out.println("--------------------------");
        do {
            valorA:
            System.out.println("Ingrese el valor de a");
            System.out.print("-> ");
            if (!input.hasNext()) {
                System.out.println("\nError: Dato Invalido\n");
                input.next();
                continue;
            }else {
                a = input.nextFloat();
                if (a <= 0) {
                    System.out.println("\nError: El Valor Debe Ser Positivo\n");
                } else {
                    System.out.println("\nValor Ingresado: " + a + "\n");
                    System.out.println("-----------------------------------");
                    System.out.println("Ingrese el valor de B");
                    System.out.print("-> ");
                    if (!input.hasNext()) {
                        System.out.println("\nError: Dato Invalido\n");
                        input.next();
                        continue;
                    } else {
                        b = input.nextFloat();
                        if (b <= 0) {
                            System.out.println("\nError: El Valor Debe Ser Positivo\n");
                        } else {
                            System.out.println("\nValor Ingresado: " + b);
                        }
                    }
                }
            }
        }while(a <= 0 || b <= 0 || c <= 0);
    }
}
