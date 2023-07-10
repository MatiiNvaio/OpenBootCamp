public class UserEdadException extends UserException{

    public UserEdadException(String mensaje) {
        super("El usuario es menor de edad: "+mensaje+" años");
    }
}
