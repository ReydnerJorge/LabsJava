
public class Conversor {

    public static void main(String[] args) {
        double C, K, F, Re, Ra;
        C = 36;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println("A temperatura em Fahrenheit é: " + F);
        System.out.println("A temperatura em Kelvin é: " + K);
        System.out.println("A temperatura em Reaumur é: " + Ra);
        System.out.println("A temperatura em Rankine é:" + Re);
    }
    
}


/*
 * Escreva um programa que, com base em uma temperatura em graus celsius, 
 * a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
 * seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
 */