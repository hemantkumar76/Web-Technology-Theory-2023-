import java.util.Scanner;
public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (b*b) - (4*a*c);
        if(d>0){
            System.out.println("real and unequal");
        }
        else if(d==0){
            System.out.println("real and equal");
        }
        else{
            System.out.println("imaginary");
        }
    }
}