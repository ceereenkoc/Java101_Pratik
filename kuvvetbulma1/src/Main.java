import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sınır sayısını giriniz: ");
        number = input.nextInt();

        System.out.println("Sınır sayısına kadar olan 4'ün kuvveti sayılar: ");
        for(int i = 1; i <= number; i *= 4){
            System.out.print(" " + i);
        }

        System.out.println("\nSınır sayısına kadar olan 5'in kuvveti sayılar: ");
        for(int i = 1; i <= number; i *= 5){
            System.out.print(" " + i);
        }
    }
}