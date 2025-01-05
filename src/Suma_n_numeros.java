import java.util.Scanner;

public class Suma_n_numeros {
    static void main(String[] args){
        int n, suma, contador;
        Scanner input = new Scanner(System.in);

        System.out.println("Algoritmo para la suma de n, numeros\n");
        System.out.println("Ingrese un numero");
        n = input.nextInt();

        suma = 0;
        contador = 1;

        while(contador <= n)
        {
          suma = suma + contador;
          contador = contador + 1; //contador++;

        }
        System.out.println("La suma de los primeros numeros es: " + suma);

    }
}
