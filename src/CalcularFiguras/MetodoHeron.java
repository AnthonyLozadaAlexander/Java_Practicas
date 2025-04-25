package CalcularFiguras;

public class MetodoHeron {
    public static float semiArea(float a, float b, float c) {
        float S = (a + b + c) / 2;
        return S;
    }
    public static float areaTriangulo(float a, float b, float c){
        float S = (a + b + c) / 2;
        float Area = (float) Math.sqrt(S*(S - a)*(S-b)*(S-c));
        return Area;
    }
}
