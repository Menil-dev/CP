import java.util.Scanner;
public class CF856B {
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
            int k=2;
            while(0<k--)
            {
                for(int i=1;i<n;i++)
                {
                    if(arr[i-1]==1) arr[i-1]++;
                    else if(arr[i]%arr[i-1]==0) arr[i]++;
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
