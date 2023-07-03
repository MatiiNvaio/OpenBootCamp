package Adapter;

public class LamparaInglesa {

    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage){
        poweredOn = true;
        this.voltage = voltage;
        System.out.println("Lampara inglesa poweredOn with "+voltage+" of current");
    }

    public  void turnOff(){
        poweredOn = false;
        voltage = 0;
        System.out.println("Lampara inglesa poweredOff");

    }

    public boolean isPoweredOn(){
        return poweredOn;
    }
}
