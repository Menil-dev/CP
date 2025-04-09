import java.util.Scanner;
public class CFE146A
{
    public static boolean run(long n, long k)
    {
        if(k==1) return true;
        if(k%2==0 && n%2==1) return false;
        while(n>=0)
        {
            if(n%2==0) return true;
            n-=k;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long n,k;
        while(0<t--)
        {
            n=sc.nextLong();
            k=sc.nextLong();

            if(run(n,k)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
