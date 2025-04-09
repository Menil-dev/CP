import java.util.Scanner;
public class CF1013C
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            int n=sc.nextInt();
            if(n%2==0) System.out.println(-1);
            else
            {
                for(int i=1;i<=n;i+=2)
                {
                    System.out.print(i+" ");
                }
                for(int i=2;i<n;i+=2)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}
