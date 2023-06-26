import java.util.Scanner;

public class ArrayBidi {

    public static void main(String[] args) {

        Integer matriz[][] = new Integer[3][3];

        mostrarMatriz(matriz);
    }

    private static void mostrarMatriz(Integer[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Ingrese los nomeros en la posicion "+i+" "+j+":");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Posición "+"["+i+"]"+"["+j+"]"+"="+matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
