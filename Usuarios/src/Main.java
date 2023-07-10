public class Main {
    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();

        Usuario usuario = new Usuario();

        usuario.nombre = "Matias";
        usuario.apellido = "Navio";
        usuario.edad = 15;

        try{
            usuarios.aniadirUsuario(usuario);
            usuarios.aniadirUsuario(usuario);
        }catch(UserException e){
            System.out.println("Error al crear usuario: "+e.getMessage());
        }

        try{
            usuarios.verificarEdad(usuario);
        } catch (UserException e) {
            System.out.println("Error al crear el usuario: "+e.getMessage());
        }


    }
}