import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        double numero1 = sc.nextDouble();
        System.out.println("digite o segundo numero");
        double numero2 = sc.nextDouble();

        System.out.println("digite a operação");
        System.out.println("1 adição");
        System.out.println("2 subtração");
        System.out.println("3 divisão");
        System.out.println("4 multiplicação");

        int operaçao = sc.nextInt();

        double resultado;

        switch (operaçao){

            case 1:
                resultado = numero1 + numero2;
                System.out.println("o resultado da adição é " + resultado);
            case 2:
                resultado = numero1 - numero2;
                System.out.println("o resultado da subtração é " + resultado);
            case 3:
                resultado = numero1/numero2;
                System.out.println("o resultado da divisão é " + resultado);
            case 4:
                resultado = numero1 * numero2;
                System.out.println("o resultado da multiplicação é " + resultado);

                break;

        }

    }

}
