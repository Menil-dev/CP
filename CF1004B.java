import java.util.Scanner;

public class CF1004B
{
    public static boolean isPow(int x)
    {
        if(x<=0) return false;
        return Math.log10(x)%1==0;
    }
    public static boolean find(int x,int y)
    {
        return y-x==1 || (x%9==0 && y==1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        boolean[] result=new boolean[testcases];
        int size=0;
        int x,y;
        for(int i=0;i<testcases;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();

            if(find(x,y)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
