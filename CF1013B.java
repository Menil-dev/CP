import java.util.Scanner;
import java.util.Arrays;
public class CF1013B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0<t--)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);

            int teams=0;
            int k;
            for(k=n-1;k>=n;k--)
            {
                if(arr[k]>=x) teams++;
                else break;
            }
            int j=k;
            for(k=k; k>=0;k--)
            {
                if(arr[k]*(j-k+1)>=x)
                {
                    teams++;
                    j=k-1;
                }
            }
            System.out.println(teams);
        }
    }
}
