import java.util.Scanner;

public class if_else_multiple {
    public static void main(String[] args){

        int edad;
        Scanner input = new Scanner(System.in);

        System.out.println("***BIENVENDIO A ENGLISH COURSE***");
        System.out.println("Ingrese la edad: "); edad = input.nextInt();

        // En los ifs estamos creando rangos entre los cuales se encuentran las edades
        if (edad >= 4 && edad <= 6){
            System.out.println("El horario del grupo Kinder es de Lunes y Miercoles de 16 a 17");
        }
        else{
            if(edad >= 7 && edad <= 8){
                System.out.println("El horario del grupo 1st year es de Martes y Jueves de 16:30 a 17");
            }
            else{
                if(edad >= 9 && edad <= 10){
                    System.out.println("El horario del grupo 2nd year es de Martes y Jueves de 17:30 a 19");
                }
                else{
                    if(edad >= 11 && edad <= 13){
                        System.out.println("El horario del grupo 3rd year es de Lunes y Miercoles de 17 a 18:30");
                    }
                    else{
                        System.out.println("Ingreso una edad incorrecta");
                    }
                }
            }
        }

    }

}
