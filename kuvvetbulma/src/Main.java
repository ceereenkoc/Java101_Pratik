import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sınır sayısını giriniz: ");
        number = input.nextInt();

        for(int i = 1; i <= number; i *= 2){
            System.out.println(i);
        }
    }
}