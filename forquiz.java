import java.util.Scanner;

public class forquiz
{
    public static void main(String[] args)
    {
        Scanner vp = new Scanner(System.in);
        System.out.println("Enter the no. you want");
        int n = vp.nextInt();
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }

        }

    }
}


