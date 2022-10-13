import java.util.Scanner;

public class sumnnum
{
    public static void main(String[]args)
    {
        Scanner vp=new Scanner(System.in);
        System.out.println("Enter the no. you want");
        int n=vp.nextInt();
        int sum=0;
        for (int i=0;i<n;i++)
        {
     sum=sum+(2*i);
        }
        System.out.println(sum);
    }
}