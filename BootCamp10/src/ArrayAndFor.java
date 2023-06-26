import java.util.ArrayList;

public class ArrayAndFor {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        trabajarArray(nums);

    }

    public static void trabajarArray(ArrayList<Integer> numeros){

        int cont = 1;

        for(int i = 0; i < 10; i++){
            numeros.add(cont);
            cont++;
        }

        for(int i = 0; i < 10; i++){

            if(numeros.get(i) % 2 == 0){
                numeros.remove(i);
            }
            System.out.println(numeros.get(i));
        }
    }
}
