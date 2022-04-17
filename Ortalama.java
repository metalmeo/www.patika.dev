import java.util.Scanner;

class ortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        float mat_not, kimya_not, turkce_not, Tarih_not, muzik_not;
        float not_ortalama;

        System.out.println("Matematik Notu?");
        mat_not = input.nextFloat();
        System.out.println("kimya Notu?");
        kimya_not = input.nextFloat();
        System.out.println("Turkce Notu?");
        turkce_not = input.nextFloat();
        System.out.println("Tarih Notu?");
        Tarih_not = input.nextFloat();
        System.out.println("Muzik Notu?");
        muzik_not = input.nextFloat();

        not_ortalama = (mat_not + kimya_not + turkce_not + Tarih_not + muzik_not) / 5;
        String durum = (not_ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Not Ortalamasi = " + not_ortalama + " " + durum);

    }

}
