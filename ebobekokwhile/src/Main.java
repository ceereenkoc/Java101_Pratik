import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ebob = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int n1 = input.nextInt();

        System.out.print("Lütfen bir sayı giriniz: ");
        int n2 = input.nextInt();

        System.out.println("*************");

        if(n1 < n2){
            int i = 1;
            while (i <= n1){
                if(n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                }
                i++;
            }
            System.out.println("EBOB: " + ebob);

        }else{
            int i = 1;
            while (i <= n2){
                if(n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                }
                i++;
            }
            System.out.println("EBOB: " + ebob);
        }

        System.out.println("*************");
        int i = 1;
        while(i <= (n1*n2)){
            if (i % n1 == 0 && i % n2 == 0){
                System.out.println("EKOK: " + i);
                break;
            }
            i++;
        }
    }
}