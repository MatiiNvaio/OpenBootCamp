import java.util.ArrayList;

/**
 *  Esta clase sirve para gestionar mediante métodos la clase Usuario
 */
public class Usuarios {
    /**
     * Lista de usuarios
     */
    private  ArrayList<Usuario> usuarios = new ArrayList();

    // Método para añadir objetos de tipo Usuario a la lista interna usuarios
    //
    // y verificamos si el usuario la existe, en caso de que exista
    // se devuelve una excepción de tipo UserRegisteredException

    public void aniadirUsuario(Usuario usuario) throws UserException{
        if(usuarios.contains(usuario)){
            throw new UserRegisteredException(usuario.nombre);
        }
        usuarios.add(usuario);
    }

    /*

    * Este método verifica que el usuario ingresado cumpla
    * con la mayoria de edad, en caso de que no lo haga
    * arroja una excepción de tipo UserEdadException
    *
    * */
    public void verificarEdad(Usuario usuario) throws UserException{
        if(usuario.edad < 18){
            throw new UserEdadException(usuario.edad.toString());
        }
    }


}
