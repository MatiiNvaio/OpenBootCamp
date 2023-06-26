import java.util.Scanner;

public class ArrayUni {

    public static void main(String[] args) {


        String nombres[] = new String[3];
        mostrarFor(nombres);

    }

    public static void mostrarFor( String nombres[]){

        Scanner entrada = new Scanner(System.in) ;

        for(int i = 0; i < 3; i++){
            System.out.println("Ingrese un nombre: ");
            nombres[i]= entrada.nextLine();
        }

        for(int i = 0; i < 3; i++){
            System.out.println(nombres[i]);
        }
    }
}
