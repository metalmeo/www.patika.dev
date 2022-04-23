import java.util.Scanner;

public class kullanici_sifre_kontrol {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password, newpass;
        int onay;
        boolean sifre_onay;
        System.out.print("kullanıcı adını giriniz");
        username = input.nextLine();
        System.out.println("parolayı giriniz");
        password = input.nextLine();
        if (username.equals("mehmet") && password.equals("java123")) {
            System.out.println("Giriş başarılı");
        } else {

            System.out
                    .println("kullanici adi veya parola hatali şifreyi sifirlamak istiyormusunuz ? \n1 Evet \n2 Hayır");
            onay = input.nextInt();

            if (onay == 1) {
                do {
                    System.out.println("Yeni şifrenizi girin");
                    newpass = input.next();
                    if (newpass.equals(password)) {
                        System.out.println("Aynı şifreyi giremezsiniz");
                        sifre_onay = false;
                    } else {
                        sifre_onay = true;
                        System.out.println("giriş başarılı");
                    }

                } while (sifre_onay == false);

            }

            else {
                System.out.println("Giriş iptal edilmiştir.");
            }

        }
    }

}
