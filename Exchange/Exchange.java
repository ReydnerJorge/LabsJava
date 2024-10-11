public class Exchange {

    private final double cotacaoDolar = 5.5;
    private final double iof = 0.0586;
    private final double taxaOperacaoEmPercentual = 1; // 1%

    public double comprarDolar(double valorReal) {

        // Conversão de reais para dólares
        double valorDolar = valorReal / cotacaoDolar;

        // Desconto do IOF do valor em dólares
        double valorDolarComIOF = valorDolar - (valorDolar * iof);

        // Calculo e desconto da taxa de operação do valor em dólares
        double taxaOperacao = valorDolar * (taxaOperacaoEmPercentual / 100);

        // Retorno do valor final ja com os descontos do IOF e da taxa de Operação
        return valorDolarComIOF - taxaOperacao;
        
    }

    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        double valorReal = 6;
        double valorDolar = exchange.comprarDolar(valorReal);
        System.out.println("Valor em dólar: " + valorDolar);
    }
}