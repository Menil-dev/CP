import java.util.Arrays;
import java.util.Scanner;
public class CFE149B
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int ans=0; int curr=1;
            char[] c=s.toCharArray();
            //System.out.println(Arrays.toString(c));
            for(int i=1;i<c.length;i++)
            {
                if(c[i]==c[i-1]) curr++;
                else {
                    ans=ans>curr?ans:curr;
                    curr=1;
                }
            }
            ans=ans>curr?ans:curr;
            System.out.println(ans+1);
        }
    }
}
