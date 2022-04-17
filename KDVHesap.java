import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float tutar;
            double toplam_tutar_2;
            double kdvli_tutar2;
            double toplam_tutar_1;
            double kdvli_tutar1;
            double kdv_1;
            double kdv_2;

            System.out.println("tutar girin");

            tutar = input.nextFloat();

            if (tutar > 1000) {
                kdv_2 = 0.08;
                kdvli_tutar2 = tutar * kdv_2;
                toplam_tutar_2 = tutar + kdvli_tutar2;

                System.out.println("KDVsiz tutar" + tutar);
                System.out.println("KDVli tutar" + toplam_tutar_2);
                System.out.println("KDV tutarı" + kdv_2);

            } else {
                kdv_1 = 0.18;
                kdvli_tutar1 = tutar * kdv_1;

                toplam_tutar_1 = tutar + kdvli_tutar1;
                System.out.println("KDVsiz tutar" + tutar);
                System.out.println("KDVli tutar" + toplam_tutar_1);
                System.out.println("KDV tutarı" + kdv_1);
            }
        }

    }
}
