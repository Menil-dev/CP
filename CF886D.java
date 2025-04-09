import java.util.Scanner;
import java.util.Arrays;
public class CF886D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0< t--)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);
            //System.out.println(Arrays.toString(arr));
            int largest=0;
            int curr=1;
            for(int i=1; i<n;i++)
            {
                if(arr[i]-arr[i-1]>k)
                {
                    largest=largest>curr?largest:curr;
                    curr=1;
                }
                else curr++;
            }
            largest=largest>curr?largest:curr;
            //System.out.println(largest);
            System.out.println(n-largest);
        }
    }
}
