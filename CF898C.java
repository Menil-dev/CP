import java.util.*;
public class CF898C
{
    public static int min(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        return min;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int j,k; String s; int sum;
        for(int i=0;i<t;i++)
        {
            sum=0;
            for(j=0;j<10;j++)
            {
                s=sc.next();
                //System.out.println(s);
                for(k=0;k<10;k++)
                {
                  if(s.charAt(k)=='X') { sum+=min(j,k,9-j,9-k)+1; }
                }
                //System.out.println(sum);
            }
            System.out.println(sum);
        }
    }
}
