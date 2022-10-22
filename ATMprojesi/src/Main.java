import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3; //Kullanıcının, kullanıcı ya da parolasını yanlış girme hakkı.
        int balance = 1500; //Kullanıcının hesabında olan bakiye.

        while(right > 0){
            System.out.print("Lütfen kullanıcı adını giriniz: ");
            userName = input.nextLine();
            System.out.print("Lütfen parolanızı giriniz: ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("123")){
                System.out.println("Merhaba, X Bankası'na hoşgeldiniz!");

                int select;
                do {
                    System.out.println("(1) Para çek\n" +
                                       "(2) Para yatır\n" +
                                       "(3) Bakiye sorgula\n" +
                                       "(4) Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Lütfen çekmek istediğiniz tutarı giriniz: ");
                            int price = input.nextInt();
                            balance -= price;
                            System.out.println("Güncel bakiyeniz: " + balance);
                            System.out.println("Ana menüye yönlendiriliyorsunuz...");
                            System.out.println("----------------------------");
                            break;
                        case 2:
                            System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz: ");
                            int price1 = input.nextInt();
                            balance += price1;
                            System.out.println("Güncel bakiyeniz: " + balance);
                            System.out.println("Ana menüye yönlendiriliyorsunuz...");
                            System.out.println("----------------------------");
                            break;
                        case 3:
                            System.out.println("Güncel bakiyeniz: " + balance);
                            System.out.println("Ana menüye yönlendiriliyorsunuz...");
                            System.out.println("----------------------------");
                            break;
                    }
                } while(select != 4);
                System.out.println("Tekrar görüşmek üzere!");
                break;
            } else{
                right--;
                System.out.println("Hatalı giriş yaptınız!");

                if(right == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz!");
                } else{
                    System.out.println("Kalan hakkınız " + right);
                }
            }
        }
    }
}