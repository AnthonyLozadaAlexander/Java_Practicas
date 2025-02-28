import java.util.Scanner;

public class PrincipalCalcular {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int i = 1;
        double lado, base, altura;
        do{
            lado = 0;
            base = 0;
            altura = 0;
            System.out.println("--------------------SISTEMA--------------------");
            System.out.println("\t1. Calcular Area Del Cuadrado");
            System.out.println("\t2. Calcular Area Del Rectangulo");
            System.out.println("\t3. Calcular Area Del Triangulo");
            System.out.println("\t0. Salir");
            System.out.println("-----------------------------------------------");
            System.out.println("Digite una opcion");
            System.out.print("-> ");
            i = input.nextInt();

            switch(i){
                case 1:
                    System.out.println("Ingrese uno de los lados del cuadrado");
                    lado = input.nextDouble();
                    System.out.println("-----------------------------------------------");
                    System.out.println("\tEl Area Del Cuadrado es: "+ MetodoCalcular.areaCuadrado(lado));
                    System.out.println("-----------------------------------------------");
                    break;

                case 2:
                    System.out.println("Ingrese la base del rectangulo");
                    base = input.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo");
                    altura = input.nextDouble();
                    System.out.println("-----------------------------------------------");
                    System.out.println("\tEl Area Del Rectangulo es: " + MetodoCalcular.areaRectangulo(base, altura));
                    System.out.println("-----------------------------------------------");
                    break;
                case 3:
                    System.out.println("Ingrese la base del triangulo");
                    base = input.nextDouble();
                    System.out.println("Ingrese la altura del triangulo");
                    altura = input.nextDouble();

                    System.out.println("-----------------------------------------------");
                    System.out.println("\tEl Area Del Triangulo es: "+ MetodoCalcular.areaTriangulo(base, altura));
                    System.out.println("-----------------------------------------------");
                    break;
                case 0:
                    System.out.println("-----------------------------------------------");
                    System.out.println("\tGracias Por Usar El Sistema");
                    System.out.println("-----------------------------------------------");
                    break;
                default:
                    System.out.println("-----------------------------------------------");
                    System.out.println("\tIngrese una opcion valida");
                    System.out.println("-----------------------------------------------");
            }
        }while(i != 0);
  }
}
