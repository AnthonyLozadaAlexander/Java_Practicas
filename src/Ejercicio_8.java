import java.util.Scanner;

public class Ejercicio_8 { 
    public static void main(String[] args) {
       String name = "";
       int opcion;
       double bono, descuento, sueldo = 0.0, total = 0.0;
       Scanner input = new Scanner(System.in);

       System.out.println("---Bienvenido al sistema de bonos y descuentos---");
       System.out.println("-------------------------------------------------");
       System.out.println("1. Repositor");
       System.out.println("2. Cajero");
       System.out.println("3. Supervidor");
       System.out.println("------------------------------------------------");
       System.out.println("Por favor, seleccione su puesto de trabajo: ");
       opcion = input.nextInt();

       if(opcion == 1){
        name = "Repositor";
        sueldo = 15.890;
        bono = sueldo + (sueldo * 0.10);
        total = bono;
       }
       else if(opcion == 2){
        name = "Cajero";
        sueldo = 25630.89;
        total = sueldo;      
       }
       else if(opcion == 3){
        name = "Supervisor";
        sueldo = 35560.20;
        descuento = sueldo - (sueldo * 0.11);
        total = descuento;
       }
       else{
        System.out.println("Opcion no valida");
       }
       
       if(opcion == 1 || opcion == 2 || opcion == 3){
        System.out.println("Su sueldo de " + name + " es de: " + total);
       }
    }
}
