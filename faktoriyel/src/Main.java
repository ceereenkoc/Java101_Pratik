import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int fac = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();

        for(int i = 1; i <= number; i++){
            fac *= i;
        }
        System.out.print("Girdiğiniz sayının faktöriyeli: " + fac);
    }
}