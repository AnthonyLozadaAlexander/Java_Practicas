import java.util.Scanner;

public class Ejercicio_IntegradorCondicional {
    public static void main(String[] args)
    {
        //Merceria mayorista --> vende al por mayor
        //Menos de 5 paquetes: No vende
        //entre 5 y 15 sale: 10 usd al envio
        //Mas de 15 paquetes: envio gratis

        int cantidadPaquetes;
        Scanner input = new Scanner(System.in);

        // Preguntar por teclado cuantos paquetes son:
        System.out.println("Ingrese la cantidad de paquetes: ");
        cantidadPaquetes = input.nextInt();

        //Evaluar posibles casos
        if(cantidadPaquetes < 5)
        {
            System.out.println("No se permiten ventas inferiores a 5 paquetes");
        }
        else
        {
            if(cantidadPaquetes >= 5 && cantidadPaquetes <= 15)
            {
                System.out.println("El costo de envio es de 10 USD");
            }
            else
            {
                System.out.println("Usted no tiene costo de envio, Muchas gracias por su compra");
            }
        }
    }
}
