import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Funcionario {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de identificação do funcionario: ");
        int idFuncionario = sc.nextInt();

        System.out.println("Qual a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Qual o valor que ele recebe por horas: ");
        double valorHoras = sc.nextDouble();

        double salario = horasTrabalhadas * valorHoras;

        System.out.printf("Número do funcionário: %d%n", idFuncionario);
        System.out.printf("Salário: U$ %.2f%n", salario);
    }
}