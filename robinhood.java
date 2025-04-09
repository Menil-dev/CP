import java.util.*;
public class robinhood
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[] even=new boolean[n];
        for(int i=0;i<n;i++)
        {
            int m=sc.nextInt();
            int k=sc.nextInt();
            even[i]=m%4==1 || m%4==2;
            if(m>k){
                boolean temp=(n-k)%4==1 || (n-k)%4==2;
                even[i]=(even[i]^temp);
            }
        }
        for(boolean a:even)
        {
            if(!a) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
