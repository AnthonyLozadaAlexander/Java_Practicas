public class Ejercicio_Array {
    public static void main(String[] args)
    {
        System.out.println("Ejercicio Suma De Elementos De Un Array\n");
        System.out.println("Dado el siguiente array: {1, 2, 3, 4, 5}");
        System.out.println("Calcular la suma de los elementos del array");
        System.out.println("--------------------------------------------");
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;
        for(int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("La suma de los elementos del array es: " + suma);
    }
}
