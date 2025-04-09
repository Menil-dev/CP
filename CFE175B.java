import java.util.Scanner;
public class CFE175B
{
    public static long calculate(int x, long k, String s)
    {
        int sum=0; int count=0; boolean flag=true;
        for(char c: s.toCharArray())
        {
            if(c=='L') sum++;
            else sum--;

            count++;
            if(sum==0)
            {
                flag=false;
                break;
            }
        }
        if(flag) return 0;
        return k/count;
    }
    public static long find(int n, int x, long k,String s)
    {
        x*=-1; int sum=0;
        for(char c: s.toCharArray())
        {
            if(sum==x) return calculate(x,k,s)+1;
            else if(c=='L') sum--;
            else sum++;
            k--;
        }
        if(sum==x) return calculate(x,k,s)+1;
        return sum==x?1:0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            long k=sc.nextLong();
            String s= sc.next();
            System.out.println(find(n,x,k,s));
        }
    }
}
