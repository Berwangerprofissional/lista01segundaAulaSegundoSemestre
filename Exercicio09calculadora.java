import java.util.Scanner;

public class Exercicio09calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que calculo deseja realizar?\n1- SOMA\n2- SUBTRAÇÃO\n3- MULTIPLICAÇÃO\n4- DIVISÃO");
        int opcao = scanner.nextInt();
        System.out.println("Digite um numero ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro numero ");
        int n2 = scanner.nextInt();
        switch (opcao){
            case 1 -> {
                int soma = n1+n2;
                System.out.println("O resultado é = "+ soma);
            }
            case 2 -> {
                int sub = n1-n2;
                System.out.println("O resultado é = " + sub);
            }
            case 3 -> {
                int multi = n1*n2;
                System.out.println("O resultado é = " + multi);
            }
            case 4 -> {
                double div = (double) n1 / n2;
                System.out.printf("O resultado é = %.2f", div);
            }
            default -> System.out.println("Opção inválida!");
        }
    }
}
