public class Cavalos {

    public static void main(String[] args) {
        
        double m, h, t, cavalos;

        m = 21000;
        h = 5;
        t = 60;

        cavalos = (m * h / t) / 745.6999;

        System.out.println("A quantidade de cavalos necessários é: " + cavalos);
    }
}