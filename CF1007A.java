import java.util.Scanner;
public class CF1007A
{
    public static boolean find(int n)
    {
        return n%3==1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if(find(n))
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}
