import java.math.BigInteger;
import java.util.*;
public class CF1016C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<b;i++)
            {
                sb.append(Integer.toString(a));
            }
            BigInteger c=new BigInteger(sb.toString());

            if(c.isProbablePrime(20)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
