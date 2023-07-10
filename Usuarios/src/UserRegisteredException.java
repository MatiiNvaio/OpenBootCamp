public class UserRegisteredException extends UserException{

    public UserRegisteredException(String mensaje) {
        super("El usuario ya existe: "+mensaje);
    }
}
