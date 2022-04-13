import java.util.Scanner;

class ortalama{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        int mat_not, kimya_not,turkce_not,Tarih_not,muzik_not ;
        float not_ortalama;

        System.out.println("Matematik Notu?");
        mat_not=input.nextInt();
        System.out.println("kimya Notu?");
        kimya_not=input.nextInt();
        System.out.println("Turkce Notu?");
        turkce_not=input.nextInt();
        System.out.println("Tarih Notu?");
        Tarih_not=input.nextInt();
        System.out.println("Muzik Notu?");
        muzik_not=input.nextInt();
    

        not_ortalama= (mat_not+kimya_not+turkce_not+Tarih_not+muzik_not)/5;

    

    System.out.println("Not Ortalamasi = " + not_ortalama);

  }
   
  
}
