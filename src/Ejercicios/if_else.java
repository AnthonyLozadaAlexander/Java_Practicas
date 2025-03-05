package Ejercicios;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in); // scanner se importa y se lo declarara como variable

        System.out.println("Ingrese la edad: ");
        edad = input.nextInt();

        // Condicional If-Else Anidado

        if (edad > 18) {
            System.out.println("Su edad es: " + edad + " años, Eres mayor de edad");

            if(edad > 40)
            {
                System.out.println("Eres Gen X");
            }
            else
            {
                System.out.println("Eres Millenial o Centennial");
            }
        }
        else
        { // llave apertura de else
            if(edad == 18)
            {
                System.out.println("Su edad es: " + edad + " años, acabas de cumplir la mayoria de edad");
            }
            else
            {
                System.out.println("Su edad es: " + edad + " años, Eres menor de edad");
            }
        } // llave cierre de else

        System.out.println("Fin del programa");
    }

}
