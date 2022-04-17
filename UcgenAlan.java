import java.util.Scanner;

public class ucgenalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, cevre, alan, alankare;
        a =  input.nextDouble();
        b =  input.nextDouble();
        c =  input.nextDouble();

        cevre = (a + b + c) / 2;
        alankare = cevre * (cevre - a) * (cevre - b) * (cevre - c);
        alan = Math.sqrt(alankare);
        System.out.println("ucgenin alanı = " + alan);
        

    }

}
