import java.util.Scanner;
public class Exercicio07metodo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num1 = scanner.nextInt();
        System.out.println("Digite um outro numero");
        int num2 = scanner.nextInt();
        System.out.println("O resultado utilizando um método é "+soma(num1, num2));
    }
    public static int soma (int num1, int num2){
        return num1 + num2;
    }
}
