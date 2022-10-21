import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        int total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen üssü alınacak sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("Lütfen üssü giriniz: ");
        b = input.nextInt();

        for(int i = 1; i <= b; i++){
            total *= a;
        }

        System.out.print("Cevabınız: " + total);
    }
}