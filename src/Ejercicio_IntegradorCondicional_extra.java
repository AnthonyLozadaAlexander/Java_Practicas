import java.util.Scanner;

public class Ejercicio_IntegradorCondicional_extra {
    public static void main(String[] args){

        //Merceria mayorista --> vende al por mayor
        //Menos de 5 paquetes: No vende
        //entre 5 y 15 sale: 10 usd al envio
        //Mas de 15 paquetes: envio gratis

        int cantidadPaquetes;
        double montoTotal, diferencia, descuento, totalDescuento;
        Scanner input = new Scanner(System.in);

        // Preguntar por teclado cuantos paquetes son:
        System.out.println("Ingrese la cantidad de paquetes.");
        cantidadPaquetes = input.nextInt();

        //Evaluar posibles casos
        if(cantidadPaquetes < 5) // casos en donde no se venden paquetes
        {
            if(cantidadPaquetes < 0){
                System.out.println("No se permiten ventas de paquetes(cantidades) negativas");
            }
            System.out.println("No se permiten ventas inferiores a 5 paquetes");
        }
        else // casos en donde si se venden paquetes
        {
            System.out.println("Ingrese el monto total de la compra.");
            input = new Scanner(System.in); // Limpiar buffer/reiniciar scanner
            montoTotal = input.nextDouble();

            if(cantidadPaquetes >= 5 && cantidadPaquetes <= 15)
            {
                System.out.println("El costo de envio es de 10 USD");
                montoTotal = montoTotal + 10;
            }
            else
            {
                System.out.println("Usted no tiene costo de envio, Muchas gracias por su compra");
            }

            if(montoTotal < 100){

                diferencia = 100 - montoTotal;
                System.out.println("El monto es menor a 100, por lo tanto no posee descuento");
                System.out.println("Usted necesita comprar: " + diferencia + " USD para obtener un descuento");
            }
            else
            {
                if(montoTotal > 100 && montoTotal <= 300){
                    descuento = montoTotal * 0.05;
                    totalDescuento = montoTotal - descuento;
                    System.out.println("Usted tiene un descuento del 5% en su compra que equivale a: " + descuento);
                    System.out.println("Su monto total es de: " + totalDescuento);
                }
                else {
                        descuento = montoTotal * 0.10;
                        totalDescuento = montoTotal - descuento;
                        System.out.println("Usted tiene un descuento del 10% en su compra que equivale a: " + descuento);
                        System.out.println("Su monto total es de: " + totalDescuento);
                }

            }
        }
    }
}
