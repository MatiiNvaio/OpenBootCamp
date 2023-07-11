import java.io.IOException;

public class Main {

    public static void main(String[] args)  {

        a();

        try{
            divicionPorCero(5, 2);

        }catch (ArithmeticException e){
            System.out.println("Hay una excepcion aritmetica");
        }catch (IOException e){
            System.out.println("Hay una excepcion IO");
        }catch (Exception e){
            System.out.println("Excepcion de otro tipo: "+e.getClass());
        }

        Usuarios usuario = new Usuarios();

        try {
            usuario.meterUsuario("Matias");
            usuario.meterUsuario("Pepe");
            usuario.meterUsuario("Matias");

        }catch (UsuariosException e){
            System.out.println(e.getMessage());
        }

    }

    private static void a() {
        b();
    }

    private static void b() {
        try{
            int valor = 5 / 0;

        }catch (ArithmeticException e){
            System.out.println("ERROR"+e.getMessage());

            for(StackTraceElement valor : e.getStackTrace()){
                System.out.println("Linea: "+valor.getLineNumber());
            }
        }
    }

    public static int divicionPorCero(int valor, int dividendo) throws IOException, ArithmeticException {
        int resultado = 0;
        try{
            resultado = valor / dividendo;

            if(dividendo == 1){
                throw new IOException();
            }
        } catch (ArithmeticException e){
            throw new ArithmeticException();
        }

        return resultado;
    }

}
