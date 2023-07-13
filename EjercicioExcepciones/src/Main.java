public class Main {
    public static void main(String[] args)  {

        Dividir dividir = new Dividir();
        try{
            dividir.dividir(5,0);

        }catch (ExceptionDivision e){
            System.out.println("Error aritmético -> "+e.getMessage());

            for(StackTraceElement valor : e.getStackTrace()){
                System.out.println("Error en linea: "+valor.getLineNumber()+" de la clase "+e.getClass());
            }
        }

        Lista lista = new Lista();
        try{
            lista.recorrerArray(5);
        }catch (ExceptionArray e){
            System.out.println("ArrayIndexOutOfBounds -> "+e.getMessage());

            for(StackTraceElement valor : e.getStackTrace()){
                System.out.println("Error en linea: "+valor.getLineNumber()+" de la clase "+e.getClass());
            }
        }

        Fichero fichero = new Fichero();
        fichero.accederFichero();

    }
}