package EjerciciosArrays;

public class MatrizMagica_Impar {
    public static void main(String[] args) {
        int n = 3;

        int i_Anterior = 0;
        int j_Anterior = 0;

        int puntoInicial = n / 2;

        int[][] matrizMagica = new int[n][n];
        int temp = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizMagica[i][j] = 0;
            }
        }

        int i = 0;
        int j = puntoInicial;

        while (temp != (n * n) + 1) {
            if (matrizMagica[i][j] == 0) { // verifica si esta vacio
                matrizMagica[i][j] = temp;
            } else {
                i = i_Anterior + 1; // baja una posicion
                j = j_Anterior;
                matrizMagica[i][j] = temp;
            }

            i_Anterior = i;
            j_Anterior = j;

            temp++;
            j++;
            i--;

            if (i < 0 && j == n) { // esquina superior
                i = n - 1;
                j = 0;
            } else if (i < 0) {
                i = i + n;
            } else if (j == n) {
                j = 0;
            }

        }

        for (int x = 0; x < n; x++) {
            String resultado = "";
            for (int y = 0; y < n; y++) {
                resultado = resultado + " " + matrizMagica[x][y];
            }
            System.out.println("" + resultado);
        }
    }
}
