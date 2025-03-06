package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio6 {
  public static float incremento(float salario, float porcentaje){
    return salario + (salario * porcentaje / 100);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float salario=0, porcentaje =0;

    do{
      System.out.println("----------------------------------");
      System.out.println("            BIEVENIDO");
      System.out.println("----------------------------------");
      System.out.println("Ingrese el salario");
      System.out.print("-> ");
      if(!input.hasNextFloat()){
        System.out.println("Error: Debe Ingresar Un Numero Decimal");
        input.next(); //? descarta una entrada no valida
        continue;
      }
      salario = input.nextFloat();

      if(salario <= 0){
        System.out.println("Error: Debe Ingresar Un Numero Mayor A 0");
        continue;
      }
      else{
        System.out.println("Ingrese el porcentaje de incremento");
        System.out.print("-> ");
        if(!input.hasNextFloat()){
          System.out.println("Error: Debe Ingresar Un Numero Decimal");
          input.next(); //? descarta una entrada no valida
          continue;
        }

        porcentaje = input.nextFloat();

        System.out.println("----------------------------------");
        if(porcentaje <= 0){
          System.out.println("Error: Debe Ingresar Un Numero Mayor A 0");
          continue;
        }
        else{
          System.out.println("\n----------------------------------");
          System.out.println("Salario: " + salario);
          System.out.println("Salario Mas "+ porcentaje + "% -> " + incremento(salario, porcentaje));
          System.out.println("----------------------------------\n");
          break;
        }
      }
      
    }while(salario <= 0 || porcentaje <= 0);
    
  }
}
