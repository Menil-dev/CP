import java.util.Scanner;
public class CF871A
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(0<t--)
        {
            int ans=0; int curr=0;
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                if(0==sc.nextInt())
                {
                    curr++;
                }
                else
                {
                    ans=ans>curr?ans:curr;
                    curr=0;
                }
            }
            ans=ans>curr?ans:curr;
            System.out.println(ans);
        }
    }
}
