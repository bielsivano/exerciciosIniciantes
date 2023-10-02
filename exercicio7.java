import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("coloque um numero: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        main(args);

    }

}
