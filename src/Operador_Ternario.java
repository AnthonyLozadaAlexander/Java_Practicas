import java.util.Scanner;

public class Operador_Ternario {
    public static void main(String[] args){
        double promedio;
        Scanner input = new Scanner (System.in);

        System.out.println("Ingresa tu promedio: ");
        promedio = input.nextDouble();

        String resultado = (promedio >= 6.5) ? "Aprobado" : "Reprobado";
        System.out.println("Resultado: " + resultado);

    }
}
