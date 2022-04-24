import java.util.Scanner;

public class burclar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gun, ay;

        System.out.println(
                "hangi ay doğdunuz \n1 Ocak \n2 Şubat\n3 Mart\n4 Nisan\n5 Mayıs \n6 Haziran\n7 Temmuz\n8 Ağustos\n9 Eylül\n10 Ekim \n11 Kasım\n12 Aralık");
        ay = in.nextInt();
        System.out.println("hangi Gün doğdunuz \n1 - 31");
        gun = in.nextInt();
        if (ay == 1) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Burcunuz oğlak");

            } else {
                System.out.println("Burcunuz Kova");
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 19) {
                System.out.println("Burcunuz Kova");

            } else {
                System.out.println("Burcunuz Balık");
            }
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 20) {
                System.out.println("Burcunuz Balık");
            }
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 20) {
                System.out.println("Burcunuz Koç");
            } else {
                System.out.println("Burcunuz Boğa");
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Burcunuz Boğa");
            } else {
                System.out.println("Burcunuz İkizler");
            }
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Burcunuz İkizler");
            } else {
                System.out.println("Burcunuz Yengeç");
            }
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Burcunuz Yengeç");
            } else {
                System.out.println("Burcunuz Aslan");
            }
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Burcunuz Aslan");
            } else {
                System.out.println("Burcunuz Başak");
            }
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Burcunuz Başak");
            } else {
                System.out.println("Burcunuz Terazi");
            }
        } else if (ay == 10) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Burcunuz Terazi");
            } else {
                System.out.println("Burcunuz Akrep");
            }
        } else if (ay == 11) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Burcunuz Akrep");
            } else {
                System.out.println("Burcunuz Yay");
            }
        } else if (ay == 12) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Burcunuz Yay");
            } else {
                System.out.println("Burcunuz Oğlak");
            }
        }
    }
}
