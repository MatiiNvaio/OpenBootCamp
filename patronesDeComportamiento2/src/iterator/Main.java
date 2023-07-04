package iterator;

public class Main {

    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();

        usuarios.crear(new Usuario("uno", 20));
        usuarios.crear(new Usuario("dos", 21));
        usuarios.crear(new Usuario("tres", 22));
        usuarios.crear(new Usuario("cuatro", 23));

        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es: "+usuario.getNombre());
        }

        usuarios.crear(new Usuario("cinco", 24));
        Usuario usuario = usuarios.siguiente();
        System.out.println("Usuario es: "+usuario.getNombre());

        usuarios.reinicia();
        while (usuarios.hayMas()){
            usuario = usuarios.siguiente();
            System.out.println("Usuario es: "+usuario.getNombre());
        }
    }
}
