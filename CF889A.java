import java.util.Scanner;
public class CF889A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0< t--)
        {
            long n=sc.nextLong();
            long ans=0;
            if(n%2==0)
            {
                ans+=2;
                int i=3;
                while(n%i==0)
                {
                    ans++; i++;
                }
                System.out.println(ans);
            }
            else
            {
                System.out.println(1);
            }
        }
    }
}
