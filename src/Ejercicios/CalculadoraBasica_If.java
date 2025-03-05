package Ejercicios;
import java.util.Scanner;

public class CalculadoraBasica_If {
    public static void main(String[] args)
    {
        int num1, num2, resultado;
        char operador;
        Boolean On = false;
        Scanner input = new Scanner (System.in);

        do{
        System.out.println("--------------------------------------");
        System.out.println("      ***Calculadora Básica***");
        System.out.println("--------------------------------------");
        System.out.println("Ingrese el operador (+, -, *, /): ");
        operador = input.next().charAt(0); // Lee el primer caracter ingresado

        if(operador == '+')
        {
            input = new Scanner(System.in); // Limpiar el buffer
            System.out.println("Ingrese el primer número: ");
            num1 = input.nextInt();
            System.out.println("Ingrese el segundo número: ");
            num2 = input.nextInt();

            resultado = (num1 + num2);
            System.out.println("El resultado de la suma es: " + resultado);
            On = true;
        }
        else{
            if(operador == '-'){
                input = new Scanner(System.in); // Limpiar el buffer
                System.out.println("Ingrese el primer numero: ");
                num1 = input.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                num2 = input.nextInt();

                resultado = (num1 - num2);
                System.out.println("El resultado de la resta es: " + resultado);
                On = true;
            }
            else{
                if(operador == '*'){
                    input = new Scanner(System.in); // Limpiar el buffer
                    System.out.println("Ingrese el primer numero: ");
                    num1 = input.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = input.nextInt();

                    resultado = (num1 * num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    On = true;
                }
                else{
                    if(operador == '/'){
                        input = new Scanner(System.in); // Limpiar el buffer
                        System.out.println("Ingrese el primer numero: ");
                        num1 = input.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        num2 = input.nextInt();
                        while (num1 < num2 || num2 == 0) {
                            System.out.println("el primer numero debe ser mayor que el segundo y el segundo numero debe ser diferente de 0");

                            System.out.println("Ingrese el primer numero: ");
                            num1 = input.nextInt();
                            System.out.println("Ingrese el segundo numero: ");
                            num2 = input.nextInt();

                        }
                        resultado = (num1 / num2);
                        System.out.println("El resultado de la división es: " + resultado);
                        On = true;
                    }
                    else{
                        System.out.println("\nError: Operador no válido\n");
                        On = false;
                    }

                }
            }
        }
    }while(On == false);
    }
}
