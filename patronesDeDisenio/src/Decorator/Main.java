package Decorator;

public class Main {

    public static void main(String[] args) {
//        TelefonoBasico t1 =new TelefonoBasico();
//        t1.crear();

//        TelefonoInteligente t2 = new TelefonoInteligente(new TelefonoBasico());
//        t2.crear();

        TelefonoNextGen t3 = new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasico()));
        t3.crear();
    }
}
