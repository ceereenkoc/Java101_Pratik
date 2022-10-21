import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int count = 0, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();

        while(number  != 0){
            total += (number % 10);
            number /= 10;
            count++;
        }
        System.out.print("Basamaklar toplamı: " + total);
    }
}