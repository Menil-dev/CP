import java.util.Scanner;
public class CF1006B
{
    public static long find(String s)
    {
        long n=0; long m=0;
        for(char c: s.toCharArray())
        {
            if(c=='-') n++;
            else m++;
        }
        return (n/2)*((n+1)/2)*m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n= sc.nextInt();
            String s=sc.next();
            System.out.println(find(s));
        }
    }
}
