import java.util.Scanner;
import java.util.ArrayList;

public class CF873B {

    public static int GCD(int a, int b)
    {
        if(a==0) return b;
        return a>b?GCD(a%b,b):GCD(b%a,a);
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

            int temp;
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if(arr[i]==i+1) continue;
                temp=arr[i]-i-1>0?arr[i]-i-1:i+1-arr[i];
                list.add(temp);
            }

            int ans=list.get(0);
            for(int i=1;i<list.size();i++)
            {
                ans=GCD(list.get(i),ans);
            }
            System.out.println(ans);
        }
    }
}
