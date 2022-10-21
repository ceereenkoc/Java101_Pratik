import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue, basPow;
        int result = 0;

        //İlk önce sayının kaç basamaklı olduğunu hesaplıyoruz.
        while(tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        //Daha sonrasında basamak değerlerinin üslerini alıp toplamlarını hesaplıyoruz.
        tempNumber = number;
        while(tempNumber != 0){
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i ++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }


    }
}