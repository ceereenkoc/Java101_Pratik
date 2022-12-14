// Dizideki elemanların girilen sayıdan en küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();

        int[] newList = {15, 12, 788, 1, -1, -778, 2, 0, number}; // Girilen sayı ile yeni bir dizi oluşturdum.

        Arrays.sort(newList); // Listeyi Arrays.sort() ile küçükten büyüye sıraladım

        int x = Arrays.binarySearch(newList, number); // Arrays.binarySearch() ile girilen sayının indisine ulaştım.
        // Eğer sayı dizinin en küçük elamanı olursa kendisinden önce bir eleman olmaz.
        // Bu yüzden en küçük yakın bir sonraki, en büyük yakın ise iki sonraki eleman olur.
        if(x == 0){
            System.out.println("En yakın en küçük: " + newList[x+1]);
            System.out.println("En yakın en büyük: " + newList[x+2]);
        }
        // Eğer sayı dizinin en büyük elamanı olursa kendisinden sonra bir eleman olmaz.
        // Bu yüzden en büyük yakın bir önceki, en küçük yakın ise iki önceki eleman olur.
        else if ( x == newList.length-1) {
            System.out.println("En yakın en küçük: " + newList[x-1]);
            System.out.println("En yakın en büyük: " + newList[x-2]);
        }
        // Eğer indis 0 değilse kendisinden bir sonraki eleman en büyük yakın, bir önceki eleman ise en küçük yakın olur.
        else {
            System.out.println("En yakın en küçük: " + newList[x - 1]);
            System.out.println("En yakın en büyük: " + newList[x + 1]);
        }



    }
}