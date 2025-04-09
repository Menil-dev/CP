import java.util.Scanner;
public class CF1009A
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int l,r,d,u;
        for(int i=0;i<t;i++)
        {
            l= sc.nextInt();
            r= sc.nextInt();
            d=sc.nextInt();
            u=sc.nextInt();

            if(u==r && r==d && d==l) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
