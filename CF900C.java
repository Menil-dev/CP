import java.util.Scanner;
public class CF900C
{
    public static boolean find(long n, long k, long x)
    {
        if(k==1 && n<x) return false;
        if(n==k)
        {
            return (n*(n+1)/2)==x;
        }
        if((k*(k+1))/2>x || (n*(n+1)/2)<x) return false;
        if(k%2==0)
        {
            if((2*(n-(x/k)-1)+1)*(x/k)+n>=x) return true;
            else return false;
        }
        else
        {
            if((2*(n-(x/k))+1)*(x/k)>=x) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0< t--)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long x=sc.nextLong();

            if(find(n,k,x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
