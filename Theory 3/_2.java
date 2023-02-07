import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        int odd = 5, even = 5;
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even is " + even + "odd is " + odd);
    }
}