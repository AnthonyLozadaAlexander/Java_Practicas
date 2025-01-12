public class ejemplo_3 {
    public static void main(String[] args) {

        int count = 0;
        while (count <= 10) {
            // sin count, se ejecutaria infinitamente
            System.out.println("Count is: " + count);
            count++;
        }

        System.out.println("Bucle terminado\n");
    }
}
