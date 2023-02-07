//write a program to count total number of vowels by using command line arguments.

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        int vowels = 0;
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length(); j++) {
                if (args[i].charAt(j) == 'a' || args[i].charAt(j) == 'e' || args[i].charAt(j) == 'i'
                        || args[i].charAt(j) == 'o' || args[i].charAt(j) == 'u') {
                    vowels++;
                }
            }
        }
        System.out.println("vowels hai " + vowels);
    }
}