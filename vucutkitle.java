import java.util.Scanner;

public class vucutkitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo, boy, kitle;

        System.out.println("Lütfen Kilonuzu girin: ");
        kilo = input.nextDouble();
        System.out.println("Lütfen Boyunuzu girin: ");
        boy = input.nextDouble();

        kitle = kilo / (boy * boy);
        System.out.println("vucut kitle endeksiniz:  " + kitle);
    }
}
