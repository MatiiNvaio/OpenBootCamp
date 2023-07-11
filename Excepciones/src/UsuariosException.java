public class UsuariosException extends Exception{

    public UsuariosException(String message){
        super("Error al registrar -> "+message);
    }

}
