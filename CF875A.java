import java.util.Scanner;
public class CF875A
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int temp;
        while(0< t--)
        {
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                temp=sc.nextInt();
                System.out.print((n+1-temp)+" ");
            }
            System.out.println();
        }
    }
}
