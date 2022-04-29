import java.util.Scanner;

public class uslusayilar {
    public static void main(String[] args) {
        int sayi;
        int sonuc = 1;

        Scanner in = new Scanner(System.in);
        sayi = in.nextInt();
        for (int i = 1; i <= sayi; i++) {
            sonuc *= sayi;
            System.out.println(sayi + "^" + i + "=" + sonuc);

        }
    }

}
