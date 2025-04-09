import java.util.Scanner;
public class CF879A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int n,a,b,ans;
        for(int i=0;i<t;i++)
        {
            ans=0; a=0; b=0;
            n=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                if(sc.nextInt()==-1) b++;
                else a++;
            }

            if(a<b)
            {
                ans+=(b-a+1)/2;
                b-=ans;
            }
            if(b%2==1) ans++;
            System.out.println(ans);
        }
    }
}
