import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Random ra = new Random();
        int numeroAleatorio = ra.nextInt(100) + 1;
        int tentativas = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        int palpite;

        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroAleatorio);

    }
}

