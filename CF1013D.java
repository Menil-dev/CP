import java.util.Scanner;
public class CF1013D
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(0<t--)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();

            int z=(k+n-1)/n;
            System.out.println((z+m-z)/(m-z+1));
        }
    }
}
