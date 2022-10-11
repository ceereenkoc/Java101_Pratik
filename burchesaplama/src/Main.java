import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ay, gun;
        String burc = " ";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        gun = input.nextInt();

        if (gun <= 31 && ay <= 12) {
            if (ay == 1) {
                if(gun <= 21)
                    burc = "Oğlak";
                else
                    burc = "Kova";
            }
            if (ay == 2) {
                if(gun <= 19)
                    burc = "Kova";
                else
                    burc = "Balık";
            }
            if (ay == 3) {
                if(gun <= 20)
                    burc = "Balık";
                else
                    burc = "Koç";
            }
            if (ay == 4) {
                if(gun <= 20)
                    burc = "Koç";
                else
                    burc = "Boğa";
            }
            if (ay == 5) {
                if(gun <= 21)
                    burc = "Boğa";
                else
                    burc = "İkizler";
            }
            if (ay == 6) {
                if(gun <= 22)
                    burc = "İkizler";
                else
                    burc = "Yengeç";
            }
            if (ay == 7) {
                if(gun <= 22)
                    burc = "Yengeç";
                else
                    burc = "Aslan";
            }
            if (ay == 8) {
                if(gun <= 22)
                    burc = "Aslan";
                else
                    burc = "Başak";
            }
            if (ay == 9) {
                if(gun <= 22)
                    burc = "Başak";
                else
                    burc = "Terazi";
            }
            if (ay == 10) {
                if(gun <= 22)
                    burc = "Terazi";
                else
                    burc = "Akrep";
            }
            if (ay == 11) {
                if(gun <= 21)
                    burc = "Akrep";
                else
                    burc = "Yay";
            }
            if (ay == 12) {
                if(gun <= 21)
                    burc = "Yay";
                else
                    burc = "Oğlak";
            }
        }
        else
            isError = true;

        if(isError)
            System.out.println("Hatalı giriş yaptınız.");
        else
            System.out.println("Burcunuz: " + burc);
    }
}