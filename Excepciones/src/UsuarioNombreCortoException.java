public class UsuarioNombreCortoException extends UsuariosException{

    public UsuarioNombreCortoException(String message) {
        super("Nombre demasiado corto -> "+message);
    }
}
