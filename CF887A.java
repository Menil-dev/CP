import java.util.Scanner;
public class CF887A
{
    public static boolean isSorted(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }

            if(isSorted(arr))
            {
                int smj = 0;
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < n-1; j++)
                {
                    if(min> arr[j+1]-arr[j])
                    {
                        smj=j;
                        min=arr[j+1]-arr[j];
                    }
                }
                    long count=0;
                    count=(((long)arr[smj+1]-arr[smj])/(2))+1;
                    System.out.println(count);
            }
            else
            {
                System.out.println(0);
            }
        }
    }
}
