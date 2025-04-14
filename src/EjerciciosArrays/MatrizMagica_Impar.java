package EjerciciosArrays;

public class MatrizMagica_Impar {
    public static void main(String[] args) {
            int num = 3;

            int i_Anterior = 0;
            int j_Anterior = 0;

            int puntoInicial = num / 2;

            int[][] matrizMagica = new int[num][num];
            int temp = 1;

            for(int i = 0; i < num; i++){
                for(int j = 0; j < num; j++){
                    matrizMagica[i][j] = 0;
                }
            }

            int i = 0;
            int j = puntoInicial;

            while(temp != (num*num)+1){
                if(matrizMagica[i][j] == 0){ // verifica si esta vacio
                    matrizMagica[i][j] = temp;
                }
                else{
                    i = i_Anterior + 1; // baja una posicion
                    j = j_Anterior;
                    matrizMagica[i][j] = temp;
                }

                i_Anterior = i;
                j_Anterior = j;

                temp++;
                j++;
                i--;
                if(i < 0 && j == num){

                }

            }
    }
}
