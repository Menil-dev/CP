import java.util.Scanner;

public class CFE175A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        for(int i=0;i<testcases;i++)
        {
            long n=sc.nextLong();

            if(n<3)
            {
                System.out.println(n+1);
            }
            else
            {
                if(n%15<3)
                System.out.println(n/15*3+n%15+1);
                else
                    System.out.println((n+14)/15*3);
            }
        }
    }
}
