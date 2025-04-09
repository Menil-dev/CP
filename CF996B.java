import java.util.Scanner;
import java.util.Arrays;
public class CF996B {

    public static boolean find(int[] need)
    {
        if(need[0]>=0) return true;
        int k=0; int n=need.length;
        while(k<n && need[k]<0)
        {
            k++;
            if(k>1) return false;
        }

        int z=1;
        while(need[0]==0) z++;
        if(need[0]*-1<=need[z]) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }

            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
            }

            int[] need=new int[n];
            for(int i=0;i<n;i++)
            {
                need[i]=a[i]-b[i];
            }
            if(find(need)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
