package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberN2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");
        String str = br.readLine();
        StringBuffer sBf = new StringBuffer(str);
        sBf = sBf.reverse();

        System.out.println(sBf);
    }
}
