import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12ordem {
    public static void main(String[] args){
        int[] V = new int[5];
        System.out.println("Digite 5 numeros");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            V[i] = scanner.nextInt();
        }
        Arrays.sort(V);
        for (int i = 0; i < 5; i++) {
            System.out.println(V[i]);
        }
    }
}
