import java.util.Scanner;
import java.util.Arrays;
public class CF853A {

    public static int gcd(int a,int b)
    {
        if(a==0) return b;
        return gcd(a>b?a%b:b%a, a>b?b:a);
    }

    public static boolean find(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(gcd(arr[i],arr[j])<3) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); boolean flag;
        while(0<t--)
        {
            int n=sc.nextInt();
            flag=true;
            if(n==1)
            {
                if(1!=sc.nextInt()) System.out.println("NO");
                System.out.println("YES");
                continue;
            }
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            if(find(arr)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
