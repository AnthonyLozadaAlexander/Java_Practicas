import java.util.Scanner;

public class Ejercicio_Array7 {
  public static void main(String[] args){
    //? En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de secundario. Cada fila corresponde a las notas y al promedio de cada alumno.
    //*Se necesita un programa que permita a un profesor cargar en las 3 primeras posiciones de cada fila las notas del alumno y que en un vector diferente se calculen los promedios */

    double [][] notas = new double[4][3];
    double [] promedios = new double[4];
    Scanner input = new Scanner(System.in);

    for(int f = 0; f < notas.length; f++) //4 filas
    { 
      System.out.println("Ingrese las 3 notas del alumno[" + (f+1) + "]");
      for(int c = 0; c < notas[0].length; c++) // 3 columnas
      {   
         notas[f][c] = input.nextDouble();
      }
    }

    System.out.println("");
    //? Calcular promedios
    double total;
    //* Este vector debe tener la misma cantidad de posiciones que alumnos y coincidir en sus indices.
    for(int f = 0; f < notas.length; f++) // 4 filas
    {
     total = 0; // Reiniciar total
     for(int c = 0; c < notas[0].length; c++) // 3 columnas
     {
       total = total + notas[f][c];
     }
     promedios[f] = (total / notas[0].length); // notas[0].length = 3    
    }

    // Mostrar notas y promedios
    for(int f = 0; f < notas.length; f++) // 4 filas
    {
    System.out.println("Las notas del alunmno N°" + (f+1) + " son: ");
    for(int c = 0; c < notas[0].length; c++) // 3 columnas
    {
      System.out.println(notas[f][c]);
    }
    System.out.println("El promedio del alumno N°" + (f+1) + " es: " + promedios[f]);
    System.out.println("");
    }
  }
}
