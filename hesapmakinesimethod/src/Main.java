import java.util.Scanner;

public class Main {
    static void  sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Girilecek sayı adedini giriniz: ");
        int counter = input.nextInt();
        int number, result = 0;

        for(int  i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = input.nextInt();
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }
    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Girilecek sayı adedini giriniz: ");
        int counter = input.nextInt();
        int number, result = 0;

        for(int  i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç: " + result);
    }
    static void times() {
        Scanner input = new Scanner(System.in);
        System.out.print("Girilecek sayı adedini giriniz: ");
        int counter = input.nextInt();
        int number, result = 1;

        for(int  i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = input.nextInt();
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }
    static void divide() {
        Scanner input = new Scanner(System.in);
        System.out.print("Girilecek sayı adedini giriniz: ");
        int counter = input.nextInt();
        double number, result = 0.0;

        for(int  i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = input.nextInt();
            if(i != 0 && number == 0) {
                System.out.println("Sayı 0'a bölünemez!");
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç: " + result);
    }
    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int b = input.nextInt();

        int result = 1;

        for(int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuç: " + result);
    }
    static void fac() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = input.nextInt();

        int result = 1;

        for(int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }
    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = input.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int b = input.nextInt();

        System.out.println("Sonuç: " + a % b);
    }
    static void rectangular() {
        Scanner input = new Scanner(System.in);
        System.out.print("1-Çevre\n2-Alan\n");
        System.out.print("Seçiminiz: ");
        int select = input.nextInt();
        System.out.print("Kısa kenarı giriniz: ");
        int a = input.nextInt();
        System.out.print("Uzun kenarı giriniz: ");
        int b = input.nextInt();

        int result;

        if(select == 1) {
            result = 2 * (a+b);
        } else {
            result = a * b;
        }

        System.out.println("Sonuç: " + result);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1-Toplama\n" +
                      "2-Çıkarma\n" +
                      "3-Çarpma\n" +
                      "4-Bölme\n" +
                      "5-Üs alma\n" +
                      "6-Faktöriyel\n" +
                      "7-Mod alma\n" +
                      "8-Dikdörtgenin alanını ve çevresini hesaplama\n" +
                      "0-Çıkış\n";

        System.out.print(menu);

        while(true) {

            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            select = input.nextInt();

            if (select == 0) {
                break;
            }



            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    fac();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangular();
                    break;
                default:
                    System.out.println("Hatalı tuşalama yaptınız!");
                    break;
            }

        }
        System.out.print("Çıkış yapılıyor...");

    }
}