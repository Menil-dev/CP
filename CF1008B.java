import java.util.Scanner;

public class CF1008B
{
    public static int find()
    {
        int ans=0;
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();

            if((k&1)==1)
            {
                for(int j=0;j<n-1;j++)
                {
                    System.out.print(n+" ");
                }
                System.out.println(n-1);
            }
            else
            {
                for(int j=0;j<n-2;j++)
                {
                    System.out.print(n-1+" ");
                }
                System.out.println((n)+" "+(n-1));
            }
        }
    }
}
