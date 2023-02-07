// write a program to perform addition of integers passed by command line arguments.  

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
    }
}
