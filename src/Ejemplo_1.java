import java.util.Scanner;

public class Ejemplo_1 {
    public static void main(String[] args) {
        //Ejercicio
        System.out.println("hola amikos, como estan los quiero mucho\n");
        System.out.println("Verificar si un numero es par o impar");
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1 = input.nextInt();

        if(num1 % 2 == 0)
        {
            System.out.println("El numero " + num1 + " es par");
        }
        else{
            if(num1 % 2 != 0)
            {
                System.out.println("El numero " + num1 + " es impar");
            }
            else{
                System.out.println("El numero " + num1 + " es 0");
            }
        }

    }
}
