import java.util.*;
public class CF892A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {

            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
                max=max<arr[j]?arr[j]:max;
                min=min>arr[j]?arr[j]:min;
            }

            if(min==max) System.out.println(-1);
            else
            {
                int freq=0;
                for(int j=0;j<n;j++)
                {
                    if(arr[j]==max) freq++;
                }
                System.out.println(arr.length-freq+" "+freq);
                for(int j=0;j<n;j++)
                {
                    if(arr[j]!=max) System.out.print(arr[j]+" ");
                }
                System.out.println();
                for(int j=0;j<freq;j++)
                {
                    System.out.print(max+" ");
                }
                System.out.println("");
            }
        }
    }
}
