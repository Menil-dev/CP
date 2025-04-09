import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class CF1013A
{
    public static boolean istrue(int[] arr)
    {
        //System.out.println(Arrays.toString(arr));
        if(arr[0]<3) return false;
        if(arr[1]<1) return false;
        if(arr[2]<2) return false;
        if(arr[3]<1) return false;
        if(arr[5]<1) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0<t--)
        {
            int n=sc.nextInt();
            int[] arr=new int[6];
            int temp;
            boolean flag=true;
            int ans=0;
            for(int i=0;i<n;i++)
            {
                temp=sc.nextInt();
                if(temp<6) arr[temp]++;

                if(flag && istrue(arr))
                {
                    ans=i+1; flag=false;
                }
            }
            System.out.println(ans);
        }
    }
}
