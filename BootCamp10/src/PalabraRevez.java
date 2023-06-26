public class PalabraRevez {
    public static void main(String[] args) {

        String texto = "Hola Mundo";
        String textoReves = reverse(texto);
        System.out.println(textoReves);
    }

    public static String reverse(String texto){

        StringBuilder reverse = new StringBuilder();
        for(int i = texto.length()-1; i >= 0; i--){
            reverse.append(texto.charAt(i));
        }
        return reverse.toString();
    }
}