import java.util.Scanner;
public class CF1006
{
    public static int find(int n, int k, double p)
    {
        if(k<0) k*=-1;

        if(k>n*p) return -1;
        return (int)Math.ceil(k/p);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();
            System.out.println(find(n,k,p));

        }
    }
}
