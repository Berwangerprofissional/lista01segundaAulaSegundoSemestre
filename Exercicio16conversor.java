import java.util.Scanner;

public class Exercicio16conversor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("O que deseja fazer?\n1 - fahrenheit para celsius\n2 - celsius para fahrenheit");
        int opcao = scanner.nextInt();
        System.out.println("Digite a temp que deseja converter");
        int temp = scanner.nextInt();
        if (opcao == 1) {
            System.out.println(FpC(temp));
        }else if(opcao==2){
            System.out.println(CpF(temp));
        }else{
            System.out.println("Erro");
        }
    }
    public static int FpC(int fahre){
        double resultado = (double)(fahre -32)*5/9;
        return (int) resultado;
    }
    public static int CpF(int cel){
        double resultado = (double)(cel *9/5)+32;
        return (int) resultado;
    }
}
