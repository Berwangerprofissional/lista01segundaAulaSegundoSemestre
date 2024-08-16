import java.util.Scanner;

public class Exercicio15fatorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero");
        num= scanner.nextInt();
        System.out.println("Utilizando a forma iterativa = "+iterando(num));
        System.out.println("Utilizando a forma Recursiva = "+recursiva(num));
    }
    public static int iterando(int n){
        int resultado = 1;
        for (int i =1; i <=n ; i++) {
            resultado*=i;
            System.out.println(resultado);
        }
        return resultado;
    }
    public static int recursiva(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n*recursiva(n-1);
    }

//    public static int recursiva(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * recursiva(n - 1);
//        }
}