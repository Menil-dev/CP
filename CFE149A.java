import java.util.Scanner;
//import java.util.HashSet;
public class CFE149A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int n,k;
        while(0< t--)
        {
            n=sc.nextInt();
            k=sc.nextInt();

            if(n%k!=0)
            {
                System.out.println(1);
                System.out.println(n);
                continue;
            }
            for(int i=n-1;i>=1;i--)
            {
                if((n-i)%k !=0 && i%k!=0)
                {
                    System.out.println(2);
                    System.out.println(i+" "+(n-i)+" ");
                    break;
                }
            }
        }
    }
}
