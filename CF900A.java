import java.util.*;
public class CF900A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        int t=sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            n=sc.nextInt();
            k=sc.nextInt();
            boolean flag=false;
            for(int j=0;j<n;j++)
            {
                if(sc.nextInt()==k) flag=true;
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
