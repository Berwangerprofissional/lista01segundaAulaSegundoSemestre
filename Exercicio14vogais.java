import java.util.Scanner;

public class Exercicio14vogais {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo");
        String algo = scanner.nextLine();

        int vogais = contagem(algo);
        System.out.println("Em '" + algo + "' existem " + vogais + " vogais");
    }
    public static int contagem(String algo){
        int contagem=0;
        algo = algo.toLowerCase();

        for (int i = 0; i < algo.length(); i++) {
            char caractere = algo.charAt(i);
            if(caractere == 'a'||caractere=='e'||caractere=='i'||caractere=='o'||caractere=='u'){
                contagem++;
            }
        }
        return contagem;
    }
}
