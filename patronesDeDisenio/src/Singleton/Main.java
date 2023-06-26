package Singleton;

public class Main {
    public static void main(String[] args) {

        // para instanciar la clase se llama al metodo getInstance que tiene la instancia

        /*Singleton singleton = Singleton.getInstance();

        singleton.setContador(15);
        System.out.println(singleton.getContador());

        Singleton singleton2 = Singleton.getInstance();

        singleton2.setContador(10);
        System.out.println(singleton2.getContador());*/

        // al crear dos instancias, la segunda comparte la instancia de la primera
        // por lo que muestran la misma dirección de memoria
        // cada vez que cree una instacia va a compartir con la primera creada

        Aplicacion app = Aplicacion.getInstance();  // new Aplicacion()
        Aplicacion app2 = Aplicacion.getInstance();  // app2 = app
        app.Run();
        app2.Run();

        System.out.println(app+" "+app2);

    }
}