import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int sayac = 0, toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        k = input.nextInt();

        for( int i = 0; i  < k; i++){
            if( i % 3 == 0 && i % 4  == 0){
                toplam += i;
                sayac++;
            }
        }

        int ortalama = toplam / sayac;
        System.out.print(ortalama);


    }
}