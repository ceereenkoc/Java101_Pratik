import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri tanımla.
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Değişkenleri kullanıcıdan almak için Scanner Sınıfı tanımla.
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        //Ortalama için önce toplamı hesaplayıp daha sonra ders sayısına böleceğiz.
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6; //Bölme sonucunda ondalıklı sayı elde etme ihtimalizin olduğu için daha doğru sonuç için double veri türü kullandık.
        System.out.println("Not ortalamanız: " + ortalama);

        String str = ortalama > 60 ? "Sınıfı geçti" :  "Sınıfta kaldı";
        System.out.println(str);

    }
}