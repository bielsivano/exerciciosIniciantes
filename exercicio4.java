import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    public static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1; //
        }

        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;

    }
}

