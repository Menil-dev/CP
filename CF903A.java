import java.util.Scanner;
public class CF903A
{
    public static boolean check(String x, String s,int slen)
    {
        if(x.equals(s)) return true;
        int i=0; int j=slen;

        //System.out.println("x="+x+" s="+s);
        while(j<x.length() || i<x.length())
        {
            if(j>x.length()) j=x.length();
            if(x.substring(i,j).equals(s)) return true;
            if(j<x.length()) j++;
            i++;
        }
        return false;
    }
    public static int find(String x, String s, int xlen, int slen)
    {
        int count=0;
        StringBuilder x1=new StringBuilder(x);
        while(count<=5)
        {
            if(check(x1.toString(),s,slen)) return count;
            x1.append(x1);
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        String x,s;
        int xlen, slen;
        for(int i=0;i<testcases;i++)
        {
            xlen=sc.nextInt();
            slen=sc.nextInt();
            x=sc.next();
            s=sc.next();
            System.out.println(find(x,s,xlen,slen));
        }
    }
}
