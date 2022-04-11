package Task8;

public class Main {
    public static void main(String[] args) {
        int[] arr = {600, 750, 450, 370};
        descending(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }
    public static void descending(int[] arr){
        int n = arr.length;
        for(int i = n - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

    }
}
