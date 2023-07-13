public class ExceptionArray extends Exception{

    public ExceptionArray(String mensaje){
        super("Error de indice del arraglo -> "+mensaje);
    }
}
