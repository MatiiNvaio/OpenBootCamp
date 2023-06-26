import java.util.Scanner;

public class ErrorExcepccion {

    public static void main(String[] args) {

        try{
            dividePorCero();
        }catch (Exception e){
            System.out.println("Esto no es posible");
            System.out.println("Intente otra vez");
            dividePorCero();
        }


    }

    public static void dividePorCero() throws ArithmeticException{

        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese un número: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese un número: ");
        num2 = entrada.nextInt();

        try{
            int division = num1 / num2;
            System.out.println("Resultado: "+division);

        }catch(ArithmeticException e){
            throw new ArithmeticException();
        }
    }
}
