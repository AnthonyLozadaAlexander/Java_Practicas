package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio13{
    public static void tiempo(float segundos){
        float horas = 0, minutos = 0;

        horas = segundos / 3600;
        segundos = segundos % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println("Horas: " + horas + " Minutos: " + segundos);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float segundos;
        do {
            System.out.println("--------------------------");
            System.out.println("         BIENVENIDO");
            System.out.println("--------------------------");
            System.out.println("Ingrese los segundos");
            System.out.print("-> ");
            if(!input.hasNextFloat()) {
                System.out.println("\nError: Ingrese Un Valor Numerico\n");
                input.next();
            }
            else {
                segundos = input.nextFloat();
                if(segundos < 0){
                    System.out.println("\nError: Los Segundos No Pueden Ser Menor a 0\n");
                }else {
                    System.out.println("\nValor Ingresado: " + segundos + "\n");
                    tiempo(segundos);
                    break;
                }
            }
        }while(true);
        input.close();
    }
}
