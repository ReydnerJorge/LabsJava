import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Raio {

    public static void main(String[] args) {
        final double PI = Math.PI;
        double area;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a área do raio: ");
        double raio = sc.nextDouble();

        area = PI * Math.pow(raio, 2);

        System.out.printf("Área do círculo e: %.4f%n", area);

        sc.close();
    }
}