import java.util.Scanner;
public class _5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "enter value of a: " );
        int a = sc.nextInt();
        System.out.println( "enter value of b: " );
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println( "a is  " + a);
        System.out.println( "b is  " + b);
    }
}