import java.util.HashSet;
import java.util.Scanner;
public class CF787B {

    public static boolean isIncreasing(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<=arr[i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            if(isIncreasing(arr)) System.out.println(0);
            else
            {
                long ans=0;
                boolean flag=true;
                for(int i=arr.length-2;i>=0;i--)
                {
                    if(arr[i+1]==0)
                    {
                        System.out.println(-1); flag=false; break;
                    }
                    while(arr[i]>=arr[i+1])
                    {
                        arr[i]/=2; ans++;
                    }
                }
                if(flag) System.out.println(ans);
            }
        }
    }
}
