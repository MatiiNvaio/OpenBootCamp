import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //Funcionales f = new Funcionales();
        //f.pruebas();

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Matias");
        nombres.add("Juan");
        nombres.add("Santi");

        // Guarda los valores en el arrayList y les aplica mayuscula
        Stream<String> valores = nombres.stream()
                .map((x) -> x.toUpperCase())
                .filter(x -> x.startsWith("M"));

        // Agarra los valores del array y los imprime
        valores.forEach(x -> System.out.println(x));
    }
}