import java.util.Scanner;

public class While_ejercicio {
    public static void main(String[] args){
        String respuesta;
        boolean bandera = true;
        Scanner input = new Scanner(System.in);

        while(bandera){
            System.out.println("¿Desea continuar? (s/n)");
            respuesta = input.next();

            if(respuesta.equalsIgnoreCase("n")){
                bandera = false;
            }
        }
    }
}
