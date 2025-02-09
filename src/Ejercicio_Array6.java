public class Ejercicio_Array6 {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};
        int count = 0;
        for (int number : numbers) {
          System.out.println("numbers["+count+"] = " + number);
          count++;
        }
    }
}
