import java.util.stream.IntStream;

public class Recursividad {

    public static void main(String[] args) {
        System.out.println("Suma iterativo(for): "+suma(5));
        System.out.println("Suma recursiva: "+sumaRecursiva(5));
        System.out.println("Suma funcional: "+sumaFuncional(5));
        System.out.println("Factorial iterativo(for): "+factorial(5));
        System.out.println("Factorial recursivo: "+falcorialRecursivo(5));
        System.out.println("Factorial funcional: "+factorialFuncional(5 ));
        System.out.println("Muestra del 1 al 5");
        System.out.println(headRecursion(5));
        System.out.println("Muestra del 5 al 1");
        System.out.println(tailRecursion(5));
    }

    // factorial con un for
    public static int factorial(int num){
        int resultado = 1;
        for(int i = 1; i <= num; i++){
            resultado *= i;
        }
        return resultado;
    }

    // factorial de manera recursiva
    public static int falcorialRecursivo(int num){
        if(num == 1){
            return 1;
        }
        return num * falcorialRecursivo(num -1);
    }

    // factorial de un numero con una funcion
    public static int factorialFuncional(int num){
        return IntStream.rangeClosed(1, num)
                .reduce(1,(a, b)->a*b);
    }

    // suma del 1 al 5 de manera recursiva
    public static int sumaRecursiva(int max){

        if(max == 1){
            return 1;
        }
        return max + sumaRecursiva(max - 1);
    }

    // suma del 1 al 5 con un bucle for
    public static int suma(int max){
        int resultado = 0;

        for (int i=0; i <= max; i++){
            resultado += i;
        }
        return resultado;
    }

    // muestra del 1 al 5, recursividad por cabeza
    public static boolean headRecursion(int valor){
        if(valor == 0){
            return false;
        }

        headRecursion(valor -1);
        System.out.println(valor);
        return false;
    }

    // muestra del 5 al 1, recursividad por cabeza
    public static boolean tailRecursion(int valor){
        if(valor == 0){
            return false;
        }

        System.out.println(valor);
        tailRecursion(valor -1);
        return false;
    }

    public static int sumaFuncional(int num){
        return IntStream.rangeClosed(1, 5)
                .reduce(0,(a, b) -> a + b);
    }
}
