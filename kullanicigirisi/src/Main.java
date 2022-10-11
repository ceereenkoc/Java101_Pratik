import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullaniciAdi, sifre, secim, yeniSifre;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        sifre = input.nextLine();

        if (kullaniciAdi.equals("patika") && sifre.equals("java123"))
            System.out.print("Sisteme giriş yaptınız!");
        else if (!(sifre.equals("java123"))) {
            System.out.println("Şifre hatalı! Şifreyi değiştirmek ister misiniz? E/H");
            System.out.print("Seçiminiz: ");
            secim = input.nextLine();
            if (secim.equals("E")) {
                System.out.print("Yeni şifreniz:");
                yeniSifre = input.nextLine();
                if (yeniSifre.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else
                    System.out.print("Şifre oluşturuldu.");
            }
        }
        else
            System.out.print("Böyle bir kullanıcı bulunamadı.");
    }
}