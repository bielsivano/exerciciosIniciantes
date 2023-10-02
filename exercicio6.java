import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("coloque os numeros: ");
        String input = sc.nextLine();


        String[] numerosString = input.split("");


        double soma = 0;
        int quantidadeNumeros = 0;

        for (String numeroString : numerosString) {
            try {
                double numero = Double.parseDouble(numeroString);
                soma += numero;
                quantidadeNumeros++;
            } catch (NumberFormatException e) {
                System.out.println("Ignorando valor não numérico: " + numeroString);


                double media = (quantidadeNumeros > 0) ? soma / quantidadeNumeros : 0;

                System.out.println("A média dos números é: " + media);

            }
        }
    }
}
