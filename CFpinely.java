import java.util.Scanner;
public class CFpinely
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(0< t--)
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();

            if(a==b && n==b)
            {
                System.out.println("YES"); continue;
            }

            if(a+b>=n-1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
