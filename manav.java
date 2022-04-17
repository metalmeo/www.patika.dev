import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut_k, elma_k, dom_k, muz_k, pat_k, toplam;
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;
        System.out.println("Armut Kaç Kilo");
        armut_k = input.nextDouble();
        System.out.println("Elma Kaç Kilo");
        elma_k = input.nextDouble();
        System.out.println("domates Kaç Kilo");
        dom_k = input.nextDouble();
        System.out.println("Muz Kaç Kilo");
        muz_k = input.nextDouble();
        System.out.println("Patlican Kaç Kilo");
        pat_k = input.nextDouble();
        toplam = (armut * armut_k) + (elma * elma_k) + (domates * dom_k) + (muz * muz_k) + (patlican * pat_k);
        System.out.println("Toplam Tutar : " + toplam);
    }
}
