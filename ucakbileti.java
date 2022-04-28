import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args) {
        int mesafe;
        int yolculuk_tip;
        int yolcu_yasi;
        double km_fiyat = 0.10;
        double fiyat;
        double fiyat_orani;
        double indirimli_fiyat = 0.0;
        double bilet_fiyati = 0.0;

        Scanner in = new Scanner(System.in);

        System.out.print("Kilometreyi girin:");
        mesafe = in.nextInt();
        if (mesafe < 0) {
            do {
                System.out.print("Mesafe 0dan büyük olmalı");
                mesafe = in.nextInt();
                break;
            } while (mesafe < 0);

        } else {

        }
        System.out.print("Yolculuk tipini girin \n1 Tekgidiş \n2 Gidiş Dönüş:");

        yolculuk_tip = in.nextInt();
        if (yolculuk_tip != 1 && yolculuk_tip != 2) {
            do {
                System.out.print("Yolculuk tipi \n1 Tekgidiş \n2 Gidiş Dönüş olmalı");
                yolculuk_tip = in.nextInt();
                break;
            } while (yolculuk_tip != 1 && yolculuk_tip != 2);

        } else {
        }
        System.out.print("Yaşınızı girin");

        yolcu_yasi = in.nextInt();

        fiyat = km_fiyat * mesafe;

        if (yolcu_yasi < 12) {
            fiyat_orani = fiyat * 50 / 100;
            indirimli_fiyat = fiyat - fiyat_orani;
            System.out.print(indirimli_fiyat);

        } else if (yolcu_yasi >= 12 && yolcu_yasi <= 24) {
            fiyat_orani = fiyat * 10 / 100;
            indirimli_fiyat = fiyat - fiyat_orani;

        } else if (yolcu_yasi > 65) {
            fiyat_orani = fiyat * 30 / 100;
            indirimli_fiyat = fiyat - fiyat_orani;

        } else {
            indirimli_fiyat = fiyat;
        }

        if (yolculuk_tip == 2) {
            indirimli_fiyat -= indirimli_fiyat * 20 / 100;
            System.out.println("biletin fiyatı" + indirimli_fiyat);
        } else {
            bilet_fiyati = indirimli_fiyat;
            System.out.println("biletin fiyatı" + bilet_fiyati);

        }
    }

}
