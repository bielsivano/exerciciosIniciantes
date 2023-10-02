import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para iniciar a contagem regressiva: ");
        int inicio = scanner.nextInt();

        System.out.println("Contagem regressiva iniciando em " + inicio + ":");

        for (int i = inicio; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Contagem regressiva concluída!");

        if (inicio <= 0) {
            System.out.println("O número inicial deve ser maior que zero.");
        }

        main(args);



    }


    }
