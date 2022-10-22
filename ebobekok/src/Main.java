import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen küçük sayıyı giriniz: ");
        int n1 = input.nextInt();

        System.out.print("Lütfen büyük sayıyı giriniz: ");
        int n2 = input.nextInt();


        //EBOB (1. Yöntem)
        int ebob = 1;
        for(int i = 1; i <= n1; i++){
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
        }
        System.out.println("EBOB: " + ebob);

        System.out.println("*************");

        //EBOB (2.Yöntem)
        for(int j = n1; j >= 1; j--){
            if(n1 % j == 0 && n2 % j == 0){
                ebob = j;
                break;
            }
        }
        System.out.println("EBOB: " + ebob);


        System.out.println("*************");

        //EKOK
        for(int k = 1; k <= (n1*n2); k++){
            if(k % n1 == 0 && k % n2 == 0){
                System.out.println("EKOK: " + k);
                break;
            }
        }

    }
}