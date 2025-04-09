import java.util.Arrays;
import java.util.Scanner;
public class CF1008
{
    public static  boolean isSq(long n)
    {
        double root=Math.sqrt(n);
        n=(int)root;
        return root==n;
    }
    public static void find(int n)
    {
        int[] arr=new int[n];

        if(n==1 || isSq(n*(n+1)/2))
        {
            System.out.println(-1); return;
        }

        int count=n; long sum=0;
        for(int i=0;i<n-1;i++)
        {
            sum+=count;
            //System.out.println("sum="+sum);
            if(isSq(sum))
            {
                arr[i+1]=count;
                arr[i]=--count; i++;
                sum=sum+count;
            }
            else {
                arr[i]=count;
            }
            count--;
        }
        if(arr[n-1]==0) arr[n-1]=1;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            find(n);
        }
    }
}
