import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        int edad;
        System.out.println("Ejemplo Switch");
        // declaracion de variables
        int dia;
        String NombreDia;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 7: "); // del 1 al 7 por los dias de la semana.
        dia = input.nextInt();

        // Dependiendo del numero del dia, se imprimira el nombre del dia
        switch(dia)
        {
            case 1: NombreDia = "Lunes";
                break;
            case 2: NombreDia = "Martes";
                break;
            case 3: NombreDia = "Miercoles";
                break;
            case 4: NombreDia = "Jueves";
                break;
            case 5: NombreDia = "Viernes";
                break;
            case 6: NombreDia = "Sabado";
                break;
            case 7: NombreDia = "Domingo";
                break;
            default: NombreDia = "Dia no valido";
                break;
        }
        System.out.println("El dia de la semana es: " + NombreDia);
    }


}
