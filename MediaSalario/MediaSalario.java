import java.util.Scanner;

/**
 * MediaSalario
 */
public class MediaSalario {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] salarios = new double[12];
            double total = 0;

            System.out.println("Digite os salários recebidos nos últimos 12 meses: ");

            for (int i = 0; i < 12; i++) {
                System.out.println("Mês " + (i + 1) + ": R$ ");
                salarios[i] = scanner.nextDouble();
                total += salarios[i];
            }

            double media = total / 12;

            System.out.println("\nTotal recebido nos últimos 12 meses: R$ " + total);
            System.out.println("Média salarial dos últimos 12 meses: R$ " + media);
        }
    }
    
}

/*Criar um programa que calcule a média de salários de uma empresa, 
pedindo ao usuário a grade de funcionários e os salários, 
e devolvendo a média salarial. */