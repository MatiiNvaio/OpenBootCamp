package Prototype;

import Builder.CocheBuilder;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();

        coche.puertas = 5;
        coche.modelo = "Focus";
        coche.marca = "Ford";

        System.out.println(coche.marca+" "+coche.puertas+" "+coche.modelo);

        try{
            Coche clonado = coche.clonar();
            System.out.println(clonado.marca+" "+clonado.puertas+" "+clonado.modelo);
        }catch (Exception e){
            System.out.println("No es posible"+e.getMessage());
        }

        Coche clonado2 = coche.clonar2();
        System.out.println(clonado2.marca+" "+clonado2.puertas+" "+clonado2.modelo);
    }
}
