import java.util.function.Function;

public class Funcionales {

    public String toMayuscula(String nombre){
        return nombre.toUpperCase();
    }
    // lo de arriba y lo de abajo son lo mismo
    private Function<String, String> toMayus = x -> x.toUpperCase();

    private Function<Integer, Integer> sumador = x -> x.sum(x,x);

    public void pruebas(){
        System.out.println(toMayus.apply("Matias"));
        System.out.println(sumador.apply(5));
    }
}
