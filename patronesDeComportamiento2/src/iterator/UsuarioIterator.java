package iterator;

public interface UsuarioIterator {

    // hay mas usuarios en el iterador?
    boolean hayMas();

    // reinicia el contador
    void reinicia();

    // obtiene el siguiente
    Usuario siguiente();
}
