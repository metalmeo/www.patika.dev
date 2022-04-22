import java.util.Scanner;

public class Calc_Sw_case {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int islem;
        int sonuc;

        System.out.println("ilk sayiyi girin");
        n1 = input.nextInt();
        System.out.println("ikinci sayiyi girin");
        n2 = input.nextInt();
        System.out.println("islem nedir? \n1 toplama \n2 cikarma \n3 carpma \n4 bolme");
        islem = input.nextInt();
        switch (islem) {
            case 1:

                sonuc = n1 + n2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc = n1 - n2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc = n1 * n2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc = n1 / n2;
                System.out.println(sonuc);
                break;
            default:
                break;
        }

    }
}
