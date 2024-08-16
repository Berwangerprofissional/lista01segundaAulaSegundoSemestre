import java.util.Scanner;

public class Exercicio04condicional {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro ");

        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("O numero " + num + " é Par!");
        }else{
            System.out.println("O numero " + num + " é Impar!");
        }
        scanner.close();
    }
}
