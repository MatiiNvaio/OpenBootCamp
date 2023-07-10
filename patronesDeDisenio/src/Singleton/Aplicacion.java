package Singleton;

public class Aplicacion {

    boolean isRunning = false;
    private static Aplicacion aplicacion;

    private Aplicacion(){}

    public static Aplicacion getInstance(){
        if(aplicacion == null){
            aplicacion = new Aplicacion();
        }
        return aplicacion;
    }

    public void Run(){
        if(!isRunning){
            isRunning = true;
        }else{
            System.out.println("Ya estaba en ejecución");
        }
    }

    public void mensaje(){
        if(!isRunning){
            isRunning = true;
        }else{
            System.out.println("Esto se va a mostrar una sola vez");
        }
    }
}
