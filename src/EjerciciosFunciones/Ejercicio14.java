package EjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio14 {
    public static float absoluto(float num){
        float R = 0.0f;

        if(num < 0)
        {
            R = -num;
        }
        else
        {
            R = num;
        }

        return R;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = 0.0f;

        System.out.println("");
    }
}
