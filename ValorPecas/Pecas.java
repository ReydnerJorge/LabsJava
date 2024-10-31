import java.util.Locale;
import java.util.Scanner;

public class Pecas {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código da peça 1: ");
        int peca1 = sc.nextInt();

        System.out.println("Informe a quantidade de peças: ");
        int quantidade1 = sc.nextInt();

        System.out.println("Informe o valor unitário: ");
        double valor1 = sc.nextDouble();

        System.out.println("----------------------------------");

        System.out.println("Informe o código da peça 2: ");
        int peca2 = sc.nextInt();

        System.out.println("Informe a quantidade de peças: ");
        int quantidade2 = sc.nextInt();

        System.out.println("Informe o valor unitário: ");
        double valor2 = sc.nextDouble();

        double valorTotal = (quantidade1 * valor1) + (quantidade2 * valor2);

        System.out.println("Código peças: " + peca1 + " é " + peca2);
        System.out.printf("VALOR A PAGAR: %.2f%n", valorTotal);
    }
}
