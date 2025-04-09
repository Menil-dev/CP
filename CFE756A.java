import java.util.Scanner;
public class CFE756A {

    public static long compute(long n, long k)
    {
        long count=0;
        long temp;
        if(n%2==1)
        {
            n-=k;
            count++;
        }
        k--;
        if(n%k!=0) count+=n/k+1;
        else count+=n/k;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0< t--)
        {
            long n=sc.nextInt();
            long k=sc.nextInt();

            System.out.println(compute(n,k));
        }
    }
}
