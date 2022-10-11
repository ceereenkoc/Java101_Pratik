import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    int x, y, z, u;
    double alan;

    Scanner input = new Scanner(System.in);

    System.out.print("Birinci kenarı giriniz: ");
    x = input.nextInt();
    System.out.print("İkinci kenarı giriniz: ");
    y = input.nextInt();
    System.out.print("Üçüncü kenarı giriniz: ");
    z = input.nextInt();

    u = (x+y+z)/2;
    alan =Math.sqrt(u * (u-x) * (u-y) * (u-z));
    System.out.print("Üçgenin alanı = " + alan);



    }
}