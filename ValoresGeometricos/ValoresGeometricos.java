import java.util.Locale;
import java.util.Scanner;

public class ValoresGeometricos {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double PI = Math.PI;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        double A = sc.nextDouble();

        System.out.println("Informe o valor de B: ");
        double B = sc.nextDouble();

        System.out.println("Informe o valor de C: ");
        double C = sc.nextDouble();

        double areaTriangulo = (A * C) / 2.0;
        double areaCirculo = PI * Math.pow(C, 2);
        double areaTrapezio = (A + B) / 2.0 * C;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }
}