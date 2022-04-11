package Task3;

import java.util.Scanner;

public class FlowerBed {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius:");

        double r = s.nextDouble();
        double perimeter = 2 * r * Math.PI;
        double area = Math.PI * r * r;
        System.out.println("P = " + perimeter);
        System.out.println("A = " + area);


    }
}
