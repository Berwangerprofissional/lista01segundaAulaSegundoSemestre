import java.util.Scanner;

public class Exercicio10primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = scanner.nextInt();
        if(Primo(num)){
            System.out.println("É primo");
        }else{
            System.out.println("Não é");
        }
    }
    public static boolean Primo(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for (int i = 3; i < Math.sqrt(n); i+= 2){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
