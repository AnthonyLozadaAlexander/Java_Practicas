import java.util.Scanner;

public class While_ejercicio {
    public static void main(String[] args){
        String respuesta;
        boolean bandera = true;
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("-------BIENVENIDO------");
            System.out.println("¿Desea continuar? (s/n)");
            respuesta = input.next();

            if(respuesta.equalsIgnoreCase("n")) {
                System.out.println("Saliendo...");
            break; // alternativa a bandera = false;
            } 
            else if(respuesta.equalsIgnoreCase("s")) {
                System.out.println("Continuando...");
                System.out.println("---------------------------------------------------------");
                System.out.println("------ Programa Que Calcula El Porcentaje De Hombres y Mujeres En Un Grupo -----");
                System.out.println("---------------------------------------------------------");
                int mujeres, hombres, total;
                do {
                    System.out.println("Ingrese el numero de mujeres");
                    System.out.print("-> ");
                    mujeres = input.nextInt();
                    System.out.println("Ingrese el numero de hombres");
                    System.out.print("-> ");
                    hombres = input.nextInt();
                    total = (mujeres + hombres);

                    if (mujeres < 0 || mujeres == 0 || hombres == 0 || hombres < 0)
                    {
                        System.out.println("---------------------------------------------------------");
                        System.out.println("Error: Los valores no pueden ser menores a 0 o iguales a 0");
                        System.out.println("---------------------------------------------------------");
                    } else {
                        System.out.println("---------------------------------------------------------");
                        System.out.println("Datos ingresados correctamente");
                        System.out.println("---------------------------------------------------------");
                    }
                    mujeres = mujeres * 100/total;
                    hombres = hombres * 100/total;

                    System.out.println("\nEl porcentaje de mujeres es: " + mujeres + "%");
                    System.out.println("\nEl porcentaje de hombres es: " + hombres + "%\n");
                    System.out.println("---------------------------------------------------------");
                } while(mujeres < 0 || mujeres == 0 || hombres == 0 || hombres < 0);
                System.out.println("Continuando...");
                System.out.println("---------------------------------------------------------");
            } else {
                System.out.println("Respuesta Invalida");
            }
        }
    }
}
