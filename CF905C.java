import java.awt.*;
import java.util.Scanner;
public class CF905C
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();

            if(k==4)
            {
                int[] arr=new int[4];
                for(int i=0;i<n;i++)
                {
                    arr[sc.nextInt()%k]++;
                }

                if(arr[0]!=0 || arr[2]>=2) System.out.println(0);
                else if((arr[2]==1 && arr[1]>0) || arr[3]>=1) System.out.println(1);
                else System.out.println(2);
            }
            else {
                int temp;
                int min= Integer.MAX_VALUE;
                for(int i=0;i<n;i++)
                {
                    temp=sc.nextInt();
                    if(temp%k==0) min=0;
                    min=min>k-temp%k?k-temp%k:min;
                }
                System.out.println(min);
            }
        }
    }
}
