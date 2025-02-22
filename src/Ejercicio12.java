import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float Guillermo, Luis, Juan, Total;

    System.out.print("Ingrese la cantidad de dinero que tiene Guillermo ->  $");
    Guillermo = input.nextFloat();

    Luis = Guillermo/2; // Luis tiene la mitad de lo que tiene Guillermo
    Juan = (Guillermo + Luis)/2; // Juan tiene la mitad de lo que tiene Luis más lo que tiene Guillermo juntos

    Total = Guillermo + Luis + Juan;

    System.out.println("---------------------------------------");
    System.out.println("Total de dinero emtre los 3: $" + Total);
    System.out.println("---------------------------------------");
    System.out.println("Guillermo tiene: $" + Guillermo);
    System.out.println("Luis tiene: $" + Luis);
    System.out.println("Juan tiene: $" + Juan);
    System.out.println("---------------------------------------");
    
  }
}
