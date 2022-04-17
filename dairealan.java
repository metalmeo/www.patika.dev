import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Alan Formülü : π * r * r;
        // Çevre Formülü : 2 * π * r;
        double pi, yaricap, alan, cevre, merkez_aci;
        pi = 3.14;

        System.out.println("yaricapi girin");
        yaricap = input.nextDouble();
        System.out.println("Daire dilimi hesaplamak için merkez açıyı girin. tüm daire için 360 yazabilirsiniz.");
        merkez_aci = input.nextDouble();
        alan = pi * yaricap * yaricap;
        cevre = 2 * pi * yaricap;

        System.out.println("alan " + alan + " cevre " + cevre);

    }
}
