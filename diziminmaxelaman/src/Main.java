public class Main {
    public static void main(String[] args) {

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0]; // İlk eleman değerine göre kontrol yapılacağı için listenin ilk elemanını atadık.
        int max = list[0];

        for(int i : list) {
            if(i < min) { // Eğer i. eleman list[0]'daki elemandan küçükse min değerine atıyoruz.
                min = i;
            }
            if(i > max) { // Eğer i. eleman list[0]'daki elemandan büyükse max değerine atıyoruz.
                max = i;
            }
        }
        System.out.println("Minimum Değer: " + min);
        System.out.println("Maximum Değer: " + max);
    }
}