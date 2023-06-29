package Decorator;

public class TelefonoBasico implements Telefono{

    @Override
    public void crear() {
        System.out.println("Soy un telefono basico");
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM(){
        System.out.println("   -> basico: Tengo GSM");
    }

    private void tengoSMS(){
        System.out.println("   -> basico: Tengo SMS");
    }
}
