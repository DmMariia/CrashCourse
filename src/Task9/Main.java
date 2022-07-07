package Task9;

public class Main {

    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(div(15.3, 0));
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
