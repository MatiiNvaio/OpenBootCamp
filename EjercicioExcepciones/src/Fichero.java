import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fichero {

    File archivo = new File("usuarios.txt");

    public void accederFichero(){
        try {
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe o no se puede acceder a él -> " + e.getMessage());
        }
    }
}

