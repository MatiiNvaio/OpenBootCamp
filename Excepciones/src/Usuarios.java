import java.util.ArrayList;

public class Usuarios {

    ArrayList<String> usuarios = new ArrayList();

    public void meterUsuario(String nombre) throws UsuarioNombreCortoException, UsuariosYaRegistradosException{

        if(nombre.length() < 5){
            throw new UsuarioNombreCortoException(nombre);
        }

        for(String usuario : usuarios){
            if(usuario == nombre){
                throw new UsuariosYaRegistradosException(nombre);
            }
        }

        System.out.println("Usuario metido: "+nombre);
        usuarios.add(nombre);
    }
}
