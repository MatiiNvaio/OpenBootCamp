package Singleton;

public class Singleton {

    int contador;
    private static Singleton singleton;

    private Singleton() {
    }

    // metodo para instanciar la clase Singleton que contiene el new

    public static Singleton getInstance() {
        if(singleton == null ){
            singleton = new Singleton();
        }
        return singleton;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}

