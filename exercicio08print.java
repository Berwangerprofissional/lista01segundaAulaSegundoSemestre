import java.util.Scanner;
public class exercicio08print {
    public static void main(String[] args){
        Scanner scanner=new Scanner (System.in);
        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        scanner.nextLine();//para parar com um problema

        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();
        System.out.println("seu nome é " + nome + " e tem " + idade + " anos de vida");
    }
}
