import java.util.Scanner;

public class Array2D
{
    public static void main(String[]args)
    {
        int [][] flat;
        flat=new int[3][3];
        flat[0][0]=101;
        flat[0][1]=102;
        flat[0][2]=103;
        flat[1][0]=104;
        flat[1][1]=105;
        flat[1][2]=106;
        flat[2][0]=107;
        flat[2][1]=108;
        flat[2][2]=109;
        for (int i=0;i< flat.length;i++)
        {
            for (int j= 0;j<flat[i].length;j++)
            {

                    System.out.print(flat[i][j]);
                    System.out.print(" ");


            } System.out.println("");
        }
    }
}

















