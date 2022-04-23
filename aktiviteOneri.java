import java.util.Scanner;

public class aktiviteOneri {
    public static void main(String[] args) {
        int hava_derece;
        String oneri = "";
        System.out.println("hava derecesini giriniz.");

        try (Scanner input = new Scanner(System.in)) {
            hava_derece = input.nextInt();
        }
        if (hava_derece < 5) {
            oneri = "kayak yapmaya gidebilirsiniz.";
        }
        if (hava_derece >= 5 && hava_derece < 15) {
            oneri = "sinemaya gidebilirsiniz.";
        }
        if (hava_derece >= 15 && hava_derece < 25) {
            oneri = "Pikniğe gidebilirsiniz.";
        }
        if (hava_derece >= 25) {
            oneri = "Yüzmeye gidebilirsiniz.";
        }

        System.out.println(oneri);

    }

}
