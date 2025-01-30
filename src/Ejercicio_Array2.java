public class Ejercicio_Array2 {
    public static void main(String[] args)
    {
        int[] numeros = {4, 3, 7, 10, 1 , 5, 7};
        int maximo = numeros[0];
        int minimo = numeros[0];
        System.out.println("Los elementos del array numeros son: ");
        for(int i = 0; i < numeros.length; i++)
        {
            System.out.println("Numeros["+i+"] =  " + numeros[i]);
        }

        for(int i = 1; i < numeros.length; i++)
        {
            if(numeros[i] > maximo)
            {
              maximo = numeros[i];
            }
            if (numeros[i] < minimo)
            {
                minimo = numeros[i];
            }
        }
        System.out.println("------------------------------");
        System.out.println("El valor minimo es: " + minimo);
        System.out.println("------------------------------");
        System.out.println("El valor maximo es: " + maximo);
        System.out.println("------------------------------");
    }
}
