import java.util.Scanner;

public class Metodo {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int a, b, resultado;

   System.out.println("Ingrese 2 Numeros");
   System.out.println("-----------------------------");
   System.out.print("Ingrese el primer numero -> ");
   a = input.nextInt();
   System.out.print("Ingrese el segundo numero -> ");
   b = input.nextInt();
   System.out.println("-----------------------------");

   resultado = sumar(a, b);
   System.out.println("La suma de los numeros es: " + resultado + "\n");
   resultado = restar(a, b);
   System.out.println("La resta de los numeros es: " + resultado + "\n");
   multiplicar(a, b);

  }

  public static int sumar(int x, int y){
    return x + y;
  }

  public static int restar(int x, int y){
    return x - y;
  }

  public static void multiplicar(int x, int y){
    System.out.println("El resultado de la multiplicacion es: " + (x * y));
  }

}
