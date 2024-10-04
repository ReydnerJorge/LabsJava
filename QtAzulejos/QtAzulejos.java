/**
 * QtAzulejos
 */
public class QtAzulejos {

    public static void main(String[] args) {
        double hp, lp, ha, la, qtd;

        hp = 3.0; // altura parede
        lp = 2.0; // largura parede
        ha = 0.40; // altura azulejo
        la = 0.3; // largura azulejo

        qtd = (hp * lp) / (ha * la); // quantidade

        System.out.println("A quantidade de azulejos necessário para cobrir a parede: " + qtd);
    }
}

/*
 Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) 
 precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) 
 e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, 
 calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
 */