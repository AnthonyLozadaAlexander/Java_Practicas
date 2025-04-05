package CalcularFiguras;

public class MetodoCalcular
{
  public static double areaCuadrado(double lado) {
    return lado * lado;
  }

  public static double areaRectangulo(double base, double altura) {
    return base * altura;
  }

  public static double areaTriangulo(double base, double altura) {
    return (base * altura) / 2;
  }
}
