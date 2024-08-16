import java.util.Scanner;

public class Exercicio03soma {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int num1 = scanner.nextInt();
        System.out.println("Digite um segundo numero");
        int num2 = scanner.nextInt();
        double div = (double) num1 / num2;
        System.out.println(num1 + num2 + " é o resultado da soma");
        System.out.println(num1 - num2 + " é o resultado da subtracao");
        System.out.println(num1 * num2 + " é o resultado da multiplicacao");
        System.out.printf("%.2f é o resultado da divisao", div);
    }
}
