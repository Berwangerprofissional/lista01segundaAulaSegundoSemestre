import java.util.Locale;
import java.util.Scanner;

public class Exercicio11palindromo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra");

        String palavra = scanner.nextLine();

        String palavraMinuscola = palavra.toLowerCase().replaceAll("\\s+","");

        String palavraInvertida = new StringBuilder(palavraMinuscola).reverse().toString();

        if (palavraInvertida.equals(palavraMinuscola)) {
            System.out.println(palavra+" é um palíndromo");
        }else{
            System.out.println(palavra+" não é um palíndromo");
        }
    }
}
