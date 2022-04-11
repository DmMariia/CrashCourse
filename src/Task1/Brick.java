package Task1;

import java.util.Scanner;

public class Brick {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the numbers:");

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();

        if ((a < x) && (b < y)
                || (a < y) && (b < x)
                || (c < y) && (a < x)
                || (a < y) && (c < x)
                || (c < x) && (b < y)
                || (c < y) && (b < x)) {
            System.out.println("The brick will pass into the hole.");
        } else {
            System.out.println("The brick will not pass into the hole.");
        }
      }
    }