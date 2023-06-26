import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CopiaFichero {

    public static void main(String[] args) {

        try{
            InputStream fichero = new FileInputStream("N:\\texto");
            try{
                byte dato[] = fichero.readAllBytes();
                for(byte datos: dato){
                    System.out.println(datos);
                }
            }catch(IOException e){
                System.out.println("No puedo leer el fichero "+e.getMessage());
            }

        }catch (FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
