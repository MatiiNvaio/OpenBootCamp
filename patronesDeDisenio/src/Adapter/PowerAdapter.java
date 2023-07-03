package Adapter;

public class PowerAdapter implements Enchufable{

    public LamparaInglesa lamparaInglesa = new LamparaInglesa();
    @Override
    public void enciende() {
        lamparaInglesa.turnOn(110);
    }

    @Override
    public void apaga() {
        lamparaInglesa.turnOff();
    }

    @Override
    public boolean estaEncendido() {
        return lamparaInglesa.isPoweredOn();
    }
}
