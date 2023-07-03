package Adapter;

public class LamparaInglesa {

    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage){
        poweredOn = true;
        this.voltage = voltage;
    }

    public  void turnOff(){
        poweredOn = false;
        voltage = 0;
    }

    public boolean isPoweredOn(){
        return poweredOn;
    }
}
