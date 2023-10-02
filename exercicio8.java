import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra =sc.nextLine().toLowerCase();

        if (Palindromo(palavra)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }

    private static boolean Palindromo(String palavra) {
        int comprimento = palavra.length();
        for (int i = 0; i < comprimento / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}





