import java.util.Arrays;

public class Ejemplo_2 {
    public static void main(String[] args){
        // Busqueda Binaria
        int[] numeros = {1, 2, 3, 4, 5};
        int valorBuscado = 3;

        // Ordenar el arreglo
        Arrays.sort(numeros);

        // Inicializar variables
        int inicio = 0;
        int fin = numeros.length - 1;
        int resultado = -1;

        while(inicio <= fin)
        {
          int medio = (inicio + fin)/ 2;

          if(numeros[medio] == valorBuscado)
          {
              resultado = medio;
              break;
          }
          else if(numeros[medio] < valorBuscado)
          {
              inicio = medio + 1;
          }
          else
          {
              fin = medio - 1;
          }
        }

        if(resultado != 1){
            System.out.println("El valor " + valorBuscado + " fue encontrado en la posicion " + resultado);
        }
        else{
            System.out.println("El valor " + valorBuscado + " no fue encontrado");
        }



    }
}
