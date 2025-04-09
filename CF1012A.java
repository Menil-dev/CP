import java.util.Scanner;
import java.util.Arrays;
public class CF1012A {

    public static boolean isValid(int[][] arr, int n, int m)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(arr[i][j]==1)
                {
                    int tempi=i;
                    int tempj=j;
                    boolean flag1=true;
                    boolean flag2=true;
                    while(tempj>=0)
                    {
                        if(arr[i][tempj--]==0)
                        {
                            flag1=false; break;
                        }
                    }
                    while(tempi>=0)
                    {
                        if(arr[tempi--][j]==0)
                        {
                            flag2= false;
                        }
                    }
                    if(!flag1 && !flag2) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0< t--)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();

            int[][] arr=new int[n][m];
            for(int i=0;i<n;i++)
            {
                String s=sc.next();
                char[] c=s.toCharArray();
                for(int j=0;j<m;j++)
                {
                    arr[i][j]=c[j]-'0';
                }
                //System.out.println(Arrays.toString(arr[i]));
            }
            if(isValid(arr,n,m)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
