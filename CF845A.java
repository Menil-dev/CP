import java.util.Scanner;
import java.util.Scanner;

public class CF845A
{
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

            int ans=0; int curr=1;

            for(int i=1;i<n;i++)
            {
                if(arr[i]%2==arr[i-1]%2) curr++;
                else
                {
                    ans+=curr-1;
                    curr=1;
                }
            }
            ans+=curr-1;
            System.out.println(ans);
        }
    }
}
