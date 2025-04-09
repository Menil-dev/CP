import java.util.Scanner;
public class CF862A
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0<t--)
        {
            int n=sc.nextInt();
            int result=0;
            for(int i=0;i<n;i++)
            {
                result^=sc.nextInt();
            }

            if(n%2==0)
            {
                if(result==0) System.out.println(0);
                else System.out.println(-1);
            }
            else {
                System.out.println(result);
            }
        }
    }
}
