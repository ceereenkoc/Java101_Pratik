public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while(temp != 0){
            //İlk önce son basamağı bulacağız.
            lastNumber = temp % 10;

            //Daha sonrasında bunu ters halini yazmak için basamak işlemi yapacağız.
            reverseNumber = (reverseNumber * 10) + lastNumber;

            //Sayımızın basamağını azaltmak için 10'a böleceğiz.
            temp /= 10;
        }

        if(number == reverseNumber){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.print(isPalindrom(2442));


    }
}