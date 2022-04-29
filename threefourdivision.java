import java.util.Scanner;

public class tambolunensayi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dongu;
        int toplam = 0;
        int dongu_sayisi = 0;

        System.out.println("döngü sayısını girin:");
        dongu = in.nextInt();
        while (dongu > 0) {
            if (dongu % 4 == 0 || dongu % 3 == 0) {
                toplam += dongu;
                dongu_sayisi++;
            }
            System.out.println(toplam);

            dongu--;

        }
        System.out.println("3e ve 4e bölünen sayıların ortalaması :" + (toplam / dongu_sayisi));
    }
}
