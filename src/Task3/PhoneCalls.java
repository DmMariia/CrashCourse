package Task3;

import java.util.Scanner;

public class PhoneCalls {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers:");

        int c1 = s.nextInt();
        int t1 = s.nextInt();
        int c2 = s.nextInt();
        int t2 = s.nextInt();
        int c3 = s.nextInt();
        int t3 = s.nextInt();

        int a = c1*t1;
        int b = c2*t2;
        int c = c3*t3;

        System.out.println(a + b + c);
    }
}
