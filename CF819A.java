import java.util.Scanner;
public class CF819A
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
             int minI=0; int maxI=0;
             for(int i=0;i<n;i++)
             {
                 minI=arr[minI]>arr[i]?i:minI;
                 maxI=arr[maxI]>=arr[i]?maxI:i;
             }

             if(minI==0 || maxI==arr.length-1) System.out.println(arr[maxI]-arr[minI]);
             else
             {
                 int max=Integer.MIN_VALUE;
                 for(int i=0;i<n-1;i++)
                 {
                     max=max>arr[i]-arr[i+1]?max:arr[i]-arr[i+1];
                 }
                 max=max>arr[arr.length-1]-arr[0]?max:arr[arr.length-1]-arr[0];
                 max=max>arr[maxI]-arr[0]?max:arr[maxI]-arr[0];
                 max=max>arr[arr.length-1]-arr[minI]?max:arr[arr.length-1]-arr[minI];
                 System.out.println(max);
             }
        }
    }
}
