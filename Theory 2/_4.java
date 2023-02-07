import java.util.*;
class _4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("prime number");
                break;
            }
        }
        if(i==n)
        {
            System.out.println("primenumber");
        }
    }
}