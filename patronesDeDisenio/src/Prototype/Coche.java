package Prototype;

public class Coche implements Cloneable{

    public String marca;
    public String modelo;
    public int puertas;

    public Coche(){ }

    // manera de hacerlo que te da java
    public Coche clonar() throws CloneNotSupportedException{

        return (Coche) this.clone();
    }

    public Coche clonar2() {

        Coche clon = new Coche();
        clon.marca = marca;
        clon.modelo = modelo;
        clon.puertas = puertas;

        return clon;

    }

}
