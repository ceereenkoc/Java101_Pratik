import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int total = 0;

        Scanner input = new Scanner(System.in);


        do{
            System.out.print("Lütfen bir sayı giriniz: ");
            number = input.nextInt();
            if(number % 2 == 1){
                total +=  number;
            }
        } while(number > 0);

        System.out.print("Tek sayıların toplamı: " + total);

    }
}