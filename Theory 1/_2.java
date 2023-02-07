import java.util.Scanner;
import java.lang.Math;
public class _2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "enter value of a: " );
        double a = sc.nextDouble();
        System.out.println( "enter value of b: " );
        double b = sc.nextDouble();
        System.out.println( "enter value of c: " );
        double c = sc.nextDouble();
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println( "area of triangle is  " + area);

    }
}
