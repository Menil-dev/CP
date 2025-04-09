import java.util.Scanner;
import java.util.Arrays;
public class CF1008C
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int turn=-1;
            int sum=0;
            int[] arr=new int[2*n];
            for(int j=0;j<2*n;j++)
            {
                arr[j]=sc.nextInt();
            }

            Arrays.sort(arr);
            for(int j=0;j<2*n;j++)
            {
                sum+=(turn*arr[j]);
                turn*=-1;
            }

            System.out.print(sum*-1);
            for(int j=0;j<2*n;j++)
            {
                System.out.print(" "+arr[j]);
            }
            System.out.println();
        }
    }
}

