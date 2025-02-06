import java.util.Scanner;

public class Ejercicio1_Vectores {
    public static void main(String[]args){
        // guardar 8 nombres en un vector y mostrar en pantalla
        String nombres[] = new String[8];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < nombres.length; i++)
        {
            System.out.println("Ingrese el nombre que desea guardar en el Indice["+i+"]");
            nombres[i] = input.nextLine();
        }
        System.out.println((""));
        System.out.println("Lista de nombres: \n");
        for(int i = 0; i < nombres.length; i++)
        {
            System.out.println("Indice["+ i +"] Nombre Guardado = " + nombres[i]);
        }
    }
}
