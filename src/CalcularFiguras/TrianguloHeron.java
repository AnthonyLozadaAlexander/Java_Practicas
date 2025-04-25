package CalcularFiguras;

import java.util.Scanner;

public class TrianguloHeron {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a=0.0f, b=0.0f, c=0.0f;
        System.out.println("--------------------------");
        System.out.println("Bienvenido Al Metodo Heron");
        System.out.println("--------------------------");
        do {
            System.out.println("Ingrese el valor de a");
            System.out.print("-> ");
            if (!input.hasNextFloat()) {
                System.out.println("\nError: Dato Invalido\n");
                input.next();
            }else {
                a = input.nextFloat();
                if (a <= 0) {
                    System.out.println("\nError: El Valor Debe Ser Positivo\n");
                }
                else {
                    System.out.println("\nValor Ingresado: " + a );
                    do {
                        System.out.println("-----------------------------------");
                        System.out.println("Ingrese el valor de B");
                        System.out.print("-> ");
                        if (!input.hasNextFloat()) {
                            System.out.println("-----------------------------------");
                            System.out.println("\nError: Dato Invalido\n");
                            input.next();
                        } else {
                            b = input.nextFloat();
                            if (b <= 0) {
                                System.out.println("\nError: El Valor Debe Ser Positivo\n");
                            }
                            else {
                                System.out.println("\nValor Ingresado: " + b);
                                do{
                                    System.out.println("-----------------------------------");
                                    System.out.println("Ingrese el valor de C");
                                    System.out.print("-> ");
                                    if (!input.hasNextFloat()) {
                                        System.out.println("-----------------------------------");
                                        System.out.println("\nError: Dato Invalido\n");
                                        input.next();
                                    }
                                    else {
                                        c = input.nextFloat();
                                        if (c <= 0) {
                                            System.out.println("-----------------------------------");
                                            System.out.println("\nError: El Valor Debe Ser Positivo\n");
                                        } else {
                                            System.out.println("\nValor Ingresado: " + c);
                                            System.out.println("-----------------------------------");
                                        }
                                    }
                                }while(c <= 0);
                            }
                        }
                    }while(b <= 0);
                }
            }
        }while(a <= 0);
        float S = MetodoHeron.semiArea(a, b, c);
        float Area = MetodoHeron.areaTriangulo(a,b,c);

        System.out.println("La SemiArea Del Triangulo es: " + S);
        System.out.println("El Area Del Triangulo es de: " + Area);
        System.out.println("-----------------------------------");
    }
}
