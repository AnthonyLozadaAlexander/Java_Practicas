package ExpresionesMatematicas;
import java.util.Scanner;

public class FormulaGeneral {
    public static float Formula(float a, float b){
        float numerador = 0f, denominador = 0f; 
        numerador = (float) (a)*(b*b) - (float) (Math.sqrt(5*(-b) - 3 * 2));
        denominador = numerador / (- ((b)*(b)));
        return denominador;  
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = 0f, b = 0f;
        //float x = 0f, numerador = 0f, denominador = 0f;
        //float resultado = 0f;
        //float resultado = 0f;
        //float numerador = 0f, denominador = 0f;
        //float a = 0f, b = 0f;
        //float x = 0f;
        //float numerador = 0f, denominador = 0f;
        //float resultado = 0f;
        //float a = 0f, b = 0f;
        //float x = 0f;
        //float numerador = 0f, denominador = 0f;
        
        System.out.println("----------------------------");
        System.out.println("         BIENVENIDO         ");
        System.out.println("----------------------------");
        System.out.println("Ingrese el valor de a");
        System.out.print("-> ");
        a = input.nextFloat();
        System.out.println("Ingrese el valor de b");
        System.out.print("-> ");
        b = input.nextFloat();

        //numerador = (float) Math.pow(b, 2) - (float) (Math.sqrt(5*(-b) - 3 * 2));
        //denominador = numerador / (- ((b)*(b)));
        //x = denominador;

        System.out.println("-------------------------------");
        System.out.println("El resultado de x es: "+ Formula(a,b));
    }
}
