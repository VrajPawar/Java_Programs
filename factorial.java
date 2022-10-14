import java.util.Scanner;
public class factorial
{
    public static void main(String[]args)
    {
        Scanner vp=new Scanner(System.in);
        System.out.println("Enter the no. you want");
        int n=vp.nextInt();
        int fact=1;
        for (int i=1;i<=n;i++)
        {
           fact*=i;
        }
        System.out.println(fact);
    }
}
//fact=n*n-1*n-2;