import java.util.Scanner;

public class dortveciftsayilar {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("sayi giriniz");
        sayi = in.nextInt();
        do {
            if (sayi % 4 == 0 || sayi % 2 == 0) {
                toplam += sayi;
            }
            System.out.println("sayi giriniz");
            sayi = in.nextInt();

        } while (sayi % 2 == 0);
        System.out.println("çift ve 4e bölünen sayıların toplamı : " + toplam);

    }
}
