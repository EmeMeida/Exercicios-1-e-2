import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numeroSecreto = random.nextInt(100) + 1; 
        int palpite = 0;
        
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("O número é maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número!");
            }
        }

        scanner.close();
    }
}