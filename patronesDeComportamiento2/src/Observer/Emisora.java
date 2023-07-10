package Observer;

import java.util.ArrayList;

public class Emisora {

    private ArrayList<Receptor> receptores = new ArrayList<>();

    public void meteReceptor(Receptor receptor){
        receptores.add(receptor);
    }

    public void emite(){
        for(Receptor receptor : receptores){
            receptor.recibe();
        }
    }
}
