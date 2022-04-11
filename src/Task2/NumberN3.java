package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberN3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");

        String str = br.readLine();
        StringBuilder sB = new StringBuilder(str);
        char first = sB.charAt(0);
        sB.setCharAt(0, sB.charAt(sB.length() - 1));
        sB.setCharAt(sB.length() - 1, first);

        System.out.println(sB);
    }
}
