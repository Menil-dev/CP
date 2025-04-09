import java.util.Scanner;
public class CF1008A
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
            int n= sc.nextInt();;
            int k=sc.nextInt();
            double sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=sc.nextInt();
            }
            if(sum/n==k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
