package Task5;

public class Min {

    public static void main(String[] args) {
        int[] arr = {2, -5, 7, -4, 8, 2};
        int min = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        }
        System.out.println(min);
    }
}

