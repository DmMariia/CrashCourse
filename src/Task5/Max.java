package Task5;

public class Max {

    public static void main(String[] args) {
        int[] arr = {2, -5, 7, -4, 8, 2};
        int max = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        System.out.println(max);
    }
}

