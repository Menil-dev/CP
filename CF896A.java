import java.util.Scanner;
public class CF896A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0< t--)
        {
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                sc.nextInt();
            }
            if(n%2==0)
            {
                System.out.println(2);
                System.out.println(1+" "+n);
                System.out.println(1+" "+n);
            }
            else
            {
                System.out.println(4);
                System.out.println(1+" "+(n-1));
                System.out.println(1+" "+(n-1));
                System.out.println((n-1)+" "+n);
                System.out.println((n-1)+" "+n);
            }
        }
    }
}
