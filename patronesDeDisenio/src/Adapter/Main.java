package Adapter;

public class Main {
    public static void main(String[] args) {

        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter lamparaInglesa = new PowerAdapter();


        enciende(horno);
        enciende(lampara);
        enciende(lamparaInglesa);

        System.out.println(horno.estaEncendido());
        System.out.println(lampara.estaEncendido());
        System.out.println(lamparaInglesa.estaEncendido());
    }

    public static void enciende(Enchufable enchufable){
        enchufable.enciende();
    }
    public static void apaga(Enchufable enchufable){
        enchufable.apaga();
    }
    public static void estaEncendido(Enchufable enchufable){
        enchufable.estaEncendido();
    }
}
