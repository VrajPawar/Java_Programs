import java.util.Scanner;

public class multitable
        {
    public static void main(String[]args)
    {
        Scanner vp=new Scanner(System.in);
        System.out.println("Enter the no. you want");
        int n=vp.nextInt();

        for (int i=10;i>=1;i--)
        {
            System.out.printf("%d X %d =%d \n",n,i,n*i);
        }

    }
}