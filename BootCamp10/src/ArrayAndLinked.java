import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayAndLinked {

    public static void main(String[] args) {

        array();


    }

    public static void array(){

        ArrayList<String> materias = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        String materia="";

        for(int i = 0; i < 4; i++){
            System.out.println("Ingrese una materia: ");
            materia = entrada.nextLine();
            materias.add(materia);
        }

        List<String> materiasLinked = new LinkedList<>(materias);
        System.out.println("Este es el arrayLis");
        System.out.println("");
        for(String e: materias){
            System.out.println("Materias: "+e);
        }

        System.out.println("");
        System.out.println("Este es el linkedList");
        System.out.println("");
        for(String e: materiasLinked){
            System.out.println("Materias: "+e);
        }
    }
}
