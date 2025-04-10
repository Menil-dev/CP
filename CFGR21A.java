import java.util.Scanner;
public class CFGR21A
{
    public static int find(int[] arr)
    {
       int i=0; int j=arr.length-1;
       while(i<arr.length-1 && arr[i]==0) i++;
       while(j>=0 && arr[j]==0) j--;

       if(j<i) return 0;
       while(i<j)
       {
           if(arr[i]==0) return 2;
           i++;
       }
       return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            int j=0; int ans=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(find(arr));
        }
    }
}
