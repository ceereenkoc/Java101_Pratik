import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mat, fizik, turkce, kimya, muzik, ortalama;
        double toplam = 0, sayi = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextDouble();
        if (0 < mat && mat < 100) {
            toplam += mat;
            sayi++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextDouble();
        if (0 < fizik && fizik < 100) {
            toplam += fizik;
            sayi++;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextDouble();
        if (0 < turkce && turkce < 100) {
            toplam += turkce;
            sayi++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextDouble();
        if (0 < kimya && kimya < 100) {
            toplam += kimya;
            sayi++;
        }
        System.out.print("Müzik notunuz: ");
        muzik = input.nextDouble();
        if (0 < muzik && muzik < 100) {
            toplam += muzik;
            sayi++;
        }

        ortalama = toplam / sayi;

        if (ortalama > 55)
            System.out.println("Geçtiniz!");
        else
            System.out.println("Kaldınız!");

        System.out.println("Ortalamanız: " + ortalama);
    }
}