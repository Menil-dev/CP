import java.util.Arrays;
import java.util.Scanner;
public class CFE141A
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0< t--)
        {
            int n=sc.nextInt();
            boolean flag=true;
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(i!=0 && arr[i]!=arr[i-1]) flag=false;
            }

            if(flag) System.out.println("NO");
            else
            {
                Arrays.sort(arr);
                System.out.println("YES");
                for(int i=0;i<(n+1)/2;i++)
                {
                    System.out.print(arr[i]+" ");
                    if(i!=n-1-i) System.out.print(arr[n-i-1]+" ");
                }
                System.out.println();
            }
        }
    }
}
