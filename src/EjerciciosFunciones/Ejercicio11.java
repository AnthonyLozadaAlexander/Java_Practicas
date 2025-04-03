package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio11 {
    public static float areaR(float base, float altura){
        float area = 0.0f;
        area = base * altura;
        return area;
    }

    public static void perimetroR(float base, float altura){
        float perimetro = ((base * 2) + (altura * 2));
        System.out.println("El Perimetro Del Rectangulo es: " + perimetro);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base = 0.0f, altura = 0.0f;
        System.out.println("----------------------------------------");
        System.out.println("              BIENVENIDO");
        System.out.println("-----------------------------------------");
        do {
            System.out.println("Ingrese la base del rectangulo");
            System.out.print("-> ");
            if (!input.hasNextFloat()) {
                System.out.println("\nError: Ingrese un dato numerico\n");
                input.next();

            } else {
                base = input.nextFloat();
                if(base < 0){
                    System.out.println("\nError: Debe Ingresar Un Valor Positivo\n");
                }else{
                    System.out.println("\nBase Ingresada: " + base + "\n");
                    break;
                }
            }
        }while(true);

        do{
            System.out.println("Ingrese la altura del rectangulo");
            System.out.print("-> ");
            if(!input.hasNextFloat()) {
                System.out.println("\nError: Ingrese un dato numerico\n");
                input.next();
            }
            else{
                altura = input.nextFloat();

                if(altura < 0){
                    System.out.println("\nError: Debe Ingresar Un Valor Positivo\n");
                    input.next();
                }
                else{
                    System.out.println("\nAltura Ingresada: " + altura + "\n");
                    break;
                }
            }
        }while(true);

        System.out.println("El Area Del Rectangulo es: " + areaR(base, altura));
        perimetroR(base, altura);

    }
}
