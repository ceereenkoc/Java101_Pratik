import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,yenitutar, kdvorani1 = 0.18, kdvorani2 = 0.08;

        Scanner input = new Scanner(System.in);
        System.out.print("KDV'si hesaplanacak tutarı giriniz: ");
        tutar = input.nextDouble();

        double kdvtutari = tutar < 1000 ? (tutar * kdvorani1) : (tutar*kdvorani2);
        yenitutar = tutar + kdvtutari;

        System.out.println("KDV'siz tutar = " + tutar);
        System.out.println("KDV tutarı = " + kdvtutari);
        System.out.println("KDV'li tutar = " + yenitutar);





    }
}