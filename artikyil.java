import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
        int yil, artik_yil;
        Scanner in = new Scanner(System.in);
        System.out.println("Yıl girin: ");

        yil = in.nextInt();
        artik_yil = yil % 400;

        if (artik_yil != 0) {
            System.out.println("bu bir artık yıl değildir.");
        } else {
            System.out.println("bu bir artık yıldır.");
        }

    }

}
