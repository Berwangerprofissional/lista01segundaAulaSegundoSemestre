import java.util.Random;
import java.util.Scanner;
public class Exercicio13jogo {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int tentativas=0;
        int maxTent = 10;
        int chute=0;
        int numAle = random.nextInt(100)+1;
        do {
            tentativas++;
            System.out.println("Tente adivinhar o numero");
            chute = scanner.nextInt();
            if(chute<numAle){
                System.out.println("O chute está baixo");
            }else if(chute>numAle){
                System.out.println("O chute está alto");
            }
            if(tentativas>=maxTent){
                break;
            }
        }while(numAle != chute);
        if (numAle == chute){
            System.out.println("Você acertou!! parabéns");
        }else if(tentativas>=maxTent){
            System.out.println("O limite de tentativas foi atingido");
        }
    }
}
