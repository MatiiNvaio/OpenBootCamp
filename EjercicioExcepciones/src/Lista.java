public class Lista {



    public void recorrerArray(Integer valor) throws ExceptionArray {
        int[] miArray = new int[valor];
        miArray[0] = 10;
        miArray[1] = 20;
        miArray[2] = 30;
        miArray[3] = 40;
        miArray[4] = 50;

        for(int i = 0; i < 9; i++){
            System.out.println(i);
            throw new ExceptionArray(valor.toString());
        }

    }
}
