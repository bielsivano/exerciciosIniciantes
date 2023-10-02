import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1. Converter de Celsius para Fahrenheit");
        System.out.println("2. Converter de Fahrenheit para Celsius");

        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = converterCelsiusParaFahrenheit(celsius);
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = converterFahrenheitParaCelsius(fahrenheit);
            System.out.println("A temperatura em Celsius é: " + celsius);
        } else {
            System.out.println("Escolha inválida. Por favor, execute o programa novamente e escolha uma opção válida.");
        }
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

}
