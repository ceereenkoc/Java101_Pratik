import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r, a;
        double pi = 3.14, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçapı giriniz: ");
        r = input.nextInt();
        System.out.print("Lütfen daire diliminin açısını giriniz: ");
        a = input.nextInt();
        alan = (pi*r*r*a)/360;

        System.out.println("Dairenin alanı = " + alan);
    }
}