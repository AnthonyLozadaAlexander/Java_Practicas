package Ejercicios;
import java.util.Scanner;

public class Operador_Ternario {
    public static void main(String[] args){
 //        double promedio;
//        Scanner input = new Scanner (System.in);
//
//        System.out.println("Ingresa tu promedio: ");
//        promedio = input.nextDouble();
//
//        String Resultado = (promedio >= 6.5) ? "Aprobado" : "Reprobado";
//        System.out.println("Resultado: " + Resultado);
        //Crear un programa que dependiendo del promedio de un alumno, muestre un mensaje de aprobado o reprobado
        String name, Resultado;
        double promedio, calf1, calf2, calf3;
        calf1 = 0;
        calf2 = 0;
        calf3 = 0;
        Scanner input = new Scanner(System.in);
        // num = Integer.parseInt(System.console().readLine());

        System.out.println("***PROMEDIO***");
        System.out.println("Ingrese su nombre: "); name = input.nextLine();

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Ingrese la calificacion: " + i);
            if(i == 0)
            {
               calf1 = input.nextDouble();
            }
            else if(i == 1)
            {
                calf2 = input.nextDouble();
            }
            else if(i == 2)
            {
              calf3 = input.nextDouble();
            }
            else
            {
                System.out.println("Error");
            }
        }
        promedio = (calf1 + calf2 + calf3) / 3;
        Resultado = (promedio >= 6.5) ? name + " Aprobado" : name + " Desaprobado";
        System.out.println("Resultado: " + Resultado);
    }
}
