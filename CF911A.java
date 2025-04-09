import java.util.*;
public class CF911A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int testcase; int i; int j;
        testcase=sc.nextInt();  boolean flag;
        String s; int size; int sum,totalsum;
        for(i=0;i<testcase;i++)
        {
            size=sc.nextInt();
            s=sc.next();
            sum=0; totalsum=0; flag=true;
            for(j=0;j<size;j++)
            {
                if(s.charAt(j)=='.')
                {
                    sum++;
                }
                else {
                    totalsum+=sum;
                    sum=0;
                }
                if(sum>2)
                {
                    System.out.println(2); flag=false; break;
                }
            }
            totalsum+=sum;
            if(flag) System.out.println(totalsum);
        }
    }
}
