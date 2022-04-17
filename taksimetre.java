import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, km_tutar, toplam_tutar;
        double indi_bindi = 20;
        km_tutar = 2.20;

        System.out.println("Kilometreyi girin");

        km = input.nextInt();
        toplam_tutar = 10;

        if (toplam_tutar < 20) {
            toplam_tutar = 20;
        } else {
            toplam_tutar = km * km_tutar;
        }

        System.out.println("ödeme" + toplam_tutar);
    }

}
