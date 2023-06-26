import java.util.Scanner;
import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {

        vector();

        // el problema es que se van a hacer 100 copias del vector por defecto
        // lo cual es una operación muy costosa informaticamente

    }

    public static void vector(){

        Scanner entrada = new Scanner(System.in);
        Vector <String> nombres = new Vector<>();
        String nombre="";

        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese un nombre: ");
            nombre = entrada.nextLine();
            nombres.add(nombre);
        }

        nombres.remove(2);
        nombres.remove(2);

        for(int i = 0; i < nombres.size(); i++){
            System.out.println("Nombre: "+nombres.get(i));
        }

    }
}
