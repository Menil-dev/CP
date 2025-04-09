import java.util.Scanner;
public class CF902A
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum; int n;
        int j;
        for (int i = 0; i < t; i++)
        {
            n=sc.nextInt();
            sum=0;
            for(j=0;j<n-1;j++)
            {
                sum+=sc.nextInt();
            }
            System.out.println(sum*-1);
        }
    }
}
