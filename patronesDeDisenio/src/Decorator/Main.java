package Decorator;

public class Main {

    public static void main(String[] args) {
        TelefonoInteligente t2 = new TelefonoInteligente(new TelefonoBasico());
        TelefonoNextGen t3 = new TelefonoNextGen(t2);
        t3.crear();
    }
}
