// Harmonik Ortalama Formülü
// H. Ortalama = 1+ 1/2 + 1/3 +....

public class Main {
    public static void main(String[] args) {

        double[] list = {1.0, 2.0, 3.0, 4.0, 5.0};

        double harmonicseries = 0.0;
        for(int i = 0; i < list.length; i++) {
            harmonicseries += (1/list[i]);
        }
        System.out.println("Harmonik seri: " + harmonicseries);
        System.out.println("Harmonik ortalama: " +  + (list.length/harmonicseries));

    }
}