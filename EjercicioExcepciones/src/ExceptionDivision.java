public class ExceptionDivision extends Exception{

    public ExceptionDivision(String mensaje){
        super("No es posible dividir por -> "+mensaje);
    }
}
