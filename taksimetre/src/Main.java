import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe;
        double  mesafeücret = 2.20 , acilis = 10, tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen gideceğiniz mesafeyi giriniz(km): ");
        mesafe = input.nextInt();

        tutar = acilis + (mesafe * mesafeücret);

        tutar = tutar < 20 ? 20 : tutar;
        System.out.print("Ödenecek toplam tutar = " + tutar);
    }
}