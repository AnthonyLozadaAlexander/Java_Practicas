import java.util.Scanner;

public class Ejercicio_8 { 
    public static void main(String[] args) {
       int opcion;
       double bono, descuento, sueldo;
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
        sueldo = 15.890;
        bono = sueldo * 0.10;
        System.out.println("Su sueldo de Repositor es de: " + sueldo);
        System.out.println("Su sueldo de Repositor mas el bono del 10% es de: " + (sueldo + bono));
       }
       else if(opcion == 2){
        sueldo = 25630.89;
        System.out.println("Su sueldo de Cajero es de: " + sueldo);
       }
       else if(opcion == 3){
        sueldo = 35560.20;
        descuento = sueldo * 0.11;
        System.out.println("Su sueldo de Supervisor es de: " + (sueldo - descuento));
       }
       else{
        System.out.println("Opcion no valida");
       }
       
    }
}
