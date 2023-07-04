package Observer;

public class Main {

    public static void main(String[] args) {
        Emisora emisora = new Emisora();

        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite satelite = new ReceptorSatelite();

        emisora.meteReceptor(satelite);
        emisora.meteReceptor(radio);
        emisora.meteReceptor(tv);
        emisora.emite();
    }
}
