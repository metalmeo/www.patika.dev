import java.util.Scanner;

public class kucuktenbuyugesayi {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı girin");
        a = input.nextInt();
        System.out.println("ikinci sayıyı girin");
        b = input.nextInt();
        System.out.println("ucuncu sayıyı girin");
        c = input.nextInt();
        if (a > b && a > c) {

            if (b > c) {
                System.out.println(c + "<" + b + "<" + a);
            } else {
                System.out.println(b + "<" + c + "<" + a);
            }
        }
        if (b > a && b > c) {
            if (a > c) {
                System.out.println(c + "<" + a + "<" + b);
            } else {
                System.out.println(a + "<" + c + "<" + b);
            }
        }
        if (c > a && c > b) {
            if (a > b) {
                System.out.println(b + "<" + a + "<" + c);
            } else {
                System.out.println(a + "<" + b + "<" + c);
            }
        }
    }
}
