package Task2;

import java.util.Scanner;

public class NumberN1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the numbers:");

        int n = s.nextInt();
        n = n * n;
        System.out.println(n);

        String str = String.valueOf(n);
        System.out.println("Tne number 3 is included in the notation: " + str.contains("3"));
    }
}
