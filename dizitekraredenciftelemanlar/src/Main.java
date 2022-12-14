
public class Main {
    public static void main(String[] args) {
        int[] list = {0, 2,3, 3, 4, 5, 7, 9, 11, 2, 6, 2, 88, 88, 7, 16, 21, 16, 17, 0};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list.length; j++) {
                if((i != j) && (list[i] % 2 == 0) && (list[i] == list[j])) {
                    if(!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for(int k : duplicate) {
            if(k != 0) {
                System.out.println(k);
            }
        }
    }
    static boolean isFind(int[] arr, int val) {
        for(int i : arr) {
            if(i == val) {
                return true;
            }
        }
        return false;
    }
}