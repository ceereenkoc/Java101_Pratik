import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k;
        int i = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        k = input.nextInt();
        
        while(i <= k){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}