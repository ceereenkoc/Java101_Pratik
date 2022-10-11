import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, secim;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.print("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme ");
        System.out.print("\nSeçiminiz: ");
        secim = input.nextInt();

        switch(secim){
            case 1:
                System.out.print("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Fark: " + (n1-n2));
                break;
            case 3:
                System.out.print("Çarpım: " + (n1*n2));
                break;
            case 4:
                if(n2==0)
                    System.out.print("Bir sayı 0 ile bölünmez!");
                else
                    System.out.print("Bölme: " + (n1/n2));
                break;
            default:
                System.out.print("Hatalı seçim yaptınız!");
        }

    }
}