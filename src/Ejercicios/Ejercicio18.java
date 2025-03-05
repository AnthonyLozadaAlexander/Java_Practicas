package Ejercicios;
import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i = 0;
    double saldo = 0, cantidad, retiro;
    int opcion;
    do{
      System.out.println("---------------------------");
      System.out.println("--------BIENVENIDO--------");
      System.out.println("1. = Consulta De Saldo");
      System.out.println("2. = Ingreso De Saldo");
      System.out.println("3. = Retirar Saldo");
      System.out.println("4. = Salir");
      System.out.println("--------------------------");
      System.out.print("Ingrese una opcion -> ");
      i = input.nextInt();
      
 
      switch(i){
        case 1:
          
          if(saldo == 0){
            System.out.println("---------------------------------");
            System.out.println("Usted no posee saldo en su cuenta");
            System.out.println("---------------------------------");
          }
            else if(saldo > 0){
            System.out.println("Tu saldo actual es de: " + saldo);
           }
          
          input = new Scanner(System.in); // reset scanner
            
            System.out.println("Desea Continuar o Salir Del Sistema?");
            System.out.println("Digite: 1. Continuar");
            System.out.println("Digite: 2. Salir");
            System.out.print("-> ");
            opcion = input.nextInt();
            if(opcion == 1)
            {
              i = 0;
            }
            else if(opcion == 2) 
            {
              System.out.println("Gracias Por Usar Nuestro Sistema");
              i = 4;
            }
            
          break;
          
        case 2:
          
          input = new Scanner(System.in); // reset scanner
          System.out.println("-------------------");
          System.out.println("Ingresa el saldo: ");
          cantidad = input.nextDouble();
          System.out.println("-------------------");
          
          if(cantidad < 0){
          System.out.println("Error: Debe ingresar Saldo Mayor a 0");
          
          }
          else if(cantidad > 0){
            System.out.println("Saldo Ingresado Correctamente");
          }
          
          if(saldo == 0){
            
            saldo = cantidad;
            
          }
          else if(saldo > 0){
            saldo = saldo + cantidad;
          }
          
          input = new Scanner(System.in); // reset scanner
            
            System.out.println("Desea Continuar o Salir Del Sistema?");
            System.out.println("Digite: 1. Continuar");
            System.out.println("Digite: 2. Salir");
            System.out.print("-> ");
            opcion = input.nextInt();
            if(opcion == 1)
            {
              i = 0;
            }
            else if(opcion == 2) 
            {
              System.out.println("Gracias Por Usar Nuestro Sistema");
              i = 4;
            }
          
        case 3:
          
          input = new Scanner(System.in); // reset scanner
          if(saldo == 0){
            
            System.out.println("Error: Usted no tiene Saldo Actualmente");
          }
          else if(saldo > 0)
          {
            System.out.println("Ingrese La Cantidad De Saldo A Retirar");
            System.out.print("-> ");
            retiro = input.nextDouble();
            
            System.out.println("----------------------------------");
            System.out.println("Su Saldo Retirado es de: " + retiro);
            double total = saldo - retiro;
            System.out.println("-----------------------------------");
            System.out.println("Saldo actual: " + total);
            
          }
          
          input = new Scanner(System.in); // reset scanner
            
            System.out.println("Desea Continuar o Salir Del Sistema?");
            System.out.println("Digite: 1. Continuar");
            System.out.println("Digite: 2. Salir");
            System.out.print("-> ");
            opcion = input.nextInt();
            if(opcion == 1)
            {
              i = 0;
            }
            else if(opcion == 2) 
            {
              System.out.println("--------------------------------");
              System.out.println("Gracias Por Usar Nuestro Sistema");
              System.out.println("--------------------------------");
              
              i = 4;
            }
          break;
        }
      
    }while(i != 4);
    
    
  }
  
}
